
public class StackArrayImplementation {
	
	int Top;
	int capacity;
	int[] Stack;

	
	StackArrayImplementation(){
		Top=-1;
		capacity=10;
		Stack = new int[capacity];
	}
	public boolean isEmpty() {
		return Top == -1;
	}
	public boolean isFull() {  
		return Top==capacity-1;
	}
	public int  push(int data) {  //This method add top of element 
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		return Stack[++Top]=data;
	}
	public int pop() {     //This method delete top of element
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		
		return Stack[Top--];
	}
	public int peek() {   //This method give the top of element  
		return Stack[Top];
	}
	public static void main(String[] args) {
		StackArrayImplementation sai= new StackArrayImplementation();
		sai.push(10);
		sai.push(20);
		sai.push(30);
		sai.push(40);
		sai.push(50);
		System.out.println(sai.isEmpty());
		System.out.println(sai.isFull());
		System.out.println(sai.capacity);
		System.out.println(sai.peek());
		System.out.println(sai.pop());
	}

}
