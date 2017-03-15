package com.bbd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.bbd.*;

public class HomesteadTest {

    Nklandla nkandla_homestead;
    Person HelenZille;
    Person JuliusMalema;
    Person JacobZuma;
    Person BarryRoux;  
    Person MichaelHulley;

    @Before
    public void setUp() throws Exception {
        HelenZille      = new Politician("Helen Zille", 66, "FEMALE");
        JuliusMalema    = new Politician("Julius Malema", 36, "MALE");
        JacobZuma       = new President("Jacob Zuma", 70, "MALE");
        BarryRoux       = new Lawyer("Barry Roux", 61, "MALE");
        MichaelHulley   = new Architect("Michael Hulley", 58, "MALE");
        
        nkandla_homestead = new Nklandla("Nkandla", "Nkandla", "Western Cape", "ZA");

    }

    @Test
    public void testHomestead() {
        assertEquals(nkandla_homestead instanceof HomeStead, true);
    }

    @Test
    public void testPoliticianTypeHelenZille() {
        assertEquals(HelenZille.getType(), Person.Type.POLITICIAN);

    }

    @Test
    public void testPoliticianInstanceHelenZille() {
        assertEquals(HelenZille instanceof Politician, true);

    }

    @Test
    public void testPoliticianTypeJuliusMalema() {
        assertEquals(JuliusMalema.getType(), Person.Type.POLITICIAN);
    }

    @Test
    public void testPoliticianInstanceJuliusMalema() {
        assertEquals(JuliusMalema instanceof Politician, true);
    }

    @Test
    public void testPresidentTypeJacobZuma() {
        assertEquals(JacobZuma.getType(), Person.Type.PRESIDENT);

    }

    @Test
    public void testPresidentInstanceJacobZuma() {
        assertEquals(JacobZuma instanceof President, true);

    }

    @Test(expected = RuntimeException.class)
    public void testAcceptHZ() {
        nkandla_homestead.accept((Visitor) HelenZille);

    }

    @Test
    public void testJacob() {
        nkandla_homestead.accept((Visitor) JacobZuma);
    }
}