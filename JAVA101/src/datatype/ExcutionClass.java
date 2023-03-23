package datatype;

import java.util.Arrays;
import java.util.Calendar;

//같은패키지안에서 import없이 쓸수 있다
public class ExcutionClass {
	public static void main(String[] args) {
		System.out.println(args);
		System.out.println("============linebreaker=======================");
		MethodTest studentGeo = new MethodTest();
		//이렇게 클래스로 생성해낸 객체(studentGeo)를 인스턴스라 한다.
		
		System.out.println(studentGeo.studentId);
		//참조변수에 직접할당(비추)
		studentGeo.studentId = 13252522;
		System.out.println(studentGeo.studentId);
		System.out.println(studentGeo.getStudentName()); 
		//setter를 통한 할당(추천)
		studentGeo.setStudentname("geo");
		System.out.println(studentGeo.getStudentName());
		System.out.println(studentGeo.getAddress());
		studentGeo.setAddress("부산광역시 남구");
		System.out.println(studentGeo.getAddress());
		studentGeo.showStudentInfo();
		
		MethodTest studentKyun = new MethodTest();
		studentKyun.studentId = 12345;
		studentKyun.studentName = "kyun";
		studentKyun.address = "부산광역시 수영구";
		studentKyun.showStudentInfo();  
		
		System.out.println(studentGeo);
		System.out.println(studentKyun);
		//datatype.MethodTest@49e4cb85 메모리주소값
		//datatype.MethodTest@2133c8f8	
		
		
		Constructor conGeo = new Constructor();
		System.out.println("conGeo");
		System.out.println(conGeo);
		System.out.println(conGeo.showInfo());
		
		Constructor conKyun = new Constructor(12345,"kyun","부산광역시 수영구","webdev");
		System.out.println(conKyun.showInfo());
		
		
		Order firstOrder = new Order(12345,"01093532086","부산광역시 남구",20230315,1013,10000,003);
		firstOrder.showInfo();
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setSubject1("국어", 100);
		studentLee.setSubject2("수학", 95);
		
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setSubject1("국어", 80);
		studentKim.setSubject2("수학", 99);
		
		studentLee.showStudentSocre();
		studentKim.showStudentSocre();
		
		Private birthday = new Private();
		
		birthday.setDay(15);
		birthday.setMonth(11);
		birthday.setYear(1994);
		birthday.showDate();
		
		Birthday bd = new Birthday();
		System.out.println(bd);
		System.out.println(bd.year);
		System.out.println(bd.getSelf());
		
		
		Static ex1 = new Static();
		System.out.println(ex1.counter);
		ex1.setName("geo");
		ex1.counter++;
		System.out.println(ex1.counter);
		Static ex2 = new Static();
		ex2.setName("kyun");
		System.out.println(ex2.counter);
		
		
		
		System.out.println(Employee.getSerialNum());

		Employee geo = new Employee("geo","worker");
		
		
		System.out.println(Employee.getSerialNum());
		System.out.println(geo.getEmployeeid());		
		System.out.println(geo.getEmployeeName());		
		System.out.println(geo.getEmployeeLevel());	
		
		Singleton mode = Singleton.getMode();
		System.out.println(mode);
		System.out.println(Singleton.isStatus());
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		
		
		Book[] library = new Book[5];
		Book[] shallowCopiedLibrary = new Book [5];
		Book[] deepCopiedLibrary = new Book [5];
		
		System.out.println("============original library=============");
		for(int i = 0; i<library.length; i++) {
			library[i] = new Book("얼음과불의노래" +(i+1),"조지 마틴");
	        System.out.println(library[i]);
			library[i].showBookInfo();
		}
		
		// shallow copy
			System.arraycopy(library, 0, shallowCopiedLibrary, 0, 5);
			//                   카피할배열  시작위치 카피받을배열            시작  갯수
			System.out.println("============shallow copied library=============");
			for(int i = 0; i<shallowCopiedLibrary.length; i++) {
				
		        System.out.println(shallowCopiedLibrary[i]);
		        shallowCopiedLibrary[i].showBookInfo();
			}
		// deep copy
			System.out.println("============deep copied library=============");
		for (int i = 0; i<library.length; i++) {
			
			deepCopiedLibrary[i] = new Book(library[i].getTitle(),library[i].getAuthor());
			
			System.out.println(deepCopiedLibrary[i]);
			deepCopiedLibrary[i].showBookInfo();
		}
		
		
	}
}
