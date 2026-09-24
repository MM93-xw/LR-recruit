import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("请输入运算符号:");
        String op = sc.next();

      while (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
        System.out.print("请从 + - * / 内选择: ");
        op = sc.next();}
      
       if (op.equals("+"))
        {
         System.out.print("请输入整数1:");
         long a=sc.nextLong();
         System.out.print("请输入整数2:");
         long b=sc.nextLong();
         long sum = a+b;
         System.out.println("a+b="+sum);
        }

       else if (op.equals("-"))
        {
         System.out.print("请输入整数1:");
         long c=sc.nextLong();
         System.out.print("请输入整数2:");
         long d=sc.nextLong();
         long diff = c-d;
         System.out.println("c-d="+diff);
        }

       else if (op.equals("*"))
        {
         System.out.print("请输入整数1:");
         long a=sc.nextLong();
         System.out.print("请输入整数2:");
         long b=sc.nextLong();
         long product = a*b;
         System.out.println("a*b="+product);
        }

       else if (op.equals("/"))
        {
         System.out.print("请输入整数1:");
         double a=sc.nextLong();
         System.out.print("请输入除数2:");
         double b=sc.nextLong();
        
         while (b==0){
           System.out.print("除数不能为0,请重新输入：");
           b=sc.nextLong();}

           double quotient = a/b;
           System.out.println("a/b="+quotient);
        }

    }
 }


