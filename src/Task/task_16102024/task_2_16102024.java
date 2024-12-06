package Task.task_16102024;

public class task_2_16102024 {
    public static void main(String[] args)
    {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int result = (num1 > num2) ? num1 : num2;
    System.out.println("The largest number is "+result);
    }
}
