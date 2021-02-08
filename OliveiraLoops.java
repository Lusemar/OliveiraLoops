/*
Name: Lusemar Oliveira
Class: COP2800 - Programming in Java 
Programming Assignment #4: Loops Application
Due date: 02/09/2021
Program Description: Write a program that prompt the user to enter an amount (e.g. 200), and the annual
interest rate (e.g. 5), and the number of months (e.g. 5) then display the amount in the savings
account after the given month.
 */

package oliveiraloops; // Here is the package where the program is located.

import java.util.Scanner; // This is a class in the Java API used to create a Scanner object.

public class OliveiraLoops { // Here is the our class.
    public static void main(String[] args) { // Here is the main method, it's where the program executes.
    
    double monthlySavings = 0;
    double annualInterestRate = 0;
    double monthlyAmout = 0;
    int numberOfMonths = 0;
    boolean monthlySavingsRestart = true;
    boolean annualInterestRateRestart = true;
    boolean numberOfMonthsRestart = true;
 
    Scanner input = new Scanner(System.in);
    while(monthlySavingsRestart){
        System.out.print("Please, Enter the amount that you would like to save each month:\n");
        monthlySavings = input.nextDouble();
        if(monthlySavings < 0){
            System.out.println("There is an Error, You Have Entered a negative value!");
            continue;
        }
    monthlySavingsRestart = false;
    }
    while(annualInterestRateRestart){
        System.out.print("Please, Enter the Annual Interest Percentage:\n");
        annualInterestRate = input.nextDouble();
        if(annualInterestRate < 0 || annualInterestRate >100 ){
            System.out.println("There is an Error, You Have Entered an Invalid Input! The Percentage must be between 0 - 100.");
            continue ;
        }
    annualInterestRateRestart = false;
    }
    while(numberOfMonthsRestart){        
        System.out.print("Please, Enter the Number of Months that you would like to Save:\n");
        numberOfMonths = input.nextInt();  
        if(numberOfMonths < 0){
            System.out.println("There is an Error, You Have Entered a negative value!, Please re-enter the Number of Months:");
            continue;
        }
    numberOfMonthsRestart = false;
    }     

    System.out.println("___________________________________________________________________________________"); // This is just to print a line to help to separate the content;200
    double monthlyInterestRate = (annualInterestRate/100)/12;
            
        for(int i = 0; i < numberOfMonths; i++){
            monthlyAmout = (monthlyAmout + monthlySavings) * (1 + monthlyInterestRate);
        }
    System.out.printf("The amount in your Savings Account after %d months will be: $%.2f\n", numberOfMonths, monthlyAmout);     
    }
}
