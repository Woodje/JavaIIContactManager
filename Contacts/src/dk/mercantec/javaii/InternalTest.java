package dk.mercantec.javaii;

import org.junit.Test;

import static org.junit.Assert.*;

public class InternalTest {

    @Test
    public void testToString() throws Exception {

        Internal internal = new Internal("UnitTestInternalName", "12345678", "unit@testmail.com", "UnitTestDepartmentName");

        assertEquals(   "Must return the correctly constructed format based on the provided strings to the constructor.",
                        "Name: UnitTestInternalName\n" +
                        "Phone: 12345678\n" +
                        "Email: unit@testmail.com\n" +
                        "Department: UnitTestDepartmentName", internal.toString());
    }
}