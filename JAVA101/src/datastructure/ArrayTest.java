package datastructure;

public class ArrayTest {
	
	public static void main(String[] args) {
	MyArray myArray = new MyArray(20);
	
	for(int i = 1; i<=20; i++) {
		myArray.addElement(i);

		
		
	}
	myArray.removeElement(0);
	myArray.insertElement(0, 100);
	myArray.printAll();
		
	}
	
}
