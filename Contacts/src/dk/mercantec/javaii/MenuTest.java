package dk.mercantec.javaii;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void testAdd() throws Exception {

        Menu menu = new Menu();

        Field privateField = Menu.class.getDeclaredField("items");

        privateField.setAccessible(true);

        ArrayList<Object> items = (ArrayList<Object>) privateField.get(menu);

        menu.Add("UnitTestMenuName", new MenuCallback() {
            @Override
            public void Invoke() {

            }
        });

        assertEquals("Should return a value of one added menu item.", 1, items.size());

    }

    @Test
    public void testShow() throws Exception {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        System.setOut(new PrintStream(byteArrayOutputStream));

        InputStream inputStream = new ByteArrayInputStream("1".getBytes("UTF-8"));

        System.setIn(inputStream);

        Menu menu = new Menu();

        menu.Add("UnitTestMenuName", new MenuCallback() {
            @Override
            public void Invoke() {

            }
        });

        menu.Show();

        assertTrue("Must return the newly added menu item called: \"UnitTestMenuName\".", byteArrayOutputStream.toString().contains("UnitTestMenuName"));
    }
}