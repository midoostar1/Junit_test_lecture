import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void testCodeupString (){
        assertEquals("Codeup", "CodeUp");
        assertNotEquals("Codeup", "CodeUp");


    }



    @Test
    public void testIfArraysAreEqual(){
        int[] number = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(number, otherNumbers);

   }



    @Test
    public void testCharactersInString(){
        String language = "PHP";
        assertTrue(true);
        assertFalse(false);
    }

}























