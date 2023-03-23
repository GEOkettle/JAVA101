  package datatype;

public class Birthday {

int year;

public void setYear(int year) {

this.year = year;
//파라메터로 받은 year를 this.year에 할당한다
//여기서 this는 birthday의 멤버변수와 메서드가 저장된 메모리를 바라본다.

}
//생성자에서 다른 생성자를 호출하는 this
public Birthday () {	

	//System.out.println("실행안됨");
	this(1994);
	System.out.println(this);
//여기서 this는 다른 생성자를 의미한다
}
public Birthday (int year) {
	this.year =year;
    System.out.println(this);
	//여기에서 this는 당연히 Birthday클래스가 생성한 인스턴스의 멤버변수와 메서드가 있는 메모리의 값을 지칭

}
public Birthday getSelf(){
	 return this;
	}

}