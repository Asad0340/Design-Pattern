/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

import java.util.Scanner;

/**
 *
 * @author fa20-bse-019
 */
public class StrategyPatternMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("\n----EXAMPLE TUTORIAL POINT----\n");
        Context context = new Context(new OperationAdd());		
        System.out.println("10 + 5 + 6 = " + context.executeStrategy(10, 5,6));
        //Context Change
        Context context1 = new Context(new OperationMultiply());		
        System.out.println("10 * 5 * 6 = " + context1.executeStrategy(10, 5,6));
       
        System.out.println("\n----EXAMPLE REFACTORGURU----\n");
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int firstNumber = scanner.nextInt();
//        // Read last number.
//        System.out.print("Enter second number: ");
//        int secondNumber = scanner.nextInt();
//
//        // Read the desired action from user input.
//        System.out.print("Enter action (addition, subtraction, multiplication): ");
//        String action = scanner.next();
//
//        // Determine the strategy based on user input.
//        
//       Context1 context2 = new Context1();
//        if (action.equalsIgnoreCase("addition")) {
//            context2.setStrategy1(new Opeartion1());
//        } else if (action.equalsIgnoreCase("subtraction")) {
//            context2.setStrategy1(new Opeartion2());
//        } else if (action.equalsIgnoreCase("multiplication")) {
//            context2.setStrategy1(new Opeartion2());
//        } else {
//            System.out.println("Invalid action");
//            return;
//        }
//
//        // Execute the selected strategy and print the result.
//        int result = context2.executeStrategy1(firstNumber, secondNumber);
//        System.out.println("Result: " + result);

        System.out.println("\n----STRATEGY PATTERN USING CHAINOF RESPONSIBILITY\n");
        // Create strategy instances
        Strategy3 addStrategy = new ConcreteStrategyAdd();
        Strategy3 subtractStrategy = new ConcreteStrategySubtract();
        Strategy3 multiplyStrategy = new ConcreteStrategyMultiply();
        Strategy3 divideStrategy = new ConcreteStrategyDivide();
        Strategy3 powerStrategy = new ConcreteStrategyPower();

        // Create range handlers
        RangeHandler powerHandler = new RangeHandler(10000, 20000, powerStrategy);
        RangeHandler divideHandler = new RangeHandler(5000, 10000, divideStrategy);
        RangeHandler multiplyHandler = new RangeHandler(1000, 5000, multiplyStrategy);
        RangeHandler subtractHandler = new RangeHandler(100, 1000, subtractStrategy);
        RangeHandler addHandler = new RangeHandler(1, 100, addStrategy);

        // Set up the chain of responsibility
        addHandler.setNext(subtractHandler);
        subtractHandler.setNext(multiplyHandler);
        multiplyHandler.setNext(divideHandler);
        divideHandler.setNext(powerHandler);

        // Read input numbers
        
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Handle the numbers based on the specified range strategy
        int result1 = addHandler.handle(a, b);
        System.out.println("Result: " + result1);
        
        scanner.close();
    }

   
    
}
