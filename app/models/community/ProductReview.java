package models.community;
import models.users.*;
import models.products.*;
import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class ProductReview extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private String content;
    @ManyToOne
    private User author;
    @ManyToOne
    private Product product;

    public ProductReview(){

    }
    public ProductReview(String content, User author, Product product){
        this.content = content;
        this.author = author;
        this.product = product;
    }

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return this.id;
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
    public String getContent(){
        return this.content;
    }
    public User getAuthor(){
        return this.author;
    }
    public Product getProduct(){
        return this.product;
    }
    

    public static final List<ProductReview> findAll() {      
        return ProductReview.find.all();
    }
    public static final Finder<Long, ProductReview> find = new Finder<>(ProductReview.class);

    public static List<ProductReview> findAll(String filter) {
        return ProductReview.find.query().where()
                        // name like filter value (surrounded by wildcards)
                        .ilike("author", "%" + filter + "%")
                        .orderBy("author asc")
                        .findList();
    }
    public static List<ProductReview> findFilter(Long reviewID, String filter) {
        return ProductReview.find.query().where()
                        // Only include products from the matching cat ID
                        // In this case search the ManyToMany relation
                        .eq("product.id", reviewID)
                        // name like filter value (surrounded by wildcards)
                        .ilike("author", "%" + filter + "%")
                        .orderBy("author asc")
                        .findList();
    }

}

