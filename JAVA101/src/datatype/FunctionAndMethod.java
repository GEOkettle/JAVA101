package datatype;

public class FunctionAndMethod {
	public static int addNum(int num1,int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		
		int sum = 0;
		int i;
		
		for(i= 0; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		//작성한 자바파일을 실행할때 main이란 이름의 함수를 실행하는 것은 자바의 약속입니다.
		// 메인의 위치는 어디든 상관없으나 가독성을 위하여 맨 아래나 위에 작성합니다.
		
		int n1 = 10;
		int n2 = 20;
		
		//같은 클래스안의 함수를 아래와 같이호출할 수 있습니다
		int total = addNum(n1,n2);
		System.out.println(total);
		
		sayHello("hillow Method");
		
		total = calcSum();
		System.out.println(total);
		
		
		
	}
}
