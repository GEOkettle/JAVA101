package datatype;

public class Student {
	
	int studentID;
	String studentName;
	
	Subject subject1;
	Subject subject2;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		subject1 = new Subject();
		subject2 = new Subject();
	}
	
	
	public void setSubject1(String name, int score) {
		subject1.subjectName = name;
		subject1.score = score;
	}
	
	public void setSubject2(String name, int score) {
		subject2.subjectName = name;
		subject2.score = score;
	}
	
	public void showStudentSocre() {
		int total = subject1.score + subject2.score;
		System.out.println(studentName +  " 학생의 총점은 " + total + "점 입니다." );
		
	}
}
