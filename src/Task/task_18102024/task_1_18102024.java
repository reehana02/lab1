package Task.task_18102024;

import java.util.Scanner;

public class task_1_18102024 { public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    double num1= sc.nextDouble();
    System.out.println("Enter the second number:");
    double num2= sc.nextDouble();
    System.out.println("Enter the operator:");
    String op = sc.next();
    //rough logic
     switch(op)
    {
        case "+":
        System.out.println("The addition of the num1+num2 is "+(num1+num2));
        break;
        case "-":
            System.out.println("The subtraction of the num1-num2 is "+(num1-num2));
            break;
        case "*":
            System.out.println("The multiplication of the num1*num2 is "+(num1*num2));
            break;
        case "/":
            System.out.println("The division of the num1/num2 is "+(num1/num2));
            break;
        case "%":
            System.out.println("The addition of the num1%num2 is "+(num1%num2));
            break;

    }
    sc.close();
}}
