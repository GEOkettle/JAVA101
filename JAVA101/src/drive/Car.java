package drive;

 abstract class Car {

	//drive stop startcar turnoff run
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("붕붕이 시동을 겁니다.");
	};
	
	public void turnoff() {
		System.out.println("붕붕이 시동을 끕니다.");
	}
	
	public void run() {
		System.out.println("붕붕이가 달립니다.");
	}
	
	//final을 붙이면 override하지 못합니다.
	final void myDrive() {
	
		startCar();
		drive();
		run();
		stop();
		turnoff();
		
	}
	

	
}
