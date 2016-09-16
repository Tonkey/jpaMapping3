package test;

import java.util.HashMap;
import javax.persistence.Persistence;

/**
 *
 * @author nickl
 */
public class Structure {
    
    public static void main(String[] args) {
        HashMap<String, Object> puproperties = new HashMap<>();

        puproperties.put("javax.persistence.schema-generation.database.action", "drop-and-create");
        puproperties.put("javax.persistence.sql-load-source", "scripts/clearDB.sql");
        
//        Persistence.generateSchema("", puproperties);
        
        Persistence.generateSchema("jpaM_PU", null);
        
    }
    
}
