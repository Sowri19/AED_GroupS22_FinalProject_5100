
package model;

import java.util.ArrayList;
import java.util.List;

public class RS_TourGuideService {

    private String name;
    private String city;
    private String password;
    private String username;

    List<RS_Catering_Order> list = new ArrayList<>();

    public RS_TourGuideService(String name, String city, String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
