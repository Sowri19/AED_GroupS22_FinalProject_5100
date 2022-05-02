package model;

public class RS_Supervisor extends RS_Person {

    private String contact;

    public RS_Supervisor(String name,String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}
