/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TriangleClassifier;


/**
 *
 * @author PC
 */
public class TriangleClassifierProgram {
    public static String classifyTriangle(int side1, int side2, int side3) {
        if (isValidTriangle(side1, side2, side3)) {
            if (isEquilateral(side1, side2, side3)) {
                return "Equilateral"; // Tam giác đều
            } else if (isIsosceles(side1, side2, side3)) {
                return "Isosceles"; // Tam giác cân
            } else if (isRightTriangle(side1, side2, side3)) {
                return "Right triangle"; // Tam giác vuông
            } else {
                return "Scalene"; // Tam giác thường
            }
        } else {
            return "Not a triangle"; // Không là tam giác
        }
    }

    private static boolean isValidTriangle(int side1, int side2, int side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    private static boolean isEquilateral(int side1, int side2, int side3) {
        return side1 == side2 && side1 == side3;
    }

    private static boolean isIsosceles(int side1, int side2, int side3) {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    private static boolean isRightTriangle(int side1, int side2, int side3) {
        int maxSide = Math.max(Math.max(side1, side2), side3);
        return maxSide * maxSide == side1 * side1 + side2 * side2 + side3 * side3 - maxSide * maxSide;
    }
}