package datatype;

public class Employee {
	
	private static int serialNum = 0;
	
	private int employeeid;
	private String employeeName;
	private String employeeLevel;
	
	
	
	public Employee (String employName, String employLevel) {
		serialNum++;
		this.employeeid = serialNum;
		setEmployeeName(employName);
		setEmployeeLevel(employLevel);
		
	}
	
	public static int getSerialNum() {
		int i = 0;//local변수
		
		//this.employName = "멤버변수 참조불가";//Cannot use this in a static context
		//employName = "멤버변수 참조불가";//Cannot use this in a static context
		//static변수가 인스턴스 생성전에 데이터 영역에 저장되어있든 static 메서드도 그러한데
		//인스턴스가 생성하기도 전에 인스턴스의 데이터에 접근할 수 없으니까 static메서드 안에서는
		//멤버변수와 메서드를 참조할 수 없다
		
		
		return serialNum;//static변수
	}

	
	public int getEmployeeid() {
		return employeeid;
	}
	
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeLevel() {
		return employeeLevel;
	}
	
	public void setEmployeeLevel(String employeeLevel) {
		this.employeeLevel = employeeLevel;
	}
	
	

}
