package models.community;

import io.ebean.*;
import javax.persistence.*;

@Entity
public class PollItem extends Model {

    @Id
    private Long id;
    private String item;
    private Integer votes;

    public static Finder<Long, PollItem> finder = new Finder<>(PollItem.class);

    public PollItem(String item) {
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}