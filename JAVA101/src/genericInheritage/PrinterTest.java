package genericInheritage;

public class PrinterTest {
   
	public static void main(String[] args) {
		
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		
		GenericPrinter<Plastic> plasticPrinter =  new GenericPrinter<>();
		//다이아몬드 연산자사용하지 않으면 자동으로 object라고 인식 
		
		plasticPrinter.setMaterial(plastic);
		Plastic pl = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		System.out.println(pl);
		
		//genericPrinter는 이제 material을 상속받는 클래스만 지정할 수 있다.
//		GenericPrinter<String> stringPrinter = new GenericPrinter<>();
//		stringPrinter.setMaterial("water");
//		System.out.println(stringPrinter);
//		
	
		
		
	}
}
