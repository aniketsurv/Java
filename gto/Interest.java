package gto;

public class Interest {
	
	public static void main(String[] args) 
	{
		//obj.4
		 Deposit d1 = new Deposit(2000.0, 18.25, 52.0);
	        System.out.println("Principal before adding interest : " + d1.principal);
	        addInterest(d1);
	        System.out.println("Principal after adding interest : " + d1.principal);

	}
	
	public static void addInterest(Deposit deposit)
    {
        Deposit d2 = deposit;
        d2.principal += d2.principal * d2.rate * d2.years / 100.0;
    }

}
class Deposit
{
    double principal;
    double rate;
    double years;

    Deposit(double principal, double rate, double years)
    {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }
}
