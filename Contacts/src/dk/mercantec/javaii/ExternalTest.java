package dk.mercantec.javaii;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExternalTest {

    @Test
    public void testToString() throws Exception {

        External external = new External("UnitTestExternalName", "12345678", "unit@testmail.com", "UnitTesCompanyName");

        assertEquals(   "Must return the correctly constructed format based on the provided strings to the constructor.",
                        "Name: UnitTestExternalName\n" +
                        "Phone: 12345678\n" +
                        "Email: unit@testmail.com\n" +
                        "Company: UnitTesCompanyName", external.toString());

    }
}