package com.bbd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.bbd.*;
import com.bbd.Person.Type;

public class PersonTest {

    private Person HelenZille;
    private Person JuliusMalema;
    private Person BarryRoux;


    @Before
    public void setUp() throws Exception {
        HelenZille = new Politician("Helen Zille",50,"FEMALE");
         JuliusMalema = new Politician("Julius Malema",50,"MALE");
          BarryRoux = new Lawyer("Berry  Malema",50,"MALE");

    }

    @Test
    public void testPersonNames() {
        assertEquals(HelenZille.getName(),"Helen Zille");
    }

    @Test
    public void testPersonAges() {
        assertEquals(HelenZille.getAge(),50);
    }

    @Test
    public void testPersonGender() {
        assertEquals(HelenZille.getGender(),"FEMALE");
    }

    @Test
    public void testPersonType() {
        assertEquals(HelenZille.getType(),Type.POLITICIAN);
    }

        @Test
    public void isAPolitician() {
        assertEquals(HelenZille instanceof Politician,true);
    }



}