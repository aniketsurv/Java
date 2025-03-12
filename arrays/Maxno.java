package arrays;

public class Maxno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {12, 14 ,81 ,91,22,155};
int max=a[0];
for (int i = 0; i < a.length; i++) {
	if(a[i]>max)
		max=a[i];
	System.out.println(max);
}
System.out.println("Max element in given array is : "+max);
	}

}
