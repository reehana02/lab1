package Task.task_16102024;

import java.util.Scanner;

public class task_1_16102024 {
    public static void main(String[] args)
    {
        //Scanner sc = new Scanner(System.in);
       /* System.out.println("How old are you");
        String age=sc.next();
        System.out.println(age + " is a good age to be");*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= sc.next();
        System.out.println("Please enter your age");
        int age =sc.nextInt();
        System.out.println("Please enter your salary");
        float salary =sc.nextFloat();
        System.out.println("Name: "+name+", Age: "+age+", Salary: "+salary);

        sc.close();


}}
