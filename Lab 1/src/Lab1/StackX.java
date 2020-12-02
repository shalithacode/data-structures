package Lab1;

public class StackX {

	private int top;
	private char[] stackArray;
	private int maxSize;
	
	public StackX(int s) {
		
		this.maxSize = s;
		top = -1;
		stackArray = new char[maxSize];
	}
	
	public void push(char j) {
		if (top==maxSize - 1) {
			System.out.println("stack is full !");
		}
		else {
			stackArray[++top] = j;
		}			
}
	
	public char pop() {
		if(top == -1) {
			System.out.println("stack is empty !");
			return ' ';
		}
		else{
			return stackArray[top--];
		}
		
	}
	public char peek() {
		
		if(top == -1) {
			System.out.println("stack is empty !");
			return ' ';
		}
		else{
			return stackArray[top];
		
	}
}
	public boolean Isempty() {

		if(top == -1) {
			
			return true;
		}
		else return false;
	
}
	public boolean Isfull() {

		if(top == maxSize-1) {
			
			return true;
		}
		else return false;
	}}