package datastructure;

public class MyLinkedList {

	private MyListNode head;
	int count;
	
	public MyLinkedList()
	{
		head = null;//맨처음노드
		count = 0 ;
	}
	
	public MyListNode addElement( String data )
	{
		
		MyListNode newNode;
		if(head == null){  //맨 처음일때
			newNode = new MyListNode(data);
			head = newNode;
		}
		else{
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while(temp.next != null)  //맨 뒤로 가서  
				//마지막 노드의 next에 새 노드의 주소값을 넣어줘서 포인터로 가르키게한다.
				//재귄줄 아랐네 ㅡㅡ
				//오 씨 어케만들지 대가리 존나좋네
				//앞으로 자료구조 가져다쓸때 절세번하고 써야게따
				temp = temp.next;
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data )
	{
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count ){
			System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 앞으로 들어가는 경우
			//요건쉽고
			newNode.next = head;
			head = newNode;
		}
		else{
			MyListNode preNode = null;	
			//position째의 노드를 찾는과정 앞에서부터 
			for(i=0; i<position; i++){
				preNode = tempNode; //  position-1번째 가면 멈추겠네
				tempNode = tempNode.next;//하나하나 세는거지
				
			}
			newNode.next = preNode.next; //원래 내앞에 있던애가 가르키던주소를 내 next에 할당 (그래야 이어지니까)
			preNode.next = newNode;//새노드의 주소를 position-1번쨰의 노드가 가르키는 포인터에 할당
		}
		count++;//전체 갯수 증가
		return newNode;
	}
	
	public MyListNode removeElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 앞을 삭제하는
			head = tempNode.next;
		}
		else{
			MyListNode preNode = null;	
			for(i=0; i<position; i++){
				preNode = tempNode; // position -1 번째
				tempNode = tempNode.next;// 마지막엔 position번째
			}
			preNode.next = tempNode.next;//position-1번의 next는 원래 position의 주소를 가르키는데
										 //이걸 position번째의 노드의 next가 가르키던 주소로 넣으면
										// 자연스럽게 position은 선상에서 제외되지.
		}
		count--; //전체 갯수 감소
		System.out.println(position + "번째 항목 삭제되었습니다.");
		
		return tempNode;
	}
	
	public String getElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(position == 0){  //맨 인 경우

			return head.getData();
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode.getData();
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 인 경우

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	public void removeAll()
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
	}
	
}
