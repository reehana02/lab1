package Task.task_11102024;

public class task_02_11102024 {
    public static void main(String[] args){
       // Arithmetic operators +, -, *, /,%
        int x = 5;
        int y = 2;
        int z = 3;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x*20 / y);
        System.out.println(x % z);
        System.out.println();

        //Assignment operators (=) & Compound operators (+=, -=, *=, /=, %=)
        int a = 7;
        a +=5;
        int b = 8;
        b -=5;
        int c = 9;
        c *=5;
        int d = 3;
        d %=5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println();

        //Comparison/ Relational Operator - (==, !=, <, >, >=, <=)
        int a1 = 10;
        int a2 = 20;
        int a3 = 10;
        System.out.println(a1 == a3);
        System.out.println(a1 != a2);
        System.out.println(a3 < a1);
        System.out.println(a2 > a3);
        System.out.println(a3 >= a1);
        System.out.println(a2 <= a3);
        System.out.println();

        //Logical Operator- (&&, ||, !)
        int b1 = 11;
        int b2 = 12;
        int b3 = 13;
        System.out.println(b1 < 12 || b2 < b3);
        System.out.println(b2 > b1 && b3 < 14);
        System.out.println(!( b3 < 14));

        //unary operator

        int num = 10;
        //unary (+) = The unary plus operator, represented by +, makes an operand positive.
        int result = +num;
        System.out.println("Value of result after unary plus is " + result);

        //unary (-) = The unary plus operator, represented by +, makes an operand positive.
         result = -num;
        System.out.println("Value of result after unary minus is " + result);
        System.out.println();

        //unary ++ pre-increment
        result = ++num;
        System.out.println("Value of result after unary ++ pre-increment is " + result);

        //unary ++ post-increment
        result = num++;
        System.out.println("Value of result after unary post-increment ++ is " + result);
        System.out.println();

        //unary -- pre-decrement
        int num1 = 11;
       int result1 = --num1;
        System.out.println("Value of result after unary -- pre-decrement is " + result1);
        //unary -- post-decrement
        int result2 = num1--;
        System.out.println("Value of result after unary post-decrement -- is " + result2);
        System.out.println();

        //concatenation operator
        String name1 = "reehan";
        String name2 = "kaleel";
        int u1 = 5;
        int u2 = 10;
        System.out.println(name1 + name2 + u1 + u2);
        System.out.println(u1 + u2 + name1 + name2);






    }
}
