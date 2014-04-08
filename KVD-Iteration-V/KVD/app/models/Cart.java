package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by npatel on 4/7/14.
 */
@Entity
public class Cart extends Model {
    @Id
    public Long id = 0L;

    @Constraints.Required
    public String sessionId;

    @OneToOne
    public User user = null;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="cart")
    public List<LineItem> lineItems = new ArrayList<LineItem>();

    /* Default finder */
    public static Finder<Long, Cart> find = new Finder<Long, Cart>(Long.class, Cart.class);

    public Cart(String sId)
    {
        sessionId = sId;
    }
}
