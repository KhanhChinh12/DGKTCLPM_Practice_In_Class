/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculatorWeek1;

import calculatorWeek1.CalculatorProgram;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class CalculatorProgramTest {
    CalculatorProgram calpro;
    public CalculatorProgramTest() {
        calpro = new CalculatorProgram();
    }

    @Test
    public void testCong() {
        int result = calpro.cong(5, 7);
        int expected = 12;
        assertEquals(expected, result);
    }
    
    @Test
    public void testTru() {
        int result = calpro.tru(7, 2);
        int expected = 5;
        assertEquals(expected, result);
    }
    
    @Test
    public void testNhan() {
        int result = calpro.nhan(6, 4);
        int expected = 24;
        assertEquals(expected, result);
    }
    
    @Test
    public void testChia() {
        int result = calpro.chia(10, 5);
        int expected = 2;
        assertEquals(expected, result);
    }
    
    @Test
    public void testChiaChoZero(){
        assertThrows(ArithmeticException.class, () ->{
            calpro.chia(8, 0);
        });
    }
}
