public class Year{
	
	public static void main(String[]args){
      int days=90000;
	  int year=days/365;
	  int temp=days%365;
	  int week=temp/7;
	  int remdays=temp%7;
		
		System.out.println(year+"/"+week+"/"+remdays);
	}
	
	
	
}