package org.harry;
 
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
 
import org.junit.BeforeClass;
import org.junit.Test;
 
/**
 * Unit test for simple App.
 */
public class AppTest {
    static App app;
    
    @BeforeClass
    public static void init(){
        app = new App();
    }
 
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }
 
    @Test
    public void checkName(){
        app.name = "Test";
        assertEquals("App name should be Test", "Test", app.getName());
    }
    @Test
    public void doArraysEqual(){
        int[] arr = new int[]{2,3,4,5};

        assertArrayEquals(arr, app.toArray(2, 3, 4 ,5));
    }

    @Test
    public void hamcrestTest(){
        assertThat(50, is(not(40)));
        //assertThat(50, is(greaterThan(61)));

        assertThat("Hello", startsWith("Hel"));
    }
    //@Test
 /*   public void compareObjects(){
        App app1();
    }*/
}