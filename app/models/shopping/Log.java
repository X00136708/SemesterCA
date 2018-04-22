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
import models.community.*;

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
    private boolean isCancellable;
    private RegisteredUser registeredUser;

    private int psp=0;
    private int ps4=0;
    private int ps3=0;
    public Log(){

    }
    
    
    public void addOrder(Long id, Timestamp date, String name, int quantity, double total, boolean isCancellable){
        this.id=id;
        this.name=name;
        this.date=date;
        this.quantity=quantity;
        this.total=total;
        this.isCancellable=isCancellable;
        shop.add( new ShopOrder(id,date,name,quantity,total,isCancellable));
        writeToFile();
        
        
    }
    public void addVote(String item){
        if(item.equals("PSP")){
            psp++;
            
        }
        else if(item.equals("PS4")){
            ps4++;
        }
        else if(item.equals("PS3")){
            ps3++;
        }
        writeToFileVote();
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
    public void writeToFileVote(){
        File vote1 = new File("public","files");
        File vote = new File(vote1, "votes.txt");
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(vote)))){
            out.println("Votes for ps4: "+ps4);
            out.println("votes for ps3: "+ps3);
            out.println("Votes for psp: "+psp);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}