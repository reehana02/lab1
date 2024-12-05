package Task;

public class task_1_15102024 {
    public static void main(String[] args){
        int a = 50, b = 20, c = 60;

       // (condition1) ? value1 : ((condition2) ? value2 : value3);
       // a>b ? a:b
        //b>c ? b:c
        //a>c ? a:c
       int greatestNum = (a >= b && a >= c) ? a : (b >= c ? b : c);
       System.out.println("The greatest of the three num is " + greatestNum);
    }
}
