package methodeytpe;

public class Area {
 void squre(int side) {
	// TODO Auto-generated method stub
int area=side*side;
System.out.println("area of Square : "+area);
}
  void rectangle(int lenght,int breadth) {
	// TODO Auto-generated method stub
int area=lenght*breadth;
System.out.println("area of reactangle :"+area);
}
  void triangle(float base,float height) {
	// TODO Auto-generated method stub
float area=0.5f*base*height;
System.out.println("area of triangle : "+area);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Area ob=new Area();
ob.squre(4);
ob.rectangle(10, 20);
ob.triangle(5, 9);
	}

}
