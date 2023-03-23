package datatype;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		for(int i =0; i<5; i++) {
			library.add(new Book("나루토"+(i+1),"키시모토 마사시"));
			library.get(i).showBookInfo();
		}
		System.out.println(library);
		System.out.println(library.size());
		System.out.println(library.getClass());
		System.out.println(library.toString());
		System.out.println(library.get(0));
		System.out.println(library.iterator());
		System.out.println(library.toArray());
		System.out.println(library.listIterator());
		System.out.println(library.stream());
		System.out.println(library.subList(0, 2));
		
			
	}
}
