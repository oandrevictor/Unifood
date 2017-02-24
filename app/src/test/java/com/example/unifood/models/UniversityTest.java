package com.example.unifood.models;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit tests for University model.
 *
 * Created by Rafaela Araújo on 23/02/2017.
 */
public class UniversityTest {

    private final String UNIVERSITY_NAME = "University A";
    private final String CAMPUS_NAME = "Restaurant";
    private final List<String> CAMPUS_LIST = new ArrayList() {{
        add("Campus A");
        add("Campus B");
        add("Campus C");}};

    @Test
    public void constructorTest() {
        University university = new University(UNIVERSITY_NAME);
        Assert.assertEquals(UNIVERSITY_NAME, university.getName());
    }

    @Test
    public void addGetCampusTest() {
        University uni = new University(UNIVERSITY_NAME);

        Assert.assertEquals(false, uni.addCampus(null));
        Assert.assertEquals(true, uni.addCampus(CAMPUS_NAME));
    }

    @Test
    public void removeCampusTest() {
        //TO-DO
    }

    @Test
    public void setCampusTest() {
        University uni = new University(UNIVERSITY_NAME);

        Assert.assertEquals(0, uni.getAllCampus().size());

        uni.setAllCampus(CAMPUS_LIST);

        Assert.assertEquals(3, uni.getAllCampus().size());
    }
}