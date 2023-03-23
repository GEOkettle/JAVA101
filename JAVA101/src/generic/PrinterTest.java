package generic;

public class PrinterTest {
   
	public static void main(String[] args) {
		
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder) printer.getMaterial();
		//ThreeDPrinter3가 받는 자료형은 Object이므로 이걸 Powder에 대입하려면
		//다운캐스팅 
		System.out.println(printer);
		
		
		GenericPrinter<Plastic> plasticPrinter =  new GenericPrinter<>();
		//다이아몬드 연산자사용하지 않으면 자동으로 object라고 인식 
		
		plasticPrinter.setMaterial(plastic);
		Plastic pl = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		System.out.println(pl);
		
		GenericPrinter<String> stringPrinter = new GenericPrinter<>();
		stringPrinter.setMaterial("water");
		System.out.println(stringPrinter);
		
	
		
		
	}
}
