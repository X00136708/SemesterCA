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
    
    Float amount;

    @OneToOne
    private RegisteredUser registeredUser;

    public Wallet(){
        this.amount=0f;
    }
    public Wallet(Float amount){
        this.amount=amount;
    }
    public void setWallet(Float amount){
        this.amount=amount;
    }
    public Float getWallet(){
        return this.amount;
    }
    public void addWallet(Float amount){
        this.amount+=amount;
    }
    public RegisteredUser getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(RegisteredUser registeredUser) {
        this.registeredUser = registeredUser;
    }
    public void setAmount(Float amount) {
        this.amount=amount;
    }
}