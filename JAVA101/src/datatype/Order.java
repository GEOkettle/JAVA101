package datatype;

public class Order {
	
	int orderNum;
	String phoneNum;
	String address;
	int date;
	int time;
	int price;
	int menuNum;
	
	public void showInfo () {
		System.out.println("주문번호 :" + orderNum);
		System.out.println("주문 휴대폰 번호 :" + phoneNum);
		System.out.println("주문 집 주소:" + address);
		System.out.println("주문날짜 :" + date);
		System.out.println("주문시간 :" + time);
		System.out.println("주문가격 :" + price);
		System.out.println("메뉴 번호 :" + menuNum);
	}
	
	public Order (int orderNum, String phoneNum, String address, int date, int time, int price, int menuNum) {
		this.orderNum = orderNum;
		this.phoneNum = phoneNum;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNum = menuNum;
		
	}
	
}
