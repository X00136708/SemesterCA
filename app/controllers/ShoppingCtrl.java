package controllers;
import java.util.*;
import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;


import models.users.*;
import models.products.*;
import models.shopping.*;
import java.sql.Timestamp;
import play.Logger;


import controllers.security.*;


@Security.Authenticated(Secured.class)

@With(CheckIfRegisteredUser.class)

public class ShoppingCtrl extends Controller {



    private FormFactory formFactory;

   
    private Environment env;

    
    @Inject
    public ShoppingCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }


    
   
	private RegisteredUser getCurrentUser() {
		return (RegisteredUser)User.getLoggedIn(session().get("email"));
	}

    @Transactional
    public Result showBasket() {
        return ok(basket.render(getCurrentUser()));
    }
    
    
    @Transactional
    public Result addToBasket(Long id) {
        
       
        Product p = Product.find.byId(id);
        
       
        RegisteredUser registeredUser = (RegisteredUser)User.getLoggedIn(session().get("email"));
        
        
        if (registeredUser.getBasket() == null) {
            
            registeredUser.setBasket(new Basket());
            registeredUser.getBasket().setRegisteredUser(registeredUser);
            registeredUser.update();
        }
        
        
        
        
        if(p.getStock() >= 1){
            registeredUser.getBasket().addProduct(p);
            p.update();
            registeredUser.update();
        } else {
            flash("failure", "Product " + p.getName() + " is out of stock!");
        }

             
        return ok(basket.render(registeredUser));
    }
    
   
    @Transactional
    public Result addOne(Long itemId) {
        
        
        OrderItem item = OrderItem.find.byId(itemId);
      

        if(item.getProduct().getStock() >= 1){
            item.increaseQty();
            
        } else {
            flash("failure", "Product " + item.getProduct().getName() + " is out of stock!");
        }

        item.update();
        
        return redirect(routes.ShoppingCtrl.showBasket());
    }

    @Transactional
    public Result removeOne(Long itemId) {
        
       
        OrderItem item = OrderItem.find.byId(itemId);
        
        RegisteredUser ru = getCurrentUser();
        
        ru.getBasket().removeItem(item);

            

        ru.getBasket().update();
        
        return ok(basket.render(ru));
    }

    @Transactional
    public Result emptyBasket() {
        
        RegisteredUser ru = getCurrentUser();
        ru.getBasket().removeAllItems();
        ru.getBasket().update();
        return ok(basket.render(ru));
        
    }

       @Transactional
    public Result placeOrder() {
        RegisteredUser c = getCurrentUser();
        RegisteredUser ru = getCurrentUser();
        ru.getBasket().decStock();
        RegisteredUser registeredUser = (RegisteredUser)User.getLoggedIn(session().get("email"));
        
        
        ShopOrder order = new ShopOrder();
        
       
        order.setRegisteredUser(c);
        
        order.getOrderDate().setTime(System.currentTimeMillis());
         Logger.debug("shit: " + System.currentTimeMillis() + "yea : " + order.getOrderDate() + "");
        


        
        
        
        for(OrderItem i: c.getBasket().getBasketItems()){
            Product p = i.getProduct();
            OrderItem product = new OrderItem(p, i.getQuantity());
            order.getItems().add(product);
        }

        for(OrderItem i: order.getItems()){
            Product p = i.getProduct();
            if(p.getStock() >= p.getStock()-i.getQuantity()){
                
                p.update();
                registeredUser.update();
            } else {
                flash("failure", "Product " + p.getName() + " is out of stock!");
            }
        }
        
        order.save();
       
       
        for (OrderItem i: order.getItems()) {
            
            i.setOrder(order);
            
            i.setBasket(null);
            
            i.update();

           

            

        }
        
     
      
        
        
        order.update();
        
        
        emptyBasket();
        c.getBasket().update();
          
        return ok(orderConfirmed.render(c, order));
    }
    
   
 
     @Transactional 
     public Result confirmPurchase(){
        RegisteredUser registeredUser = (RegisteredUser)User.getLoggedIn(session().get("email"));
        return ok(checkout.render(registeredUser));
        
     }
     @Transactional
     public Result addToWallet(Float amount){
         Wallet w = new Wallet();
         RegisteredUser ru = getCurrentUser();
        User u = new User();
        Form<Wallet> addWalletForm = formFactory.form(Wallet.class);
        return ok(addToWallet.render(amount,ru,w,u,addWalletForm));
     }
     @Transactional
     public Result addToWalletSubmit(Float amount){
        RegisteredUser ru = getCurrentUser();
        Wallet w = new Wallet();
        User u = new User();
        Form<Wallet> addWalletForm = formFactory.form(Wallet.class);
        
        return ok(addToWallet.render(amount,ru,w,u,addWalletForm));
     }

    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render(getCurrentUser(), order));
    }

    @Transactional
    public Result viewOrders(String id) {
        List<ShopOrder> orderList = ShopOrder.findOrders(id);
        return ok(viewOrders.render(getCurrentUser(), orderList));
    }

    @Transactional
    public Result cancelOrder(Long id) {
        
        ShopOrder shopping = ShopOrder.find.ref(id);
        for(OrderItem o : shopping.getItems()){
            o.getProduct().setStock(o.getProduct().getStock() + o.getQuantity());
            o.getProduct().update();
        }
        ShopOrder.find.ref(id).delete();
        flash("success","Your order has been cancelled");

        return redirect(routes.ShoppingCtrl.viewOrders(getCurrentUser().getEmail()));
    }
    


}
// @for(p<-products) {
//     <div class="col-md-6">
//         <p class="text-right">
//             <a href="@routes.ShoppingCtrl.viewOrder(p.getId)" class="btn btn-cancel btn-sm">
//             <span class="glyphicons-shopping-cart"></span> Back to cart</a>
            
//         </p>
//     </div>
// }
