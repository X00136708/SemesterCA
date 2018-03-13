package controllers;

import controllers.security.*;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


import models.users.*;
import models.products.*;
import views.html.productAdmin.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;


@Security.Authenticated(Secured.class)

@With(CheckIfAdmin.class)

public class AdminProductCtrl extends Controller {

    private FormFactory formFactory;
    private Environment e;
    
    @Inject
    public AdminProductCtrl(FormFactory f,Environment env) {
        this.formFactory = f;
        this.e = env;
    }
  
	private User getCurrentUser() {
		User u = User.getLoggedIn(session().get("email"));
		return u;
	}
    public Result index() {
        return redirect(controllers.routes.AdminProductCtrl.listProducts(0));
    }

    @Transactional
    public Result listProducts(Long cat) {
     
        List<Category> categories = Category.findAll();
        		
        List<Product> products = new ArrayList<Product>();
    
        if (cat == 0) {
            
            products = Product.findAll();
        }else {
            products = Category.find.ref(cat).getProducts();
        }

       
        return ok(listProducts.render(products, categories, getCurrentUser(),e));
    }

    @Transactional
    public Result addProduct() {
        Form<Product> addProductForm = formFactory.form(Product.class);
        return ok(addProduct.render(addProductForm, getCurrentUser()));
    }
    @Transactional
    public Result addProductSubmit() {
        Product newProduct;
        String saveImageMsg;
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if (newProductForm.hasErrors()) {
            return badRequest(addProduct.render(newProductForm, 
            getCurrentUser()));
        }
        else {
             newProduct = newProductForm.get();
        }
                newProduct.save();
                
                    for (Long cat : newProduct.getCatSelect()) {
                        newProduct.categories.add(Category.find.byId(cat));
                    }
                newProduct.update();
        }
        MultipartFormData data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");

        saveImageMsg = saveFile(newProduct.getId(), image);

        flash("success", "Product " + newProduct.getName() + " has been created/updated " + saveImageMsg);

        return redirect(controllers.routes.AdminProductCtrl.index());
    }
    
   
    @Transactional
    public Result deleteProduct(Long id) {
        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");
        
        return redirect(routes.AdminProductCtrl.index());
    }


    @Transactional
    public Result updateProduct(Long id) {
        Product p;
        Form<Product> productForm;

        try {
            p = Product.find.byId(id);
            productForm = formFactory.form(Product.class).fill(p);
        } 
        catch (Exception ex) {
            return badRequest("error");
        }
        return ok(updateProduct.render(id, productForm,getCurrentUser()));
    }

    @Transactional
   public Result updateProductSubmit(Long id) {
    String saveImageMsg;
        
         
                Form<Product> updateProductForm = formFactory.form(Product.class).bindFromRequest();
        
               
                if (updateProductForm.hasErrors()) {
             
                    return badRequest(updateProduct.render(id,updateProductForm, getCurrentUser()));
                } else {
                 
                    Product p = updateProductForm.get();
                    p.setId(id);                    
                   
                    List<Category> newCats = new ArrayList<Category>();
                    for (Long cat : p.getCatSelect()) {
                        newCats.add(Category.find.byId(cat));
                    }
                    p.categories = newCats;
                    
                    p.update();
        
                    MultipartFormData data = request().body().asMultipartFormData();
                    FilePart<File> image = data.getFile("upload");
        
                    saveImageMsg = saveFile(p.getId(), image);
        
                    flash("success", "Product " + p.getName() + " has been created/updated " + saveImageMsg);
                    
                    
                    return redirect(controllers.routes.AdminProductCtrl.index());
                }
            }

            

    public String saveFile(Long id, FilePart<File> uploaded) {
       
        if (uploaded != null) {
        
            String mimeType = uploaded.getContentType(); 
            if (mimeType.startsWith("image/")) {
             
                String fileName = uploaded.getFilename();                
               
                File file = uploaded.getFile();
              
                IMOperation op = new IMOperation();
               
                op.addImage(file.getAbsolutePath());
               
                op.resize(300, 200);
               
                op.addImage("public/images/productImages/" + id + ".jpg");
         
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.resize(60);
                thumb.addImage("public/images/productImages/thumbnails/" + id + ".jpg");
                
                File dir = new File("public/images/productImages/thumbnails/");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                
                ConvertCmd cmd = new ConvertCmd();
                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "/ no file";
    }
    public String saveFileOld(Long id, FilePart<File> uploaded) {
     
        String mimeType = uploaded.getContentType(); 
        if (uploaded != null) {
           
            if (mimeType.startsWith("image/")) {
               
                String fileName = uploaded.getFilename();      
                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i >= 0) {
                    extension = fileName.substring(i+1);
                }
            
                File file = uploaded.getFile();
                
                File dir = new File("public/images/productImages");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                
                if(file.renameTo(new File("public/images/productImages/", id + "." + extension))) {
                    return "/ file uploaded";
                } else {
                    return "/ file upload failed";
                }
            }
        }
        return "/ no file";
    }

    
}