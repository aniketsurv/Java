import java.util.*;
public class Swap{



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter first");
        int num1=sc.nextInt();
        System.out.println("enter second no");
        int num2=sc.nextInt();
        System.out.println("before swap");
        System.out.println(num1);
        System.out.println(num2);
        int temp=num1;
        num1=num2;
        num2=temp;
      System.out.println("after swap");
      System.out.println(num1);
      System.out.println(num2);
        
    }}