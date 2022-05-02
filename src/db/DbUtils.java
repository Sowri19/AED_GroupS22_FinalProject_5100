/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author sampathkorturti
 */
package db;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import model.RS_Administrator;

public class DbUtils {

    private static DbUtils dbUtils;

    private DbUtils() {

    }

    public static DbUtils getInstance() {
        if (dbUtils == null) {
            dbUtils = new DbUtils();
        }
        return dbUtils;
    }

    private ObjectContainer createConnection() {
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().activationDepth(Integer.MAX_VALUE);
        config.common().objectClass(RS_Administrator.class).updateDepth(Integer.MAX_VALUE);
        config.common().objectClass(RS_Administrator.class).cascadeOnUpdate(true);

        ObjectContainer db = Db4oEmbedded.openFile(config, "database/riverstone.db4o");
        return db;
    }

    public synchronized void storeSystem(RS_Administrator system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public RS_Administrator retrieveSystem() {
        try {
            ObjectContainer conn = createConnection();
            ObjectSet<RS_Administrator> systems = conn.query(RS_Administrator.class); // Change to the object you want to save
            RS_Administrator system;
            if (systems.isEmpty()) {
                system = RS_Administrator.createSystemAdmin();
            } else {
                system = systems.get(systems.size() - 1);
            }
            conn.close();
            return system;
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return null;
    }

}
