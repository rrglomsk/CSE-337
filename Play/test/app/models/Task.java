package models;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Task extends Model {
	@Id
	public Long id;
	
	@Constraints.Required
	public String description;
	
	@Formats.DateTime(pattern="yyyy-MM-dd")
	public Date endDate;
	
	public static Finder<Long,Task> find = new Finder<Long,Task>(
		Long.class, Task.class
	);
}
