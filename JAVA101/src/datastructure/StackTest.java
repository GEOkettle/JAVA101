package datastructure;

public class StackTest {

	
	public static void main(String[] args) {
		MyArrayStack myStack = new MyArrayStack(10);
		
		for(int i=1; i<=10; i++) {
			myStack.push(i);
		}
		myStack.printAll();
		System.out.println("=======================");
		System.out.println(myStack.peek());
		System.out.println("=======================");
		System.out.println(myStack.pop());
		System.out.println("=======================");
		myStack.printAll();
	}
	
	
}
