import play.*;
import play.libs.*;
import com.avaje.ebean.Ebean;
import models.*;
import java.util.*;

public class Global extends GlobalSettings {
    @Override
    public void onStart(Application app) {
        // Check if the database is empty
        Map<String,List<Object>> all = (Map<String,List<Object>>)Yaml.load("db/seed.yml");
        if (Product.find.findRowCount() == 0) {
            Ebean.save(all.get("products"));
        }
    }
}
