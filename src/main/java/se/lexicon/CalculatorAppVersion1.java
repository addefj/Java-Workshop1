package se.lexicon;

import java.util.Scanner;

public class CalculatorAppVersion1 {

    /* Steps
    1. declare variables and constants
    2. create methods for addition, subtraction, division, multiplication
    3. ask user to input numbers or q to quit
    4. ask user to input the operator
    5. read input with scanner and store in variables
    6. calculate with help of methods
    7. print the returned result in console

    Psuedocode
    while user want to continue
    ask if user want to continue or exit
    if input = 2, exit app
    ask to input numbers and operator
    store input
    check which operator (switch) and perform the calculation
    print the result
     */

    public static void main(String[] args) {

        //declare variables
        int num1;
        int num2;
        int continueOrExit;
        String operator;

        //create scanner object
        Scanner userInput = new Scanner(System.in);

        while (true) {
            //ask if user wants to calculate or quit
            System.out.println("\nPress 1 to perform a calculation\nPress 2 to quit");
            continueOrExit = userInput.nextInt();
            if (continueOrExit == 2) {
                System.out.println("You chose to Exit, See you next time!");
                System.exit(0);
            }

            //ask user for numbers and operator
            System.out.println("Please enter your first number");
            num1 = userInput.nextInt();

            System.out.println("Please enter your second number");
            num2 = userInput.nextInt();

            System.out.println("Please enter the operator for the calculation to be performed, +, -, *, /");
            operator = userInput.next();

            //check which operator, and perform the calculation and print the result
            switch (operator) {
                case "+":
                    System.out.print("The result is: ");
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.print("The result is: ");
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.print("The result is: ");
                    System.out.println(num1 * num2);
                    break;
                default:
                    System.out.print("The result is: ");
                    System.out.println(num1 / num2);
                    break;

            }
        }
    }
}