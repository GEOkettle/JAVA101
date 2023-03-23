package class101;

class Book {
	
	private String title;
	private String author;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "title: " + this.title + " author :" + this.author  ;
	}

	public Book (String title, String author) {
		setTitle(title);
		setAuthor(author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}

class Person{
	 String Name;
	 String job;
}

public class ObjectClass {
	
	
//	Book demian = new Book("데미안","헤르만 헤세"); 멤버변수니까 힙메모리 근데 메인은 static 생성주기를 생각해보면 쓸 수 없
	public static void main(String[] args) {
		Book demian = new Book("데미안","헤르만 헤세");
		System.out.println(demian);
		System.out.println(demian.toString());
		
		
		//같은 참조자료형인데 왜 위에건 주소값을 반환하고 String에 대해서는 그안에 담긴 값을 반환하나?
		// println은 기본적으로 object를 받으면 그 object의 담긴 값(주소)을 스트링으로 출력하는데 toString
		// String자료형은 기본적으로 toString이 주소가 가르키는 값을 가르키도록 overriding 되어있다.
		// Book이라는 class의 toString을 override함으로써 출력값을 커스텀할 수 있다.
		String newString = new String("lorem ipsum");
		System.out.println(newString);
		String secondString = "lorem ipsum";
		System.out.println(secondString);
		
		Person geo = new Person();
		System.out.println(geo);
		System.out.println(geo.hashCode());
	}


	
}
