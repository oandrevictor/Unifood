package com.example.unifood.models;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String id;
    private String name;
    private List<Campus> allCampus;

    public University() {
        this.name = "NO_NAME";
        allCampus = new ArrayList<Campus>();
    }

    public University(String id,String name) {
        this();
        this.name = name;
        this.id = id;
    }

    public boolean addCampus(Campus campus){
        if (campus!= null) {
            return allCampus.add(campus);
        }
        return false;
    }
    public String getId(){return id;}
    public void setId(String id1){this.id =id1;}
    public String getName(){return name;}
    public List<Campus> getAllCampus(){return allCampus;}
}
