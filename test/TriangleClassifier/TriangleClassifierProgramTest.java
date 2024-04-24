/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TriangleClassifier;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class TriangleClassifierProgramTest {
    
    @Test
    public void testEquilateralTriangle() {
        String triangleType = TriangleClassifierProgram.classifyTriangle(5, 5, 5);
        assertEquals("Equilateral", triangleType);
    }

    @Test
    public void testIsoscelesTriangle() {
        String triangleType = TriangleClassifierProgram.classifyTriangle(5, 5, 3);
        assertEquals("Isosceles", triangleType);
    }

    @Test
    public void testScaleneTriangle() {
        String triangleType = TriangleClassifierProgram.classifyTriangle(7, 9, 12);
        assertEquals("Scalene", triangleType);
    }

    @Test
    public void testRightTriangle() {
        String triangleType = TriangleClassifierProgram.classifyTriangle(3, 4, 5);
        assertEquals("Right triangle", triangleType);
    }

    @Test
    public void testNotATriangle() {
        String triangleType = TriangleClassifierProgram.classifyTriangle(1, 2, 3);
        assertEquals("Not a triangle", triangleType);
    }
}