import play.*;
import play.libs.*;

import java.util.*;

import com.avaje.ebean.*;

import models.*;

public class Global extends GlobalSettings {

    public void onStart(Application app) {
        InitialData.insert(app);
    }

    static class InitialData {

        public static void insert(Application app) {
            if(Ebean.find(User.class).findRowCount() == 0) {

                @SuppressWarnings("unchecked")
                Map<String,List<Object>> all = (Map<String,List<Object>>)Yaml.load("initialdata.yml");

                // Insert users first
                Ebean.save(all.get("users"));
                Ebean.save(all.get("categories"));
                Ebean.save(all.get("tasks"));

                System.out.println(all.get("users"));
              // System.out.println(all.get("tasks"));
            }
        }

    }
}
