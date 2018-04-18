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
    private RegisteredUser registeredUser;
    public Log(){

    }
    
    
    public void addOrder(OrderItem price){
        Logger.debug("Price: "+price);
        shop.add(new ShopOrder(price));
        writeToFile();
        
        
    }
    public void writeToFile(){
        Logger.debug("hi: "+shop.get(0));
        File order1 = new File("public","files");
        File order = new File(order1, "purchases.txt");
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(order)))){
            out.println("Order Date\tOrder\tUser");
            for(ShopOrder orders : shop){
                out.print(orders);
            }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}