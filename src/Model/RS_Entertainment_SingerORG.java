package model;

import java.util.ArrayList;
import java.util.List;

public class RS_Entertainment_SingerORG extends RS_Organization {

    private List<RS_Entertainment_Singer> listOfSinger;

    public RS_Entertainment_SingerORG(String name, String contact, String city) {
        super(name, contact, city);
        listOfSinger = new ArrayList<>();
    }

    public List<RS_Entertainment_Singer> getListOfSinger() {
        return listOfSinger;
    }

    public void setListOfSinger(List<RS_Entertainment_Singer> listOfSinger) {
        this.listOfSinger = listOfSinger;
    }

    public void addSinger(String name, String city, String user, String password1) {
        RS_Entertainment_Singer singer = new RS_Entertainment_Singer(name, city, user, password1);
        listOfSinger.add(singer);
    }

    public void deleteSupervisor(RS_Supervisor supr) {
        listOfSupervisor.remove(supr);
    }

}
