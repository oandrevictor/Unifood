package com.example.unifood.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class University {
    private String id;
    private String name;
    private List<String> allCampus;

    public University() {
        this.id = UUID.randomUUID().toString();
        allCampus = new ArrayList<String>();
    }

    public University(String name) {
        this();
        this.name = name;

    }

    public boolean addCampus(String campus){
        if (campus != null) {
            return allCampus.add(campus);
        }

        return false;
    }

    public boolean removeCampus(String campus) {
        if (campus != null) {
            return allCampus.remove(campus);
        }

        return false;
    }

    public String getId(){return id;}

    public void setId(String id1){
        if (id1 != null) {
            this.id =id1;
        }
    }

    public String getName(){return name;}

    public void setName(String name1){
        if (name1 != null) {
            this.name = name1;
        }
    }

    public List<String> getAllCampus(){return allCampus;}

    public  void setAllCampus(List<String> allCampus1){
        if (allCampus1 != null) {
            this.allCampus = allCampus1;
        }
    }

}
