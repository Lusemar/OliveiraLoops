/*
Name: Lusemar Oliveira
Class: COP2800 - Programming in Java 
Programming Assignment #4: Loops Application
Due date: 02/09/2021
Program Description: Write a program that prompt the user to enter an amount (e.g. 200), and the annual
interest rate (e.g. 5), and the number of months (e.g. 5) then display the amount in the savings
account after the given month.
 */

//package oliveiraloops; // Here is the package where the program is located.

import java.util.Scanner; // This is a class in the Java API used to create a Scanner object.

public class OliveiraLoops { // Here is the our class.
    public static void main(String[] args) { // Here is the main method, it's where the program executes.
    // Variables declared and intialized.
    String monthlySavingsString, annualInterestRateString, numberOfMonthsString = "";
    double monthlySavings = 0;
    double annualInterestRate = 0;
    double monthlyAmout = 0;
    int numberOfMonths = 0;
    boolean monthlySavingsRestart = true;
    boolean annualInterestRateRestart = true;
    boolean numberOfMonthsRestart = true;
        
    Scanner input = new Scanner(System.in); // This is the escanner function that we imported.
    while(monthlySavingsRestart){ // This while will keep looping untill variable gets false.
        System.out.print("Please, Enter the amount that you would like to save each month:\n"); // This will print the message that the user will see.
        monthlySavingsString = input.next(); // Storing the user input into a String variable.
        if(monthlySavingsString.matches("[a-zA-Z_]+.|\n")){ // This if will check if the variable matches any letter or character using Regex. 
            System.out.println("There is an Error, You Have Entered an Invalid Input! Please enter a numeric Value."); // This will print the message that the user will see.
            continue; // This continue statement breaks one iteration in the loop, if a specified condition occurs.
        }
        monthlySavings = Double.parseDouble(monthlySavingsString);// Converting the string variable to doulbe and storing into a variable.
        if(monthlySavings < 0){ // This if will check if the variable lower than 0, just to verify if it's a negative value. 
            System.out.println("There is an Error, You Have Entered a negative value!"); // This will print the message that the user will see.
            continue; // This continue statement breaks one iteration in the loop, if a specified condition occurs.
        }
    monthlySavingsRestart = false; // This is where the variable gets a false value that breaking the while loop.
    }
    while(annualInterestRateRestart){
        System.out.print("Please, Enter the Annual Interest Percentage:\n");
        annualInterestRateString = input.next();
        if(annualInterestRateString.matches("[a-zA-Z_]+.|\n")){
            System.out.println("There is an Error, You Have Entered an Invalid Input! Please enter a numerical Value.");
            continue;   
        }
        annualInterestRate = Double.parseDouble(annualInterestRateString); // Converting the string variable to double and storing into a variable.
         if(annualInterestRate > 100 || annualInterestRate < 0){ // This if will check if is higher than 100 or lower than zero.
            System.out.println("There is an Error, You Have Entered an Invalid Input! The Percentage must be between 0 - 100.");
            continue;                
        }
    annualInterestRateRestart = false;
    }
    while(numberOfMonthsRestart){     
        System.out.print("Please, Enter the Number of Months that you would like to Save:\n");
        numberOfMonthsString = input.next(); 
        if(numberOfMonthsString.matches("[a-zA-Z_]+.|\n")){
            System.out.println("There is an Error, You Have Entered an Invalid Input! Please enter a numerical Value.");
            continue;   
        }        
        numberOfMonths = Integer.parseInt(numberOfMonthsString); // Converting the string variable to Integer and storing into a variable.
        if(numberOfMonths < 0){
            System.out.println("There is an Error, You Have Entered a negative value!, Please re-enter the Number of Months:");
            continue;
        }
    numberOfMonthsRestart = false;
    }     

    System.out.println("___________________________________________________________________________________"); // This is just to print a line to help to separate the content;200
    double monthlyInterestRate = (annualInterestRate/100)/12; // This will convert yearly interest rate to a monthly rate.
            
        for(int i = 0; i < numberOfMonths; i++){ // This for loop will iterate according with the user number of months.
            monthlyAmout = (monthlyAmout + monthlySavings) * (1 + monthlyInterestRate); // This variable will acomulate the monthly value plus the interest.
        }
    System.out.printf("The amount in your Savings Account after %d months will be: $%.2f\n", numberOfMonths, monthlyAmout); //This is a formatted output concatenated with a double variable with it's specific parameters. (No a specific precition to the left of the dot and two decimal digits to the right of the dot).    
    }
}
