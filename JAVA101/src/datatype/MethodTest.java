package datatype;

public class MethodTest {
	
	//member variable
	public int studentId;
	public String studentName;
	public String address;
	
	
	//member method
	public void showStudentInfo() {
		System.out.println(studentId + "학번의 이름은" + studentName + "이고, 주소는" + address + "입니다.");
	}
	
	
	//getter
	public String getStudentName() {
		return studentName;
	}
	
	//setter
	public void setStudentname(String name) {
		studentName = name;
	}
	//getter
	public String getAddress() {
		return address;
	}
	
	//setter
	public void setAddress(String loca) {
		address = loca;
	}
	
}
