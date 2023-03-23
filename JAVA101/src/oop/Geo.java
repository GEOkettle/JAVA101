package oop;

public class Geo {

	int num1;
	static int num2;
	public String name;
	
	public Geo() {}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		
		Geo jiwon = new Geo();
		jiwon.setName("jiwon");
		
		Geo geo = new Geo();
		geo.setName("geo");
	}

}
