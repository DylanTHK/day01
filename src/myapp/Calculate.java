package myapp;

import java.io.Console;

public class Calculate {
    // Initiate entry point for class
    public static void main(String[] args) {
        
        // initialise console
        Console cons = System.console();
        String currentNumber = "";
        int myTotal = 0;
        int count = 0;

        // while loop to request for number from user
        while (!currentNumber.equals("stop")) {
            // request number from user
            currentNumber = cons.readLine("Enter a number: ");
            currentNumber = currentNumber.trim();

            // condition to check if string input is "stop"
            if (currentNumber.equals("stop")) {
                break; // exit while loop
            } 

            // adding value to total
            count++;
            myTotal += Integer.parseInt(currentNumber);
            
        }
        // print total number 
        System.out.printf("The total of %d integers is %d.\n", count, myTotal);
    }
}
