package oop;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer geo = new Customer("geo");
		VIPCustomer kyun = new VIPCustomer("kyun");
		int price = geo.calcPrice(10000);
		System.out.println(price);
		int discountedPrice = kyun.calcPrice(10000);
		System.out.println(discountedPrice);
		System.out.println(geo.showCustomerInfo());
		System.out.println(kyun.showCustomerInfo());
	}

}
