package datatype;

public class Private {
		
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; 
	
	public int getDay(){
		 return day;
	}
	public void setDay(int day){
		
		if(day<1 || day>31) {
			isValid = false;
			
		}else {
			isValid = true;
			this.day = day;
		}
	}

	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month <1 || month>12) {
			isValid = false;
		}else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void showDate() {
		if(isValid) {
			System.out.println(year + "-" + month + "-" + day);	
			System.out.println(this);
		}else {
			System.out.println("유효하지않은날짜입니다.");
		}
	}
}

