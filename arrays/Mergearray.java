package arrays;

public class Mergearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {12,34,56};
int b[]= {44,55};
int c[]=new int [a.length+b.length];
int k=0;
for (int i = 0; i < a.length; i++) {
	c[k++]=a[i];
}
for (int i = 0; i < b.length; i++) {
	c[k++]=b[i];
}
for (int i = 0; i < c.length; i++) {
	System.out.print(c[i]+" ");
}
	

}
}