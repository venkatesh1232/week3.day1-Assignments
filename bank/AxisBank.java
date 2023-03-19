package org.bank;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("This is Axisbank deposit Account");
	}
public static void main(String[] args) {
	AxisBank AB=new AxisBank();
	AB.deposit();
	AB.savings();
	AB.fixed();
	BankInfo BI=new BankInfo();
	BI.deposit();
	
	
}
	
}
