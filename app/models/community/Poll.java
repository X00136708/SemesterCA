package models.community;
import models.community.*;
import models.users.*;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Poll extends Model {

    @Id 
    private Long id;
    
    @ManyToMany
    private List<PollItem> items;

    @OneToOne
    private Administrator admin;

    @ManyToMany
    private List<User> users;

    private static Finder<Long, Poll> finder = new Finder<>(Poll.class);

    Poll(List<PollItem> items, Administrator admin, List<User> users) {
        this.items = items;
        this.admin = admin;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public List<PollItem> getItems(){
    return items;
    }

    public Administrator getAdmin(){
        return admin;
    }

    public List<User> getUsers(){
        return users;
    }

    public void setItems(List<PollItem> items){
        this.items = items;
    }

    public void setAdmin(Administrator admin){
        this.admin = admin;
    }
    public boolean hasVoted(User user) {
        return users.contains(user);
    }

    public boolean addVote(String item, User user) {
        return false;
        
    }
    
    public static Finder<Long, Poll> getFinder() {
        return finder;
    }

    public static Poll getPoll(Long id) {
        return finder.ref(id);
    }
}