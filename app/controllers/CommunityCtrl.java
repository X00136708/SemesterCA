package controllers;
import controllers.security.*;
import controllers.ProductCtrl;
import models.community.*;
import models.*;
import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


import models.users.*;
import models.products.*;
import models.community.*;
import views.html.*;
import java.util.*;



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
    private RegisteredUser getCurrentRegisteredUser() {
		return (RegisteredUser)User.getLoggedIn(session().get("email"));
	}
    @Security.Authenticated(Secured.class)
    @With(CheckIfLoggedIn.class)
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
    public Result deletePost(Long id) {
        ForumPost.find.ref(id).delete();

        flash("success", "Post has been deleted");
        
        return redirect(controllers.routes.CommunityCtrl.forumPage(0, ""));
    }
    @Security.Authenticated(Secured.class)
    @With(CheckIfAdmin.class)
    @Transactional
    public Result deleteReply(Long id) {
        ForumReply.find.ref(id).delete();

        flash("success", "Reply has been deleted");
        
        return redirect(controllers.routes.CommunityCtrl.forumPage(0, ""));
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

    public Result addUser() {
            Form<User> userForm = formFactory.form(User.class);
           
            return ok(addUser.render(userForm, User.getLoggedIn(session().get("email"))));
        }
        public Result addUserSubmit() {
            RegisteredUser newUser;
            Form<RegisteredUser> newUserForm = formFactory.form(RegisteredUser.class).bindFromRequest();
    
            if (newUserForm.hasGlobalErrors()){
                flash("failure", "Error creating account");
                return badRequest(addUser.render(formFactory.form(User.class), User.getLoggedIn(session().get("email"))));
            }
            else {
                newUser = newUserForm.get();
                newUser.save();
            }
            flash("success", "User " + newUser.getName() + " has been created");
    
            return redirect(controllers.routes.CommunityCtrl.usersPage());
        }
        @Security.Authenticated(Secured.class)
        @With(CheckIfLoggedIn.class)
         public Result usersPage() {
            List<User> userList = User.findAll();
            return ok(usersPage.render(userList, User.getLoggedIn(session().get("email"))));
        }

        public Result createReview(Long prodId) {
            Form<ProductReview> createReviewForm = formFactory.form(ProductReview.class);
            return ok(createReview.render(createReviewForm, getCurrentUser(), prodId));
        }
        @Transactional
        public Result createReviewSubmit(Long prodId) {
            ProductReview newReview;
            Form<ProductReview> newReviewForm = formFactory.form(ProductReview.class).bindFromRequest();
    
            if (newReviewForm.hasErrors()) {
                return badRequest(createReview.render(newReviewForm, 
                getCurrentUser(), prodId));
            }
            else {
                 newReview = newReviewForm.get();
    
            
                    // Save the object to the Products table in the database
                    newReview.save();
    
                    Product p = Product.find.byId(prodId);
    
                    newReview.setAuthor(getCurrentUser());
                    newReview.setProduct(p);
                    p.getReviews().add(newReview);
    
                    p.update();
                    newReview.update();
                                    // Get category ids (checked boxes from form)
                        // Find category objects and set categories list for this product
    
            }
            flash("success", "Forum post has been created");
    
            return redirect(controllers.routes.ProductCtrl.productDetails(prodId));
        }
    @Security.Authenticated(Secured.class)
    @With(CheckIfAdmin.class)
    @Transactional
    public Result deleteReview(Long id) {
        Long prodId = ProductReview.find.ref(id).getProduct().getId();
        ProductReview.find.ref(id).delete();

        flash("success", "Review has been deleted");
        
        return redirect(controllers.routes.ProductCtrl.productDetails(prodId));
    }
        @Security.Authenticated(Secured.class)
    public Result vote() {
        DynamicForm form = formFactory.form().bindFromRequest();
        Poll poll = Poll.getPoll(Long.valueOf(form.get("pollId")));
        if (!poll.getUsers().contains(getCurrentUser())) {
            String i = form.get("item");
            PollItem item = PollItem.finder.ref(Long.valueOf(i));
            poll.getUsers().add(getCurrentUser());
            item.setVotes(item.getVotes()+1);
            item.save();
            poll.save();
            flash("success", "Thanks for voting for " + item.getItem());
        } else {
            flash("success", "Thanks for contributing, but you already voted.");
        }
        return redirect(routes.ProductCtrl.listProducts(0, ""));
    }
   
    public Result donate(){
        flash("success", "Thanks for donating! Your help is much appreciated");
        return redirect(routes.ProductCtrl.listProducts(0, ""));
    }

    
    @Transactional
    public Result updateUser(String id) {
        RegisteredUser u;
        Form<RegisteredUser> userForm;

        try {
            u = RegisteredUser.find.byId(id);
            userForm = formFactory.form(RegisteredUser.class).fill(u);
        } 
        catch (Exception ex) {
            return badRequest("error");
        }
        return ok(updateUser.render(id, userForm, getCurrentUser()));
    }

    public Result updateUserSubmit(String id) {
        Form<RegisteredUser> updateUserForm = formFactory.form(RegisteredUser.class).bindFromRequest();

        if (updateUserForm.hasErrors()) {
            
            return badRequest(updateUser.render(id,updateUserForm, getCurrentUser()));
        }   
        RegisteredUser u = updateUserForm.get();
            u.setEmail(id);
            u.update();    
            flash("success", "User " + u.getName() + " has been  updated ");
            
            // Redirect to the index page
            return redirect(controllers.routes.ProductCtrl.index());
    }

    @Transactional
    public Result myAccount() {
        return ok(myAccount.render(getCurrentRegisteredUser(), e));
    }

    @Security.Authenticated(Secured.class)
    @With(CheckIfAdmin.class)
    @Transactional
    public Result deleteUser(String id) {
    User.find.ref(id).delete();

    flash("success", "User has been deleted");
    
    return redirect(routes.CommunityCtrl.usersPage());
}


}