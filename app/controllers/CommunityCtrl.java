package controllers;
import controllers.security.*;
import models.community.*;
import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


import models.users.*;
import models.products.*;
import views.html.*;




public class CommunityCtrl extends Controller {

    private FormFactory formFactory;
    private Environment e;
    
    @Inject
    public CommunityCtrl(FormFactory f,Environment env) {
        this.formFactory = f;
        this.e = env;
        }

    @Transactional
	public User getCurrentUser() {
		User u = User.getLoggedIn(session().get("email"));
		return u;
	}

    @Transactional
    public Result forumPage(Long prod, String filter) {
        // Get list of all categories in ascending order
        List<Product> products = Product.findAll();
        // Instantiate products, an Array list of products			
        List<ForumPost> posts = new ArrayList<ForumPost>();
    
        if (prod == 0) {
            // Get the list of ALL products with filter
            posts = ForumPost.findAll(filter);
        }
        else {
            // Get products for the selected category and filter (search field)
            posts = ForumPost.findFilter(prod, filter);
        }
        // Render the list products view, passing parameters
        // categories and products lists
        // category id - used for filtering
        // the filter string - this will be displayed in the filter text input
        // current user - if one is logged in
        return ok(forumPage.render(posts,products, prod, filter, getCurrentUser(),e));
    }

    public Result viewPost(Long id) {
        ForumPost p;

        p = ForumPost.find.byId(id);

        return ok(viewPost.render(p,User.getLoggedIn(session().get("email")),e));
    }    
    @Transactional
    public Result createPost() {
        Form<ForumPost> createPostForm = formFactory.form(ForumPost.class);
        return ok(createPost.render(createPostForm, getCurrentUser()));
    }
    @Transactional
    public Result createPostSubmit() {
        ForumPost newPost;
        Form<ForumPost> newPostForm = formFactory.form(ForumPost.class).bindFromRequest();

        if (newPostForm.hasErrors()) {
            return badRequest(createPost.render(newPostForm, 
            getCurrentUser()));
        }
        else {
             newPost = newPostForm.get();

        
                // Save the object to the Products table in the database
                
                newPost.save();
                newPost.setAuthor(getCurrentUser());
                newPost.update();
                                // Get category ids (checked boxes from form)
                    // Find category objects and set categories list for this product

        }
        flash("success", "Forum post has been created");

        return redirect(controllers.routes.CommunityCtrl.viewPost(newPost.getId()));
    }

    @Security.Authenticated(Secured.class)
    @With(CheckIfAdmin.class)
    @Transactional
    public Result deleteProduct(Long id) {
        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");
        
        return redirect(routes.AdminProductCtrl.index());
    }
    public Result createReply(Long postId) {
        Form<ForumReply> createReplyForm = formFactory.form(ForumReply.class);
        return ok(createReply.render(createReplyForm, getCurrentUser(), postId));
    }
    @Transactional
    public Result createReplySubmit(Long postId) {
        ForumReply newReply;
        Form<ForumReply> newReplyForm = formFactory.form(ForumReply.class).bindFromRequest();

        if (newReplyForm.hasErrors()) {
            return badRequest(createReply.render(newReplyForm, 
            getCurrentUser(), postId));
        }
        else {
             newReply = newReplyForm.get();

        
                // Save the object to the Products table in the database
                newReply.save();

                ForumPost p = ForumPost.find.byId(postId);

                newReply.setAuthor(getCurrentUser());
                newReply.setForumPost(p);
                p.getReplies().add(newReply);

                p.update();
                newReply.update();
                                // Get category ids (checked boxes from form)
                    // Find category objects and set categories list for this product

        }
        flash("success", "Forum post has been created");

        return redirect(controllers.routes.CommunityCtrl.viewPost(newReply.getForumPost().getId()));
    }
}