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
    private Person MichaelHulley;
    private President JacobZuma;

    /*
        - Initialising all Person classes before we use them;
        - set the values for required classes
    */

    @Before
    public void setUp() throws Exception {
        HelenZille      = new Politician("Helen Zille", 66, "FEMALE");
        JuliusMalema    = new Politician("Julius Malema", 36, "MALE");
        BarryRoux       = new Lawyer("Barry Roux", 61, "MALE");
        BarryRoux       = new Lawyer("Barry Roux", 61, "MALE");
        MichaelHulley   = new Architect("Michael Hulley", 58, "MALE");
        JacobZuma       = new President("Jacob Zuma", 70, "MALE");
        
        JacobZuma.addAssociate(BarryRoux);
        JacobZuma.addAssociate(MichaelHulley);
    }

    /*
        - Test if we can getName method
    */

    @Test
    public void testPersonNames() {
        assertEquals(HelenZille.getName(), "Helen Zille");
        assertEquals(JuliusMalema.getName(), "Julius Malema");
        assertEquals(BarryRoux.getName(), "Barry Roux");

    }

    /*
        - Test if we can getAge method
    */
    @Test
    public void testPersonAges() {
        assertEquals(HelenZille.getAge(), 66);
        assertEquals(JuliusMalema.getAge(), 36);
        assertEquals(BarryRoux.getAge(), 61);
    }

    /*
        - Test if we can getGender method
    */
    @Test
    public void testPersonGender() {
        assertEquals(HelenZille.getGender(), "FEMALE");
        assertEquals(JuliusMalema.getGender(), "MALE");
        assertEquals(BarryRoux.getGender(), "MALE");
    }
    /*
         - Test if we can getType method
    */

    @Test
    public void testPersonType() {
        assertEquals(HelenZille.getType(), Type.POLITICIAN);
        assertEquals(JuliusMalema.getType(), Type.POLITICIAN);
        assertEquals(BarryRoux.getType(), Type.LAWYER);
        assertEquals(MichaelHulley.getType(),Type.ARCHITECT);
    }

    /*
       - Testing person instance of
    */
    @Test
    public void testInstanceOf() {
        assertEquals(HelenZille instanceof Politician, true);
        assertEquals(JuliusMalema instanceof Politician, true);
        assertEquals(BarryRoux instanceof Lawyer, true);
        
    }

    /*
        Checking if zuma list of Associates contains a Type.LAWYER
    */
    @Test public void testIfZumaHasALawyer(){        
         JacobZuma.associateInArray(Person.Type.LAWYER);  
    }

    /*
        Checking if zuma list of Associates contains a Type.ARCHITECT
    */
    @Test public void testIfZumaHasArchitech(){        
        assertTrue(JacobZuma.associateInArray(Person.Type.ARCHITECT));
              
    }
        /*
        Checking if zuma list of Associates contains a Type.LAWYER
    */
    @Test public void testIfZumaHasALawyerAndArchitec(){        
         assertTrue(JacobZuma.associateInArray(Person.Type.ARCHITECT) && JacobZuma.associateInArray(Person.Type.LAWYER));   
    }


}

