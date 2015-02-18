package dk.mercantec.javaii;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContactsTest {

    @Test
    public void testGetContacts() throws Exception {

        Contacts contacts = new Contacts();

        assertNotNull("Should not return a null, should be instantiated by now.", contacts.getContacts());

    }

    @Test
    public void testAddInternalContact() throws Exception {

        Contacts contacts = new Contacts();

        contacts.AddInternalContact("UnitTestInternalName", "12345678", "unit@testmail.com", "UnitTestDepartmentName");

        assertEquals("Should return a value of one added contact.", 1, contacts.getContacts().size());

    }

    @Test
    public void testAddExternalContact() throws Exception {

        Contacts contacts = new Contacts();

        contacts.AddExternalContact("UnitTestExternalName", "12345678", "unit@testmail.com", "UnitTestCompanyName");

        assertEquals("Should return a value of one added contact.", 1, contacts.getContacts().size());

    }
}