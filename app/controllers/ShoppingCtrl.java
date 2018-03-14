package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;


import models.users.*;
import models.products.*;
import models.shopping.*;


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
            //p.setStock(p.getStock()-1);
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
        
        RegisteredUser c = getCurrentUser();
        
        c.getBasket().removeItem(item);

            //item.getProduct().setStock(item.getProduct().getStock()+1);
            //item.getProduct().update();

        c.getBasket().update();
        
        return ok(basket.render(c));
    }

    @Transactional
    public Result emptyBasket() {
        
        RegisteredUser c = getCurrentUser();
        c.getBasket().removeAllItems();
        c.getBasket().update();
        
        return ok(basket.render(c));
    }

    @Transactional
    public Result placeOrder() {
        RegisteredUser c = getCurrentUser();
        Product p = new Product();
        RegisteredUser registeredUser = (RegisteredUser)User.getLoggedIn(session().get("email"));
        
        
        ShopOrder order = new ShopOrder();
        
       
        order.setRegisteredUser(c);
        
        
        order.setItems(c.getBasket().getBasketItems());
        for(OrderItem i: order.getItems()){
            if(p.getStock() >= 1){
                p.setStock(p.getStock()-1);
                OrderItem product = new OrderItem(p.getId(), p.getName(), p.getDescription(), p.getStock(), p.getPrice(), p.getPegi());
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
        
        
        return ok(orderConfirmed.render(c, order));
    }
    
   
    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render(getCurrentUser(), order));
    }

}