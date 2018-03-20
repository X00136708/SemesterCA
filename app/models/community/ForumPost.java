package models.community;
import models.community.*;
import models.users.*;
import models.products.*;
import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class ForumPost extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private String title;
    @Constraints.Required
    private String content;
    @ManyToOne
    private User author;
    @ManyToOne
    private Product product;
    @OneToMany(cascade = CascadeType.ALL,mappedBy="forumPost")
    private List<ForumReply> replies;

    public ForumPost(){

    }
    public ForumPost(String title, String content, User author, Product product){
        this.title = title;
        this.content = content;
        this.author = author;
        this.product = product;
        this.replies = new ArrayList<ForumReply>();
    }

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return this.id;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setContent(String content){
        this.content = content;
    }
    public void setAuthor(User author){
        this.author = author;
    }
    public void setProduct(Product product){
        this.product = product;
    }
    public void setReplies(List<ForumReply> replies){
        this.replies = replies;
    }

    public String getTitle(){
        return this.title;
    }
    public String getContent(){
        return this.content;
    }
    public User getAuthor(){
        return this.author;
    }
    public Product getProduct(){
        return this.product;
    }
    public List<ForumReply> getReplies(){
        return this.replies;
    }

    public static final List<ForumPost> findAll() {      
        return ForumPost.find.all();
    }

    public static final Finder<Long, ForumPost> find = new Finder<>(ForumPost.class);

    public static List<ForumPost> findAll(String filter) {
        return ForumPost.find.query().where()
                        // name like filter value (surrounded by wildcards)
                        .ilike("title", "%" + filter + "%")
                        .orderBy("title asc")
                        .findList();
    }
    public static List<ForumPost> findFilter(Long prodID, String filter) {
        return ForumPost.find.query().where()
                        // Only include products from the matching cat ID
                        // In this case search the ManyToMany relation
                        .eq("product.id", prodID)
                        // name like filter value (surrounded by wildcards)
                        .ilike("name", "%" + filter + "%")
                        .orderBy("title asc")
                        .findList();
    }
}