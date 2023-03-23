package datastructure;

public class LinkedListTest {

	public static void main(String[] args) {
		
		MyLinkedList myLink = new MyLinkedList();
		
		for(int i= 0; i<10; i++) {
			
			myLink.addElement(Integer.toString(i));
		}
		
		myLink.printAll();
		
		myLink.removeElement(1);
		myLink.printAll();
		myLink.insertElement(1, "1");
		myLink.printAll();
		myLink.addElement("10");
		myLink.printAll();
	}
}
