/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prime;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class PrimeCheckerTest {
    
    PrimeChecker primeChecker; 
    public PrimeCheckerTest() {
        primeChecker = new PrimeChecker();
    }

    @Test
    public void testIsPrimeWithPrimeNumber() {
        int primeNumber = 17;
        boolean expectedResult = true;
        boolean actualResult = primeChecker.isPrime(primeNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        int nonPrimeNumber = 10;
        boolean expectedResult = false;
        boolean actualResult = primeChecker.isPrime(nonPrimeNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPrimeWithZero() {
        int zero = 0;
        boolean expectedResult = false;
        boolean actualResult = primeChecker.isPrime(zero);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPrimeWithNegativeNumber() {
        int negativeNumber = -5;
        boolean expectedResult = false;
        boolean actualResult = primeChecker.isPrime(negativeNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPrimeWithOne() {
        int one = 1;
        boolean expectedResult = false;
        boolean actualResult = primeChecker.isPrime(one);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPrimeWithSmallPrimeNumber() {
        int smallPrimeNumber = 2;
        boolean expectedResult = true;
        boolean actualResult = primeChecker.isPrime(smallPrimeNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPrimeWithLargePrimeNumber() {
        int largePrimeNumber = 997;
        boolean expectedResult = true;
        boolean actualResult = primeChecker.isPrime(largePrimeNumber);
        assertEquals(expectedResult, actualResult);
    }
    
}
