package carrotMarket;

public class CarrotUser implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("user sell");
	}

	@Override
	public void buy() {
		System.out.println("user buy");
		
	}

	@Override
	public void order() {
		

		System.out.println("user order");
 
	
	}
	
	public void hillow() {
		System.out.println("hillow CArrot");
	}

}
