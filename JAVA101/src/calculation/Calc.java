package calculation;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int multiply(int num1,int num2);
	int divide(int num1,int num2);
	
	default void description() {
		System.out.println("본 인터페이스는 사칙연산에 대한 메서드를 제공합니다");
	}
	
	static void myParam(int num1, int num2) {
		System.out.println("내 첫번째 파라메터는 " + num1+" 입니다");
		System.out.println("내 첫번째 파라메터는 " + num2 + " 입니다");
	}
}
