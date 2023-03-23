package carFactory;

public class Car {

	private static int serialNum = 1000;
	public int carNum;
	
	public Car() {
		serialNum++;
		this.carNum = serialNum;
	
	}
	

	public int getCarNum() {
		return this.carNum;
	}
	
}
