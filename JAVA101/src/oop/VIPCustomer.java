package oop;

public class VIPCustomer extends Customer {
	
	private int agentId;
	double discountRatio;
	
	public VIPCustomer (String CustomerName) {
		
		super(CustomerName);
		// super 키워드는 상위 클래스의 주소값을 바라본다.
		// 상위 클래스의 기본 생성자가 있을시는 컴파일 시 super();를 작성해 자동으로 상속받지만
		// 상위클래스에 기본생성자가 없을 때는 명시적으로 생성자의 상속을받아야한다.

		customerGrade ="VIP";
		bonusRatio = 0.05;
		discountRatio =0.1;
	}

	public int getAgentId() {
		return agentId;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * discountRatio);
		return price;
	}
	

	//강의 중간에 듣다가 형변환 부터 다시들어야된다.
	
}
