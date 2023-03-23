package datatype;

public class TwoDimensionArray {

	public static void main(String[] args) {
		 
//		int[][] arr = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int [][] arr = new int[3][4];
		int i,j;
		int count = 0;
		for(i = 0; i<arr.length; i++) {
			for(j = 0; j<arr[i].length; j++) {
				count++;
				arr[i][j] =count;
			 System.out.print(arr[i][j]+ ",");	
			}
			count =0;
			System.out.println("\t" + arr[i].length);
		}
		

	}

}
