package carrotMarket;

public class CarrotTest {

	
	
	public static void main(String[] args) {
		
		CarrotUser user = new CarrotUser();
		
		user.order();
		user.buy();
		user.sell();
		user.hillow();
		
		
		System.out.println("=============================");
		Buy buyer = new CarrotUser();
		buyer.buy();
		buyer.order();
//		buyer.sell();
//		buyer.hillow();
		
		
		System.out.println("=============================");
		Sell seller = new CarrotUser();
		seller.sell();
		seller.order();
//		seller.buy();
//		seller.hillow();
		
	
	}

}
