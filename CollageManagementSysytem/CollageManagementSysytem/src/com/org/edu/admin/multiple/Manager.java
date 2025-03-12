package com.org.edu.admin.multiple;

public class Manager extends Bank{
	
	
	@Override
	public double sectionLoan(double ctc, float cibilScore) {
		
		finalApprovalForLoanSnction();
		
		double amt = super.sectionLoan(ctc, cibilScore);
		
		return amt;
	}
	
	public void finalApprovalForLoanSnction()
	{
		
	}
}
