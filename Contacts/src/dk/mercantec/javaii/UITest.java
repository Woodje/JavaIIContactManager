package dk.mercantec.javaii;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class UITest {

    @Test
    public void testMainMenu() throws Exception {

        UI ui = new UI(new Contacts());

        Field privateField = Menu.class.getDeclaredField("items");

        privateField.setAccessible(true);

        ArrayList<Object> items = (ArrayList<Object>) privateField.get(ui.MainMenu());

        assertEquals("Should return a value of three menu items.", 3, items.size());

    }

    @Test
    public void testListContactsMenu() throws Exception {

        UI ui = new UI(new Contacts());

        Field privateField = Menu.class.getDeclaredField("items");

        privateField.setAccessible(true);

        ArrayList<Object> items = (ArrayList<Object>) privateField.get(ui.ListContactsMenu());

        assertEquals("Should return a value of one menu item.", 1, items.size());

    }

    @Test
    public void testAddContactsMenu() throws Exception {

        UI ui = new UI(new Contacts());

        Field privateField = Menu.class.getDeclaredField("items");

        privateField.setAccessible(true);

        ArrayList<Object> items = (ArrayList<Object>) privateField.get(ui.AddContactsMenu());

        assertEquals("Should return a value of three menu items.", 3, items.size());

    }

    @Test
    public void testAddExternalContact() throws Exception {
        
    }

    @Test
    public void testAddInternalContact() throws Exception {

    }
}