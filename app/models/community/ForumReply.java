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
public class ForumReply extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private String content;
    @ManyToOne
    private User author;
    @ManyToOne
    private ForumPost forumPost;

    public ForumReply(){

    }
    public ForumReply(String content, User author, ForumPost forumPost){
        this.content = content;
        this.author = author;
        this.forumPost = forumPost;
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
    public void setForumPost(ForumPost forumPost){
        this.forumPost = forumPost;
    }

    public String getContent(){
        return this.content;
    }
    public User getAuthor(){
        return this.author;
    }
    public ForumPost getForumPost(){
        return this.forumPost;
    }

    public static final List<ForumReply> findAll() {      
        return ForumReply.find.all();
    }

    public static final Finder<Long, ForumReply> find = new Finder<>(ForumReply.class);

    public static List<ForumReply> findAll(String filter) {
        return ForumReply.find.query().where()
                        // name like filter value (surrounded by wildcards)
                        .ilike("author", "%" + filter + "%")
                        .orderBy("author asc")
                        .findList();
    }
    public static List<ForumReply> findFilter(Long postID, String filter) {
        return ForumReply.find.query().where()
                        // Only include products from the matching cat ID
                        // In this case search the ManyToMany relation
                        .eq("forumPost.id", postID)
                        // name like filter value (surrounded by wildcards)
                        .ilike("author", "%" + filter + "%")
                        .orderBy("author asc")
                        .findList();
    }
}