package Task.task_17102024;
import java.util.Scanner;
public class task_2_17102024 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the score");
    double score= sc.nextDouble();

    if (score>=90 && score<=100)
    {
        System.out.println("Student grade is A");
    }
    else if (score>=80 && score<=89)
    {
        System.out.println("Student grade is B");
    }
    else if (score>=70 && score<=79)
    {
        System.out.println("Student grade is C");
    }
    else if (score>=60 && score<=69)
    {
        System.out.println("Student grade is D");
    }
    else if (score>=50 && score<=59)
    {
        System.out.println("FAIL");
    }
    sc.close();
}
}
