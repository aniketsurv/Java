public class Compoundinterst{
	
	public static void main(String[]args){
		int p=1000;
		double r=0.05;
		int n=12;
		int t=5;
		double firstpart=(1+r/n);
		double secondpart=(n*t);
		double amt=p*Math.pow(firstpart,secondpart);
		System.out.println(amt);
	}
	
	
	
}