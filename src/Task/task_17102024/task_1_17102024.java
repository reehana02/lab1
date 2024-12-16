package Task.task_17102024;

import java.util.Scanner;

public class task_1_17102024 {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides of Triangle :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c)
            System.out.println("All sides equal = Equilateral Triangle ");
        else if (a==b || b==c || c==a)
            System.out.println("Two sides equal = Isosceless Triangle ");
        else
            System.out.println("No sides equal = scalene Triangle");

sc.close();

}
}
