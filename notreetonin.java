import java.util.Scanner;
public class notreetonin{
	public static void main(String[]args){
	int count1=0,count2=0,count3=0;
	for(int i=33;i<999;i++){
		if(i%3==0&&i%7==0){
		System.out.println(i + " yello & pink  "+count1);
		count1++;
		}
		else if(i%3==0){
		System.out.println(i + " yello  "+count2);
		count2++;
		}
		else if(i%5==0){
		System.out.println(i + " pink    "+count3); 
		count3++;
		}
	}
	
		}
}
