package twodimentionalarray;

public class Multilpication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,2,3},{6,2,4}};
int b[][]= {{3,4},{5,2},{4,1}};
int c[][]=new int[a.length][b[0].length];
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < b[0].length; j++) {
		for (int k = 0; k < b.length; k++) {
			c[i][j]=c[i][j]+a[i][k]*b[k][j];
		}
	}
}
for (int[] is : c) {
	for (int is2 : is) {
		System.out.print(is2+" ");
		
	}
	System.out.println();
}
	}

}
