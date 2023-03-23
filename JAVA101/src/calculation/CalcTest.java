package calculation;

public class CalcTest {

	
	public static void main(String[] args) {
		// Calculator는 Calc의 타입을 상속 
		//CompleteCalc는 Calculator를 상속 
		// 타입은 두번 상속 됬으니 고대로 쓸 수 있다.
		
		int num1 = 10;
		int num2 = 5;
		Calc calc = new CompleteCalc();
		//Calc calc2 = new Calculator();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.multiply(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.divide(num1, 0));
		
		
		calc.description();
		Calc.myParam(1, 2);
		
		
	}
}
