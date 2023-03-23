package carFactory;

public class CarFactory {

	
	private static CarFactory instance= new CarFactory();
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		
		return instance;
	}
	
	public Car createCar() {
	    Car newCar = new Car();

		return newCar;
		
		
	}
	
}
