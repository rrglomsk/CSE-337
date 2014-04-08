package models;

import play.db.ebean.Model;
import models.*;

import javax.persistence.*;

/**
 * Created by npatel on 4/7/14.
 */
@Entity
public class LineItem extends Model {
    @Id
    public Long id = 0L;

    @OneToOne
    public Product product = null;

    @ManyToOne
    public Cart cart;

    public int quantity = 1;

    /* Default finder */
    public static Finder<Long, LineItem> find = new Finder<Long, LineItem>(
            Long.class, LineItem.class
    );

    public LineItem(Product p)
    {
        product = p;
    }
}
