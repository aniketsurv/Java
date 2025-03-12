package oopsjava;

//public class Absraction_animal {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//            Dog d=new Dog (25);
//            d.walks();
//            
//            d.eats();
//	}
//
//}
//abstract class Animal{
//	 abstract void walks() ;
// protected void eats() {
//	// TODO Auto-generated method stub
//System.out.println("eats");
//}
//	
//}
// class Dog extends Animal{
// int i;
//	public Dog(int i) {
//		// TODO Auto-generated constructor stub
//		this.i=i;
//	}
//
//	void walks() {
//		// TODO Auto-generated method stub
//		System.out.println("walk in 4 legses"+i);
//	}
//	
//}


interface animal{
	void walk();
	void eats();
} 
class horse implements animal{

	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("wals in hors");
	}

	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("eats bannana");
	}
	
}