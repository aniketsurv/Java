package gto;

public class Gtonull {
	
	public static void main(String s[])
    {
		//Const.1
        Bike bike = new Bike("Hero", "hf", 125);
        bike.mileage = 79.5;
        bike.diskBrakes = false;

        System.out.println(bike.company + "'s " + bike.model + " has " + bike.cc + "cc power.");
    }
}
class Bike
{
    Bike(String companyParam, String modelParam, int ccParam)
    {
        company = companyParam;
        model = modelParam;
        cc = ccParam;
    }

    Bike()
    {
    }

    String company;
    String model;
    int cc;
    double mileage;
    boolean diskBrakes;
}