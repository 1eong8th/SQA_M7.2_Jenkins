/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package M7._swimmingpool;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App person;
    

    @Test
    void testCalcualteprice() {
        person = new App();
         assertThrows(
                Exception.class,
                () -> person.calcualteprice(4, "monday", 22, false, false),
                "no exception throw"
                );
        
    }
    @Test
    void testCalcualteprice2() {
        person = new App();
        assertThrows(
                Exception.class,
                () -> person.calcualteprice(12, "wednesday", 2, false, false),
                "no exception throw"
                );
        
    }
    @Test
    void testCalcualteprice3() {
        person = new App();
        assertThrows(
                Exception.class,
                () -> person.calcualteprice(23, "saturday", 65, true, false),
                "no exception throw"
                );
        
    }
    @Test
    void testCalcualteprice4() {
        person = new App();
        assertThrows(
                Exception.class,
                () -> person.calcualteprice(13, "sunday", 77, false, false),
                "no exception throw"
                );
        
    }
    @Test
    void testCalcualteprice5() throws Exception {
        person = new App();
        assertEquals(125,person.calcualteprice(12, "sunday", 30, false, true));
        
    }
    @Test
    void testCalcualteprice6() throws Exception {
        person = new App();
        assertEquals(250,person.calcualteprice(15, "saturday", 15, true, false));
        
    }
    
    @Test
    void testCalcualteprice7() throws Exception {
        person = new App();
        assertEquals(160,person.calcualteprice(13, "monday", 10, false, false));
        
    }
    
    @Test
    void testCalcualteprice8() throws Exception {
        person = new App();
        assertEquals(160,person.calcualteprice(6, "wednesday", 70, false, false));
        
    }
    
    @Test
    void testCalcualteprice9() throws Exception {
        person = new App();
        assertEquals(200,person.calcualteprice(10, "friday", 40, false, false));
        
    }
    @Test
    void testCalcualteprice10() throws Exception {
        person = new App();
        assertEquals(140,person.calcualteprice(6, "friday", 40, true, false));
        
    }
    @Test
    void testCalcualteprice11() throws Exception {
        person = new App();
        assertEquals(100,person.calcualteprice(6, "friday", 40, false, true));
        
    }

    @Test
    void testCalcualteprice12() throws Exception {
        person = new App();
        assertEquals(160,person.calcualteprice(5, "friday", 40, false, false));
        
    }
}
