package june24;

public class Statiicmwthode {
	static int area;
static void areaofshape(int side) {
	// TODO Auto-generated method stub
area=side*side;
System.out.println("area of square : "+area);
}
 static void areaofshape(int length,int breadth) {
	// TODO Auto-generated method stub
area=length*breadth;
System.out.println("area of reactangle :"+area);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
areaofshape(12);
areaofshape(12, 10);
	}

}
