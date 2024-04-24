/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorWeek1;

/**
 *
 * @author PC
 */
public class CalculatorProgram {
    public int cong(int a, int b){
        int result = a + b;
        return result;
    }
    
    public int tru(int a, int b){
        int result = a - b;
        return result;
    }
    
    public int nhan(int a, int b){
        int result = a * b;
        return result;
    }
    
    public int chia(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Khong chia cho so 0");
        }
        int result = a/b;
        return result;
    }
}
