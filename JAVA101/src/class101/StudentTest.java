package class101;

 class Student implements Cloneable {
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName ) {
		setStudentNum(studentNum);
		setStudentName(studentName);
		
	}
	
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(this.studentNum==std.studentNum) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{studentNum: " + studentNum +","+ "\n" + "studentName: "  +studentName+"}" ;
		
	}
	
}


public class StudentTest{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student geo = new Student(1,"geo");
		System.out.println(geo);
		
		Student jiwon = new Student(1,"jiwon");
		System.out.println(jiwon);
		
		Student ji = jiwon;
		
		System.out.println(geo == jiwon);
		System.out.println(geo.equals(jiwon) );
		System.out.println(jiwon.equals(geo) );
		
		System.out.println(geo.hashCode());
		System.out.println(jiwon.hashCode());
		System.out.println(ji.hashCode());
		
		System.out.println(System.identityHashCode(geo));
		System.out.println(System.identityHashCode(jiwon));
		System.out.println(System.identityHashCode(ji));
		
		Student anderson = (Student) geo.clone();
		System.out.println(anderson);
		System.out.println(anderson.hashCode());
		System.out.println(System.identityHashCode(anderson));
	}
}
