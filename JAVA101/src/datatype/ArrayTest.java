package datatype;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int total =0;
		
		for(int i = 0; i<arr.length; i++) {
			
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			
			total += arr[i];
		}
		
		System.out.println(total);
		System.out.println(Arrays.toString(arr));
		
		 //근데 js랑다르게 java에서 배열은 길이가 정해져있는데
		//예를들어
//		int[] dumbArray = new int[5];
//		int multiply = 1;
//		dumbArray[0] = 1;
//		dumbArray[1] = 2;
//		dumbArray[2] = 3;
//		dumbArray[3] = 4;
//		
//		for(int i = 0; i<dumbArray.length; i++) {
//			multiply *=dumbArray[i];
//		}
//		
//		System.out.println(Arrays.toString(dumbArray));
//		System.out.println(multiply);
//		//이렇게 되면 지정하지 않은 마지막 5번째 인덱스는 기본값 0을 가지므로 곱셈의 결과가 0이나옴
		//그래서
		int[] smartArray = new int[5];
		int count = 0;
		
		smartArray[0] = 1; count++;
		smartArray[1] = 2; count++;
		smartArray[2] = 3; count++;
		smartArray[3] = 4; count++;
		
		int multiply = 1;
		for(int i = 0; i<count; i++) {
			multiply *=smartArray[i];
		}
		System.out.println(Arrays.toString(smartArray));
		System.out.println(multiply);
		
		char[] alphabets = new char[26];
		char ch = 'a';
		
		for(int i =0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
			
		}
		System.out.println(Arrays.toString(alphabets));
	}
	
	

}
