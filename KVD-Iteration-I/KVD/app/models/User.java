package models;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import javax.persistence.*;

@Entity
public class User extends Model {
	@Constraints.Required
	@Constraints.Email
	public String email ; // Can be used for user id
	public String firstName;
	public String lastName;
	public String password;
	Role role = Role.Customer;
	
	// Role type enumeration
	public enum Role {
		Admin(1),
		Customer(2),
		Supplier(3);
		public final int id;
		Role(int id) {
			this.id = id;
		}
	}
	
	public static Finder<String,User> find = new Finder<String,User>(
		String.class, User.class
	);
		
	
	public static User authenticate(String _email,
	String _password) {
		return find.where().eq("email", _email).eq("password", _password).findUnique();
	}
	
	public static User findByEmail(String _email) {
		return find.where().eq("email", _email).findUnique();
	}
	
}
