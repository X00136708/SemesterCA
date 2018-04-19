package models.shopping;
import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.products.*;
import models.users.*;
import java.io.*;
import java.sql.Timestamp;
import play.Logger;

public class Log {
    ArrayList<ShopOrder> shop = new ArrayList<>();
    ArrayList<OrderItem> i = new ArrayList<>();
    ShopOrder s = new ShopOrder();
    private Long id;
    Timestamp date;
    private String name;
    private double price;
    private int quantity;
    private double total;
    private RegisteredUser registeredUser;
    public Log(){

    }
    
    
    public void addOrder(Long id, Timestamp date, String name, int quantity, double total){
        this.id=id;
        this.name=name;
        this.date=date;
        this.quantity=quantity;
        this.total=total;
        shop.add( new ShopOrder(id,date,name,quantity,total));
        writeToFile();
        
        
    }
    public void writeToFile(){
        
        File order1 = new File("public","files");
        File order = new File(order1, "orderLine.txt");
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(order)))){
            
            for(ShopOrder orders: shop){
                
                out.println(shop);
                
                out.close();
                
            }
            
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}