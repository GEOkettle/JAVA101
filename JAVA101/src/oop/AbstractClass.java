package oop;

public abstract class AbstractClass {
//abstract method가 있다면 클래스에도 abstrack keyword를 붙인다.
	
	public abstract void abstractMethod();
	
	public void noneAbstractMethod() {
		System.out.println("none abstrack method");
	}

}