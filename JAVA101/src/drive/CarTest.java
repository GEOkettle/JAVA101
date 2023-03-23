package drive;

public class CarTest {
	
	//추상화 클래스는 상속 ㄴㄴ
	//Car merc = new Car();
	
	
	public static void main(String[] args) {
		Car geoCar = new ManualCar();
		Car kyunCar = new AiCar();
		
		geoCar.myDrive();
		kyunCar.myDrive();
	}
}
