package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


import java.text.SimpleDateFormat;

import models.products.*;
import models.users.*;
import java.sql.Timestamp;
import play.Logger;
import java.io.*;
import io.ebean.*;

// ShopOrder entity managed by Ebean
@Entity

public class ShopOrder extends Model {
 
    @Id
    private Long id;
    private Timestamp OrderDate;
    private Timestamp OrderDate1;
    private String name;
    private int quantity;
    private double total;

    
    // Order contains may items.
    // mappedBy makes this side of the mapping the owner
    // so foreign key will be placed in resulting OrderItem table
    // All changes, including deletes will be cascaded
    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
    private List<OrderItem> items;
    
    @ManyToOne
    private RegisteredUser registeredUser;
   

    // Default constructor
      public  ShopOrder() {
        OrderDate = new Timestamp(System.currentTimeMillis());
    }
    public ShopOrder(Long id, Timestamp OrderDate, String name, int quantity, double total){
        this.id=id;
        this.OrderDate=OrderDate;
        this.name=name;
        this.quantity=quantity;
        this.total=total;
        // Ebean.save(this);
         
    }
    @Override
    public String toString(){
        return String.format("ID %d\t Order Date: "+OrderDate+"\t Name: %s\t Quantity: %d\t Order Total: %.2f   \t\t\t\t\t\t\t\t\t\t\t\t\t\t  ",id,name,quantity,total);
    }
    public double getOrderTotal() {
        
        double total = 0;
        
        for (OrderItem i: items) {
            total += i.getItemTotal();
        }
        return total;
    }
	
	//Generic query helper
    public static Finder<Long,ShopOrder> find = new Finder<Long,ShopOrder>(ShopOrder.class);

    //Find all Products in the database
    public static List<ShopOrder> findAll() {
        return ShopOrder.find.all();
    }

    public Long getId() {
        
        return id;
        
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.OrderDate = orderDate;
    }
    public Timestamp getOrderDate1() {
        return OrderDate1;
    }

    public void setOrderDate1(Timestamp orderDate) {
        this.OrderDate1 = orderDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public RegisteredUser getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(RegisteredUser registeredUser) {
        this.registeredUser = registeredUser;
    } 
    public static List<ShopOrder> findOrders(String userID) {
        return ShopOrder.find.query().where()
                        // Only include ShopOrder from the matching cat ID
                        // In this case search the ManyToMany relation
                        .eq("registeredUser.email", userID)
                        // name like filter value (surrounded by wildcards)
                        .orderBy("name asc")
                        .findList();
    }
    public Timestamp getDateString() {
        
        OrderDate1 = getOrderDate();
        return OrderDate;
    }
    public boolean isCancellable(){
        
        if((System.currentTimeMillis() - OrderDate.getTime()) > 86400000){//Time in a day
            
            return false;
        }
        else{
            return true;
        }
    }

    public Double getTotal() {
        double totalPrice = 0;
        for(OrderItem o : items){
            totalPrice += o.getTotal();
        }

        return totalPrice;
        
    }
    
   

}