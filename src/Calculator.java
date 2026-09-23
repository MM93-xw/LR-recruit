import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("请输入运算符号:");
        String op = sc.next();
      
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
         long a=sc.nextLong();
         System.out.print("请输入除数2:");
         long b=sc.nextLong();
        
         if (b==0){
           System.out.println("除数不能为0");}

         else {
           double quotient = a/b;
           System.out.println("a/b="+quotient);}
        }

    }
}


