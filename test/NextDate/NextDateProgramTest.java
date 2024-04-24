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
    public void testNextDate() {
        // Test valid date
        assertEquals("2/5/2021", NextDateProgram.nextDate(1, 5, 2021)); 
        assertEquals("1/6/2021", NextDateProgram.nextDate(31, 5, 2021)); 
        assertEquals("1/1/2022", NextDateProgram.nextDate(31, 12, 2021)); 

        // Test invalid date
        assertEquals("Invalid date", NextDateProgram.nextDate(0, 5, 2021)); 
        assertEquals("Invalid date", NextDateProgram.nextDate(32, 5, 2021)); 
        assertEquals("Invalid date", NextDateProgram.nextDate(1, 13, 2021)); 
        assertEquals("Invalid date", NextDateProgram.nextDate(1, 5, 1811)); 
        assertEquals("Invalid date", NextDateProgram.nextDate(29, 2, 2021)); 
        assertEquals("Invalid date", NextDateProgram.nextDate(30, 2, 2020));
    }
}
