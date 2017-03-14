package com.bbd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    private Person HelenZille;
    private Person JuliusMalema;
    private Person BarryRoux;


    @Before
    public void setUp() throws Exception {
        HelenZille = new Politician();
         JuliusMalema = new Politician();
          BarryRoux = new Lawyer();

    }

    @Test
    public void testPersonNames() {
        AssertEqual(HelenZille.getName(),"Helen Zille");

    }

    @Test
    public void testPersonAges() {
        AssertEqual(HelenZille.getAge(),20);
    }

    @Test
    public void testPersonGender() {
        AssertEqual(HelenZille.getGender(),"MALE");
    }

    @Test
    public void testPersonType() {
        AssertEqual(HelenZille.getType(),PersonType.Politician);
    }



}