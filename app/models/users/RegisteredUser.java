package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.shopping.*;

@Entity

// This is a user of type RegisteredUser
@DiscriminatorValue(value = "registeredUser")

// RegisteredUser inherits from the User class
public class RegisteredUser extends User{
	
	private String street1;
	private String street2;
    private String town;
    private String postCode;
    private String creditCard;
    private Float amount=0f;

    // RegisteredUser has one basket.
    // RegisteredUser is the owner (foreign key will be added to Basket
    // table). All changes to RegisteredUser are cascaded.
    @OneToOne(mappedBy="registeredUser", cascade = CascadeType.ALL)
    private Basket basket;

    // RegisteredUser can habe many ShopOrders.
    // RegisteredUser is the owner (forieng key will be added to Basket
    // table). All changes to RegisteredUser are cascaded
    @OneToMany(mappedBy="registeredUser", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;
	public RegisteredUser(String email, String name, String password){
        super(email,name,password);
        this.street1="";
        this.street2="";
        this.town="";
        this.postCode="";
        this.creditCard="";
        this.amount=0f;
    }
	public RegisteredUser(String email, String name, String password, String street1, String street2, String town, String postCode, String creditCard, Float amount)
	{
		super(email, name, password);
        this.street1 = street1;
        this.street2 = street2;
        this.town = town;
        this.postCode = postCode;
        this.creditCard = creditCard;
        this.amount=amount;
	}

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    public Float getWallet(){
        return this.amount;
    }
    public void setWallet(Float amount){
        this.amount=amount;
    }
    public void addWallet(Float amount){
        this.amount+=amount;
    }


    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }

}