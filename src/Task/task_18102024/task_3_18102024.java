package Task.task_18102024;

import java.util.Scanner;

public class task_3_18102024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the conversion:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Celsius to Fahrenheit");
        int choice = sc.nextInt();
        System.out.println("Enter the value to convert: ");
        double value = sc.nextDouble();
        double result1, result2, result3, result4;
        result1 = (value/1.609344);
        result2 = (value*1.609344);
        result3 = (value-32)*0.555;
        result4 = (value*1.8)+32;
        switch (choice) {
            case 1:
                System.out.println("Kilometers to Miles: "+result1);
                break;
            case 2:
                System.out.println("Miles to Kilometers: "+result2);
                break;
            case 3:
                System.out.println("Fahrenheit to Celsius: "+result3);
                break;
            case 4:
                System.out.println("Celsius to Fahrenheit: "+result4);
                break;
        }
        sc.close();
    }
}
