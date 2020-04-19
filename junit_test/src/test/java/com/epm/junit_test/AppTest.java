package com.epm.junit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    void testRemoveNoA() {
        ParseString parseString = new ParseString();
        String actual = parseString.modifyString("BBC");
        assertEquals("BBC", actual);
    }

    @Test
    void testRemove1stA() {
        ParseString parseString = new ParseString();
        String actual = parseString.modifyString("ABC");
        assertEquals("BC", actual);
    }

    @Test
    void testRemove2ndA() {
        ParseString parseString = new ParseString();
        String actual = parseString.modifyString("DAV");
        assertEquals("DV", actual);

    }

    @Test
    void testRemoveBothAs() {
        ParseString parseString = new ParseString();
        String actual = parseString.modifyString("AABC");
        assertEquals("BC", actual);

    }

    @Test
    void testRemoveOtherAs() {
        ParseString parseString = new ParseString();
        String actual = parseString.modifyString("BGAC");
        assertEquals("BGAC", actual);
    }
}
