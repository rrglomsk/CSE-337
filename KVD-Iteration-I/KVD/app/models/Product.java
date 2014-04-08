package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;

/**
 * Created by npatel on 3/13/14.
 */
@Entity
public class Product extends Model {

    @Id
    public Long id = 0L;

    @Constraints.Required
    public String name;
    @Constraints.Required
    @Column(columnDefinition = "TEXT")
    public String description;
    public String image_url;
    public float price;
    public int rating;

    /* Default finder */
    public static Finder<Long, Product> find = new Finder<Long, Product>(
            Long.class, Product.class
    );
}

