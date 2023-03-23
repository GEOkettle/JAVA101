package datatype;

public class Singleton {

	private static Singleton mode = new Singleton();
	private static boolean status = false;
	private Singleton() {}
	//외부에서 접근할 수 없게 생성자를 private로 생성
	
	public  static Singleton getMode() {
		
		if(mode == null) {
			mode = new Singleton();
		}
		
		return mode;
	}

	public static boolean isStatus() {
		return status;
	}

	public static void setStatus(boolean status) {
		Singleton.status = status;
	}
}
