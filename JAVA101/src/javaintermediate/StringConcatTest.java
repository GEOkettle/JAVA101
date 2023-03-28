package javaintermediate;

public class StringConcatTest {

	public static void main(String[] args) {

		StringConcatImpl  strImpl = new StringConcatImpl();
		
		strImpl.makeString("hillow","class");
		
		StringConcat concat = (x,y) -> System.out.println(x+ "  "+ y);
		
		concat.makeString("hillow", "lamda");
	}

}
