package model;

public class RS_Event_Wedding extends RS_Organization {

   
    public static enum WeddingType {
        DELUXE(10000, "DELUXE", "SERVICES: All basic decoration, Gift card and AV equipment 1 for 150 guest"),
        PREMIUM(18000, "PREMIUM", "SERVICES: Classic decoration, customised wedding cake, Gift card and AV eqipment 1 for 300 guest"),
        ELITE(25000, "ELITE", "SERVICES: Photographer, Classic decoration, Gift card, Customised wedding Cake and AV eqipment 2 for 500 guest");

        private final int rate;
        private final String name;
        private final String description;

        private WeddingType(int rate, String name, String description) {
            this.rate = rate;
            this.name = name;
            this.description = description;
        }

        public int getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return getName() + " (" + description + ")";
        }
    }

    public RS_Event_Wedding(String name, String contact, String city) {
        super(name, contact, city);
    }

    public RS_Supervisor addSupervisor(String name, String city, String user, String password1) {
        RS_Supervisor supervisor = new RS_Supervisor(name, user, password1);
        listOfSupervisor.add(supervisor);
        System.out.println("size of manager in Event is " + listOfSupervisor.size() + " name is " + supervisor.getUsername());
        return supervisor;
    }
     public void deleteSupervisor(RS_Supervisor supr) {
        listOfSupervisor.remove(supr);
    }

}
