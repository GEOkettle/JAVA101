package datastructure;

public class MyArrayStack {

	int top;
	MyArray arrayStack; 
	
	public MyArrayStack()
	{
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size)
	{
		arrayStack = new MyArray(size);
	}
	
	public void push(int data)//맨마지막에 넣는다
	{
		if(isFull()){
			System.out.println("stack is full");
			return;
		}
		
		arrayStack.addElement(data);
		top++;//1개넣을때마다 1씩올라감
	}
	
	public int pop()//마지막껄 없애고 그걸 반환
	{
		if (top == 0){
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
		
	}
	
	public int peek()//마지막껄 보여줌
	{
		if (top == 0){
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(top-1);
	}
	
	public int getSize()
	{
		return top;
	}
	
	public boolean isFull()
	{
		if(top == arrayStack.ARRAY_SIZE){
			return true;
		}
		else return false;
	}
	
	public boolean isEmpty()
	{
		if (top == 0){
			return true;
		}
		else return false;
	}
	
	public void printAll()
	{
		arrayStack.printAll();
	}
}
