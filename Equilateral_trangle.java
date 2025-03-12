import java.util.*;
public class Equilateral_trangle{



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter side of trangle");
        int side=sc.nextInt();
        double area=(Math.sqrt(3)/4)*(side*side);
        System.out.println("area : "+area);
    }}