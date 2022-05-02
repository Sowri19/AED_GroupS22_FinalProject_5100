package model;

import java.util.ArrayList;
import java.util.List;

public class RS_Entertainment_ChoreographerORG extends RS_Organization {

    private List<RS_Entertainment_Choreographer> listOfChoreographer;

    public RS_Entertainment_ChoreographerORG(String name, String contact, String city) {
        super(name, contact, city);
        listOfChoreographer = new ArrayList<>();
    }
    
    public void addChoreographer(String name, String city, String user, String password1) {
        RS_Entertainment_Choreographer choreographer = new RS_Entertainment_Choreographer(name, city, user, password1);
        listOfChoreographer.add(choreographer);
    }
      public void deleteSupervisor(RS_Supervisor supr) {
     listOfSupervisor.remove(supr);
    }
  
}
