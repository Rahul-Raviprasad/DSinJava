
public class SinglyLinkedList {
	Node head;
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	
	//this method a new node to the front of the linked list. Time complexity of
	//is O(1) as it takes constant time to get this done
	public void push(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	//This methiod inserts a node after a particular Node. Note the implementation assumes
	//we know the node(have pointer to node) after which we need to insert. So this function takes
	// constant time.
	public void insertAfter(Node prevNode, int data) {
		//check if the given node is null
		if(prevNode == null) {
			System.out.println("prev node is null");
			return;
		}
		// allocate a node and put in data
		Node newNode  = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	
	//This method appends a node at the end of the linkedlist
	//The time complexity of this function be O(n)
	// This method can be optimized to keep a refernce to the last pointer and then we can O(1) time
	public void append(int data) {
		// if the linked list is empty then create a new node and make it the head
		if(head == null) {
			head = new Node(data);
			return;
		}
		
		Node newNode = new Node(data);
		newNode.next = null;
		
		Node last =  head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		return;
	}
	
	// given a particular key, it deletes the first occurrence of the key  in the linked list
	public void deleteNode(int key) {
		Node temp = head, prev = null;
		if(temp != null && temp.data == key) {
			head = temp.next; // change the head since head has the key
			return;
		}
		//search for the key while incrementing the pointer to current and prev node
		while(temp.next != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		// If key was not present in list
		if(temp == null) return;
		
		//Unlink
		prev.next = temp.next; //this is where the deletion is happening 
		return;
	}
	
	//
	public void deleteNodeAtposition(int pos) {
        // If linked list is empty
        if (head == null)
            return;
 
        // Store head node
        Node temp = head;
 
        // If head needs to be removed
        if (pos == 0)
        {
            head = temp.next;   // Change head
            return;
        }
 
        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<pos-1; i++)
            temp = temp.next;
 
        // If position is more than number of ndoes
        if (temp == null || temp.next == null)
            return;
 
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;
 
        temp.next = next;  // Unlink the deleted node from list
    }
	
	//return the number of nodes present in the linked list
	public int getCount() {
		Node temp = head;
		int count = 0;
		if(temp == null) {
			return 0;
		}
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
}
