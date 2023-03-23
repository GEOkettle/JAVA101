package datatype;

public class Constructor {
	public int id;
	public String name;
	public String address;
	public String job;
	public double number;
	
	public String showInfo () {
		return  id + "\n" + name + "\n" + address + "\n" + job + "\n" + number ;
	}
	public Constructor() {}
	public Constructor(int id, String name, String address, String job) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.job = job;
	}
	
	
}
