package com.example.unifood.models;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit tests for University model.
 *
 * Created by Rafaela Araújo on 23/02/2017.
 */
public class UniversityTest {

    private final String UNIVERSITY_ID = "451";
    private final String NEW_UNIVERSITY_NAME = "University B";
    private final String UNIVERSITY_NAME = "University A";
    private final String CAMPUS_NAME = "Restaurant";
    private final List<String> CAMPUS_LIST = new ArrayList() {{
        add("Campus A");
        add("Campus B");
        add("Campus C");}};

    private University university;

    @Before
    public void setUp() {
        university = new University(UNIVERSITY_NAME);
    }

    @Test
    public void addRemoveGetCampusTest() {
        Assert.assertEquals(false, university.addCampus(null));
        Assert.assertEquals(true, university.addCampus(CAMPUS_NAME));

        Assert.assertEquals(false, university.removeCampus(null));
        Assert.assertEquals(true, university.removeCampus(CAMPUS_NAME));
    }

    @Test
    public void getSetInfoTest() {
        Assert.assertEquals(UNIVERSITY_NAME, university.getName());

        university.setName(NEW_UNIVERSITY_NAME);
        Assert.assertEquals(NEW_UNIVERSITY_NAME, university.getName());

        Assert.assertNotNull(university.getId());
        university.setId(UNIVERSITY_ID);
        Assert.assertEquals(UNIVERSITY_ID, university.getId());
    }

    @Test
    public void setCampusTest() {
        University uni = new University(UNIVERSITY_NAME);

        Assert.assertEquals(0, uni.getAllCampus().size());

        uni.setAllCampus(CAMPUS_LIST);

        Assert.assertEquals(3, uni.getAllCampus().size());
    }
}