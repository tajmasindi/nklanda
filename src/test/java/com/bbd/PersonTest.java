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
        HelenZille = new Politician("Helen Zille", 66, "FEMALE");
        JuliusMalema = new Politician("Julius Malema", 36, "MALE");
        BarryRoux = new Lawyer("Barry Roux", 61, "MALE");
    }

    @Test
    public void testPersonNames() {
        assertEquals(HelenZille.getName(), "Helen Zille");
        assertEquals(JuliusMalema.getName(), "Julius Malema");
        assertEquals(BarryRoux.getName(), "Barry Roux");

    }

    @Test
    public void testPersonAges() {
        assertEquals(HelenZille.getAge(), 66);
        assertEquals(JuliusMalema.getAge(), 36);
        assertEquals(BarryRoux.getAge(), 61);
    }

    @Test
    public void testPersonGender() {
        assertEquals(HelenZille.getGender(), "FEMALE");
        assertEquals(JuliusMalema.getGender(), "MALE");
        assertEquals(BarryRoux.getGender(), "MALE");
    }

    @Test
    public void testPersonType() {
        assertEquals(HelenZille.getType(), Type.POLITICIAN);
        assertEquals(JuliusMalema.getType(), Type.POLITICIAN);
        assertEquals(BarryRoux.getType(), Type.LAWYER);
    }

    @Test
    public void testInstanceOf() {
        assertEquals(HelenZille instanceof Politician, true);
        assertEquals(JuliusMalema instanceof Politician, true);
        assertEquals(BarryRoux instanceof Lawyer, true);
    }
}