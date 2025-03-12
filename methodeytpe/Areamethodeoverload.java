package methodeytpe;

public class Areamethodeoverload {
	

	
	 void areaofshape(int side) {
		// TODO Auto-generated method stub
	int area=side*side;
	System.out.println("area of Square : "+area);
	}
	  void areaofshape(int lenght,int breadth) {
		// TODO Auto-generated method stub
	int area=lenght*breadth;
	System.out.println("area of reactangle :"+area);
	}
	  void areaofshape(float base,float height) {
		// TODO Auto-generated method stub
	float area=0.5f*base*height;
	System.out.println("area of triangle : "+area);

	}
	  void areaofshape(long side) {
			// TODO Auto-generated method stub
		int area=(int) (side*side*side);
		System.out.println("area of Square : "+area);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Areamethodeoverload ob=new Areamethodeoverload();
	ob.areaofshape(4);
	ob.areaofshape(10, 20);
	ob.areaofshape(5, 9);
		}

	}


