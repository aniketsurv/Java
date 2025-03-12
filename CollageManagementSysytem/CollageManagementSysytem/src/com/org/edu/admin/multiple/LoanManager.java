package com.org.edu.admin.multiple;

public class LoanManager extends Manager{
	
	
	@Override
	public double sectionLoan(double ctc, float cibilScore) {
		
		if(validateProcessForLoanSanction(ctc, cibilScore))
			validateProcessForLoanSanction(ctc, cibilScore);
		
		return super.sectionLoan(ctc, cibilScore);
	}
	
	public boolean validateProcessForLoanSanction(double ctc, float cibilScore){
		double loanAmt=0.0;
		
		if(isValidCIBIL(7.6f) && isValidEmplyer(25.5,"MAJESCO"))
			loanAmt = super.sectionLoan(ctc, cibilScore);
		
		if(loanAmt > 0)
			return true;
		
		return false;
	}
	
	public boolean isValidCIBIL(float cibilScore){
		
		return true;
	}
	
	public boolean isValidEmplyer(double ctc,String employerInfo)
	{
		return true;
	}
	
	
	public static void main(String[] a)
	{
		LoanManager lm = new LoanManager();
		lm.sectionLoan(25.5, 9.5f);
	}
	
}
