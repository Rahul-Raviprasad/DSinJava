package Stack;

public class StackArrayBased {

	// Fixed size array implementation
	//length of the array used to implement the stack
	protected int capacity;
	
	//default array capacity
	public static final int CAPACITY = 20;
	
	// our stack
	protected int[] stack;
	
	// the index of the top element in the stack. -1 implies that there is no element
	protected int top = -1;
	
	// constructors
	// initializes with the default capacity
	public StackArrayBased() {
		this(CAPACITY);
	}
	// initializes with user given capacity.
    public StackArrayBased(int cap) {
		capacity = cap;
		stack = new int[capacity];
	}
    
    // returns the number of elements in the stack. This method runs in O(1) time
    public int size() {
    	return (top + 1);
    }
    // check if stack is empty. time complexity O(1)
    public boolean isEmpty() {
    	return (top < 0);
    }
    // insert an element to top of stack. O(1) time complexity
    public void push(int data) throws Exception{
    	if(size() == capacity) {
    		throw new Exception("Stack is Full Exception");
    	}
    	stack[++top] = data;
    }
    // pops the top element out of the stack. O(1) time complexity
    public int pop() throws Exception {
    	int data;
    	if(size() == 0) {
    		throw new Exception("Stack is empty exception. pop not possible");
    	}
    	data = stack[top];
    	stack[top--] = Integer.MIN_VALUE; // at current top index value is set to interger min and then top reduced
    	return data;
    }
    
    
	
}
