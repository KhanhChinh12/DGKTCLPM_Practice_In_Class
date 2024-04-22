/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prime;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class PrimeChecker {

    public boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        PrimeChecker prime = new PrimeChecker();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        
        boolean isPrime = prime.isPrime(number);
        
        if(isPrime){
            System.out.println(number + " is a prime number");
        }else {
            System.out.println(number + " is not a prime number");
        }
    }
    
}
