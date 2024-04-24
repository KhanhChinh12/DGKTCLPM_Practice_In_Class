/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package NextDate;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class NextDateProgramTest {
    
    @Test
    public void testNextDateNormal() {
        assertEquals("03/02/2008", NextDateProgram.nextDate(2, 2, 2008)); 
    }

    @Test
    public void testNextDateLastDayOfMonth() {
        assertEquals("01/08/2007", NextDateProgram.nextDate(31, 7, 2007)); 
    }

    @Test
    public void testNextDateLeapYear() {
        assertEquals("01/03/2004", NextDateProgram.nextDate(29, 2, 2004)); 
    }

    @Test
    public void testNextDateFirstDayOfYear() {
        assertEquals("01/01/2003", NextDateProgram.nextDate(31, 12, 2002)); 
    }

    @Test
    public void testNextDateLastDayOfYear() {
        assertEquals("01/01/1886", NextDateProgram.nextDate(31, 12, 1885)); 
    }
    
}
