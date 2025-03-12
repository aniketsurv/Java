import java.util.*;
public class Simpleinterest{



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter N no");
        int N=sc.nextInt();
        System.out.println("enter P no");
        int P=sc.nextInt();
        System.out.println("enter R no");
        int R=sc.nextInt();
        int si=(N*P*R)/100;
        System.out.println("simple Interest"+si);
    }}