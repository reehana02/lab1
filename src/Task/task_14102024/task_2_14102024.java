package Task.task_14102024;

public class task_2_14102024 {public static void main(String[] args){

    // Example temperature values from sensors or other sources (double)
    double sensorTemperatureCelsius = 35.7;
    float sensorTemperatureFarenheit = 96.26f;

    // Displaying sensor temperatures in integer form (rounding down)
    int roundedTemperatureCelsius = (int)sensorTemperatureCelsius;
    int roundedTemperatureFarenheit = (int)sensorTemperatureFarenheit;

    System.out.println("Rounded Temperature Celcius: " + roundedTemperatureCelsius);
    System.out.println("Rounded Temperature Farenheit: " + roundedTemperatureFarenheit);

    //Storing large transcation amount as double
    double transactionAmount = 123456789.123;
    //displaying the transaction amount in int
    int roundAmount = (int)transactionAmount;
    System.out.println("\nThe rounded Amount is " + roundAmount);

    // Simulate a large deposit and withdraw operation with long values
    long largeDeposit = 600000000L;
    long remainingBalance = largeDeposit - 10000L;
    int truncateBalance = (int)remainingBalance;
    System.out.println("The Truncated Balance Amount is " + truncateBalance );

}
}
