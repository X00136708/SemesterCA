package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
//Specified mapped table name
@Table(name = "user")
//Map inherited class to a single table
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//Discriminator column used to define user type
@DiscriminatorColumn(name="role")
//The user type is user
public class User extends Model {
    @Id
    @Constraints.Required
    private String email;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String password;
    private String confirmPassword;

    
    public User() {
    }
        // Constructor to initialise object
    public  User(String email, String name, String password) {
            this.email = email;
            this.name = name;
            this.password = password;
        }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setName(String name) {
        this.name = name;
    }
 


    public void setPassword(String password) {
        this.password = password;
    }
    public boolean confirmPassword(String password, String confirm){
        if(password.equals(confirm)){
            return true;
        }else{
            return false;
        }
    }


  

    public static Finder<String, User> find = new Finder<String, User>(User.class);

    public static List<User> findAll() {
        return User.find.all();
    }

    public static User authenticate(String email, String password) {
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }

    public static User getLoggedIn(String id) {
        if (id == null) {
            return null;
        }
        else {
            return find.byId(id);
        }
    }

    

}