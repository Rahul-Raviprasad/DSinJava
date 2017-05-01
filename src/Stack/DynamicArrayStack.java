package Stack;

public class DynamicArrayStack {
	// length of the array used for implementing stack
	protected int capacity;
	
	//default array capacity
	public static final int CAPACITY = 16; // some power of 2
	public static int MINCAPACITY = 1 << 15; // power of 2
   
	//stack array
	protected int[] stack;
	
	// top: index for top element in the stack
	protected int top = -1;
	
	public DynamicArrayStack() {
		this(CAPACITY);
	}
	
	public DynamicArrayStack(int cap) {
		capacity = cap;
		stack = new int[capacity];
	}
	
	// returns the size of the stack : O(1) time
	public int size() {
		return top + 1;
	}
	
	// check if stack is empty
	public boolean isEmpty() {
		return size() == 0;
	}
	
	// pushes an elment to the top of the stack : O(1)
	public void push(int element) {
		if(size() == capacity) {
			expand();
		}
		stack[++top] = element;
	}
	
	// private as this is just a helper function, and should not called from outside
	//O(n) time
	private void expand() {
		int length = size();
		int[] newStack = new int[length << 1];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
	}
	
	// shrinks the stack to 1/2 when it find it to be less than 3/4
	private void shrink() {
		int length = top + 1;
		if(length <= MINCAPACITY || top << 2 >= length) {
			return;
		}
		length =  length + (top << 1); //shrink to half or less than heap size
		if(top < MINCAPACITY) length = MINCAPACITY;
		int[] newStack = new int[length];
		System.arraycopy(stack, 0, newStack, 0, top+1);
		stack = newStack;
	}
	
	// inspects and tells the top element in the stack without removing
	// O(1) time
	public int top() throws Exception {
		if(top < 0)
			throw new Exception("Stack is empty, no top element found");
		return stack[top];
	}
	
	// removes the top element from the stack and returns it. O(1) time
	public int pop() throws Exception {
		int data;
		if(isEmpty()) throw new Exception("Stack is empty");
		data = stack[top];
		stack[top--] = Integer.MIN_VALUE; // dereference for garbage collection 
		return data;
	}
	
	
}
