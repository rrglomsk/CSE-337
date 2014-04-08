package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;

@Entity
public class Manufacturer extends Model {
    @Id
    public Long id = 0L;

    @Constraints.Required
    public String name;

    public String street1;
    public String street2;
    public String city;
    public String state;
    public String zipcode;

    @Constraints.Email
    public String email;

    public String phone;

    /* Default finder */
    public static Finder<Long, Manufacturer> find = new Finder<Long, Manufacturer>(
            Long.class, Manufacturer.class
    );

    public static Manufacturer findById(int _id)
    {
        return find.where().eq("id", _id).findUnique();
    }
}

