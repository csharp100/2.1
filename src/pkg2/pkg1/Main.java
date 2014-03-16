/*
 * Exercise 2.1 from the Liang Java Textbook 8E
 * Comprehensive Version
 */

package pkg2.pkg1;

/**
 *
 * @author Clint Sharp
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner consoleInput = new Scanner(System.in); 
        System.out.print("Enter a Degree in Celsius: ");
        double celsiusInput = consoleInput.nextDouble();
        double fahrenheitOutput = (9.0 / 5) * celsiusInput + 32;
        System.out.println(celsiusInput + " Celsius is " + fahrenheitOutput + " Fahrenheit");
    }
    
}
