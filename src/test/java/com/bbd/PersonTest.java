package com.bbd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.bbd.*;

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
        assertEquals(HelenZille.getName(),"Helen Zille");
    }

    @Test
    public void testPersonAges() {
        assertEquals(HelenZille.getAge(),20);
    }

    @Test
    public void testPersonGender() {
        assertEquals(HelenZille.getGender(),"MALE");
    }

    @Test
    public void testPersonType() {
        assertEquals(HelenZille.getType(),PersonType.Politician);
    }



}