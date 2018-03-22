package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.products.*;
import models.users.*;

@Entity
public class Wallet extends Model{
    @Id
    Long id;
    
    Double amount;

    public static Finder<Long,Wallet> find = new Finder<Long,Wallet>(Wallet.class);

    @OneToOne(cascade = CascadeType.PERSIST)
    private RegisteredUser registeredUser;

    public Wallet(){
        this.amount=0f;
    }
    public Wallet(Double amount){
        this.amount=amount;
    }
    public void setWallet(Double amount){
        this.amount=amount;
    }
    public Double getWallet(){
        return this.amount;
    }
    public void addWallet(Double amount){
        this.amount+=amount;
    }
    public RegisteredUser getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(RegisteredUser registeredUser) {
        this.registeredUser = registeredUser;
    }
   
}