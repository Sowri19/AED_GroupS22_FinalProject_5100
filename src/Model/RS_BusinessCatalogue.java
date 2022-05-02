package model;

public class RS_BusinessCatalogue {

    protected String name;
    protected String contact;

    public RS_BusinessCatalogue() {
        
    }
    
    public RS_BusinessCatalogue(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String toString() {
        return name;
    }
}
