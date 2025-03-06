package se.lexicon;

import java.util.Scanner;

public class CalculatorAppVersion2 {

    /* Steps
    1. declare variables and constants
    2. create methods for addition, subtraction, division, multiplication
    3. ask user to input numbers or q to quit
    4. ask user to input the operator
    5. read input with scanner and store in variables
    6. calculate with help of methods
    7. print the returned result in console

    Psuedocode
    method addition
    method subtraction
    method multiplication
    method division
    run the app until user enters q
    if input = q(ignoreCase), exit app
    ask to input numbers and operator
    check if input is valid or ask for new input
    read input with scanner
    check which operator and call for the method to perform the calculation
    print the result
     */

    public static void main(String[] args) {

        //declare variables
        double num1 = 0;
        double num2 = 0;
        String inputString;
        String operator;
        boolean isValid = false;

        //create scanner object
        Scanner userInput = new Scanner(System.in);

        while (true) { //continue running until user enters q to exit
            while (!isValid) {
                //try user entry for invalid inputs
                try {
                    //ask user for first number
                    System.out.println("Please enter your first number, or enter q/Q to exit");
                    inputString = userInput.next();
                    if (inputString.equalsIgnoreCase("q")) {    //quit if q/Q was entered
                        System.out.println("You chose to Exit, See you next time!");
                        System.exit(0);
                    }
                    num1 = Double.parseDouble(inputString); //extract number from string
                    userInput.nextLine(); //clear buffer
                    isValid = true; //set value to true to exit loop
                } catch (NumberFormatException e) {
                    System.out.println("Invalid entry, try again!");
                }
            }

            isValid = false; //set value to false, to enter loop for second number

            while(!isValid) {
                try {
                    //ask user for second number
                    System.out.println("Please enter your second number, or enter q/Q to exit");
                    inputString = userInput.next();
                    if (inputString.equalsIgnoreCase("q")) {    //quit if q/Q was entered
                        System.out.println("You chose to Exit, See you next time!");
                        System.exit(0);
                    }
                    num2 = Double.parseDouble(inputString); //extract number from string
                    userInput.nextLine(); //clear buffer
                    isValid = true; //set value to true to exit loop
                } catch (NumberFormatException e) {
                    System.out.println("Invalid entry, try again!");
                }
            }

            isValid = false; //set value to false, to enter loop for operator

            while(!isValid) {
                //ask user for operator
                System.out.println("Please enter the operator for the calculation to be performed, +, -, *, /, or enter q/Q to exit");
                operator = userInput.next();
                if (operator.equalsIgnoreCase("q")) {    //quit if q/Q was entered
                    System.out.println("You chose to Exit, See you next time!");
                    System.exit(0);
                } else if (operator.equalsIgnoreCase("+")) {
                    addition(num1, num2);
                    isValid = true; //set value to true to exit loop
                } else if (operator.equalsIgnoreCase("-")) {
                    subtraction(num1, num2);
                    isValid = true; //set value to true to exit loop
                } else if (operator.equalsIgnoreCase("*")) {
                    multiplication(num1, num2);
                    isValid = true; //set value to true to exit loop
                } else if (operator.equalsIgnoreCase("/")) {
                    division(num1, num2);
                    isValid = true; //set value to true to exit loop
                } else {
                    System.out.println("Invalid entry, try again!");
                }
            }
            userInput.nextLine(); //clear buffer
            isValid = false; //reset value to false, to reenter first loop.

        }
    }

    //my created methods
    public static void addition(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
    public static void subtraction(double num1, double num2){
        double sum = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + sum);
    }
    public static void multiplication(double num1, double num2){
        double sum = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + sum);
    }
    public static void division(double num1, double num2){
        double sum;
        if (num2 == 0){
            System.out.println("You can't divide by zero!, Please try again with new numbers");
        } else {
            sum = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + sum);
        }
    }
}