package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.util.Calendar;
import java.text.SimpleDateFormat;

import models.products.*;
import models.users.*;

// ShopOrder entity managed by Ebean
@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;
    
    private Calendar OrderDate;
    
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
        OrderDate = Calendar.getInstance();
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

    public Calendar getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        OrderDate = orderDate;
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
    public String getDateString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        OrderDate = Calendar.getInstance();
        return(dateFormat.format(OrderDate.getTime()));
    }

    public Double getTotal() {
        double totalPrice = 0;
        for(OrderItem o : items){
            totalPrice += o.getTotal();
        }
        return totalPrice;
    }

}