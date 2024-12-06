package Task.task_14102024;

public class task_1_14102024 {
    public static void main(String[] args){

        // Widening: Decimal is added when casting int to double
        int a = 100;
        double b= a;
        System.out.println(a);
        System.out.println(b);

        //Narrowing:trimmimg the decimals off a number; casting a double to an int
         double y = 38.50185;
         int z = (int)y;
         System.out.println(y);
         System.out.println(z);

         //Typecasting in real-time scenario (e.g.payment processing system to appply discount)
        double cost = 150.89;
        float discountPercentage = 15f;
        double discount = (cost * discountPercentage) / 100;
        double finalPrice = cost - discount;
        // Cast the finalPrice (double) to an integer for final receipt or reporting
        int roundedPrice = (int) finalPrice;  // explicit casting to int
        System.out.println(roundedPrice);
    }
}
