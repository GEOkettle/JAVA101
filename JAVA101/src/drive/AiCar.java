package drive;

public class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("AI가 붕붕이를 운전합니다.");
	}
	@Override
	public void stop() {
		System.out.println("AI가 붕붕이를 멈춥니다");
	}

}
