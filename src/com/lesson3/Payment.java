package com.lesson3;
//calculate salary payment based on working Hr (standard, overtime hr)
public class Payment {

//	declare initiate variables for the values to be calculated
	
	private double standardPay;
	private double overtimePay;
	private double totalPay;
	
//	declare a method with 3 parameters- first put in data tipe (double)
	public void calculatePayment(double payRate, double standardHours, double overtimeHours);
	
	
	
	standardPay = payRate * standardHours;
//	calc the overtime payment
	double overtimePayRate = payRate *1.5;
	overtimePay = overtimePayRate * overtimeHours;
	
	totalPay = standardPay + overtimePay;
	

	public void displayPayment() {
		System.out.println("My standard pay: " + standardPay);
		System.out.println("(My standard overtime pay" + overtimePay);
		System.out.println("My total pay" + totalPay);
		
}	
	
	public static void main(String[] args);
	{
//		dec a variable of type of Payment
		
		Payment myPayment;
		
//		create an obj of type Payment
		myPayment = new Payment();
		myPayment.
//		pR = payrate, standH, overtomeH
		double pR, sH, oH;
		pR = 20;
		sH = 39;
		oH = 20;
		myPayment.calculatePayment(pR, sH, oH, oH);
		myPayment.displayPayment();
		
	
	}

}
