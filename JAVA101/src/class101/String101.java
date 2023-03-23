package class101;

public class String101 {
	
	
	
	public static void main(String[] args) {
		//heap memory
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		
		//constant pool
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3==str4);
		
		String movie = "matrix";
		String year = "1999";
		
		
		System.out.println(System.identityHashCode(movie));
		// movie = movie + year;
		movie = movie.concat(year); 
		System.out.println(System.identityHashCode(movie));
		//이렇게 movie에 재할당을 해주어도 "matrix"라는 데이터는 메모리에 남고 movie가 가르키는 data가 
		// matrix1999로 변했을 뿐.
		// 메모리 낭비를 최소화 하기위하여 StringBuffer 혹은 StringBuilder등을 사용한다.
		
		
		//Stringbuilder/Stringbuffer
		//단일쓰레드용     / 멀티쓰레드용
		// 내부적으로 가변적인 char[]를 멤버 변수로 가짐
		//문자열을 여러번 연결하거나 변경할 때 사용하면 유용함
		//새로운 인스턴스를 생성하지 않고 char[] 를 변경함
		//추가한 후 toString() 메서드로 String반환

		String java = "java";
		String android = "android";
		//char[] 배열이니 append로추가
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));//같다
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));//같다
		System.out.println(buffer.charAt(0));	
		String result = buffer.toString();
		System.out.println(result);
		System.out.println(buffer.getClass());
		System.out.println(buffer.toString().getClass());
		
	

	}

}
