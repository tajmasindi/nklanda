package com.bbd;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testNumber1() {
        assertEquals(1, RomanConverter.Convert("I"));
    }

    @Test
    public void testNumber3() {
        assertEquals(3, RomanConverter.Convert("III"));
    }

    @Test
    public void testNumber4() {
        assertEquals(4, RomanConverter.Convert("IV"));
    }

    @Test
    public void testNumber8() {
        assertEquals(8, RomanConverter.Convert("VIII"));
    }

    @Test
    public void testNumber9() {
        assertEquals(9, RomanConverter.Convert("IX"));
    }

    @Test
    public void testNumber10() {
        assertEquals(10, RomanConverter.Convert("X"));
    }

    @Test
    public void testNumber20() {
        assertEquals(20, RomanConverter.Convert("XX"));
    }

    @Test
    public void testNumber40() {
        assertEquals(40, RomanConverter.Convert("XL"));
    }

    @Test
    public void testNumber70() {
        assertEquals(70, RomanConverter.Convert("LXX"));
    }

    @Test
    public void testNumber99() {
        assertEquals(99, RomanConverter.Convert("XCIX"));
    }

    @Test
    public void testNumber101() {
        assertEquals(101, RomanConverter.Convert("CI"));
    }

    @Test
    public void testNumber109() {
        assertEquals(109, RomanConverter.Convert("CIX"));
    }

    @Test
    public void testNumber333() {
        assertEquals(333, RomanConverter.Convert("CCCXXXIII"));
    }

    @Test
    public void testNumber661() {
        assertEquals(661, RomanConverter.Convert("DCLXI"));
    }

    @Test
    public void testNumber999() {
        assertEquals(999, RomanConverter.Convert("CMXCIX"));
    }

    @Test
    public void testNumber1543() {
        assertEquals(1543, RomanConverter.Convert("MDXLIII"));
    }

    @Test
    public void testNumber1733() {
        assertEquals(1733, RomanConverter.Convert("MDCCXXXIII"));
    }

    @Test
    public void testNumber2200() {
        assertEquals(2200, RomanConverter.Convert("MMCC"));
    }
    
    @Test
    public void testNumber3890() {
        assertEquals(3890, RomanConverter.Convert("MMMDCCCXC"));
    }

    
    @Test
    public void testNumber3999() {
        assertEquals(3999, RomanConverter.Convert("MMMCMXCIX"));
    }


    @Test
    public void testNumber9999() {
        assertNotEquals(9999, RomanConverter.Convert("MMMMMMMMMCMXCIX"));
    }
}
