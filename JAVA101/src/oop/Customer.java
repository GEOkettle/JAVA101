package oop;

public class Customer {
	protected static int customerCounter = 1000;
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
//	public Customer () {}
	public Customer (String customerName) {
		customerCounter++;
		setCustomerId(customerCounter);
		setCustomerName(customerName);
		bonusRatio = 0.01;
		customerGrade = "SILVER";
		
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price; // 왜?
	}
	
	public String showCustomerInfo() {
		return "아이디가 " +customerId+"이신 "+ customerName + "님의 등급은" + customerGrade +"이며 포인트적립률은 " + bonusRatio+   "이고 현재 누적포인트는 " + bonusPoint + "입니다.";
	}
	
}
