package datastructure;

public class MyArray {
	
	int[] intArr;   	//int array
	int count;  		//개수
		
	public int ARRAY_SIZE; //배열의 길이
	public static final int ERROR_NUM = -999999999;
	
	//생성자 파라메터가 없으면 길이가 10인 정수배열을 생성
	public MyArray()
	{
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	//파라메터만큼의 사이즈의 배열을 생성
	public MyArray(int size)
	{
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	//append 맨뒤에하나씩 넣어주다가 넣으려는 곳이 지정한 사이즈보다 크면 메모리부족오류반환
	public void addElement(int num)
	{
		if(count >= ARRAY_SIZE){
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
				
	}

	
	public void insertElement(int position, int num)
	{
		int i;
		
		if(count >= ARRAY_SIZE){  //꽉 찬 경우
			System.out.println("not enough memory");
			return;
		}
		
		//지정한 범위 너머의 인덱스에 값을 집어넣으려고할 경우 
		if(position < 0 || position > count ){  //index error
			System.out.println("insert Error");
			return;
		}
		
		//   맨끝자리부터        넣으려는 위치까지  하나씩 이동하면서 뒤로밀어줌
		for( i = count-1; i >= position ; i--){
			intArr[i+1]  = intArr[i];        //다음자리로 하나씩 이동 공간창출
		}
		//다밀었으면 넣으려는공간(비워놓은 공간)에 대입
		intArr[position] = num;
		//현재갯수 하나 더함 
		count++;
	}
	
	public int removeElement(int position)
	{
		int ret = ERROR_NUM;
		
		if( isEmpty() ){
			System.out.println("There is no element");
			return ret;
		}
		
		//count는 index+1 이니까 count와 같거나 큰곳의 element를 없애달란말은 없는걸 없애란소리잖아
		if(position < 0 || position >= count ){  //index error
			
			System.out.println("remove Error");
			return ret;
		}
		
		ret = intArr[position];
		//     삭제하려는 포지션     배열의길이   포지션보다 뒤로가면서 하나하나 앞으로 땡겨줌 
		for(int i = position; i<count -1; i++ )
		{
			intArr[i] = intArr[i+1];
		}
		//끝난뒤에 전체 갯수 줄이고 
		count--;
		//삭제한 놈 반환 
		return ret;
	}
	
	public int getSize()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		if(count == 0){
			return true;
		}
		else return false;
	}
	
	public int getElement(int position)
	{
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	
	public void removeAll()
	{
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;
	}

}
