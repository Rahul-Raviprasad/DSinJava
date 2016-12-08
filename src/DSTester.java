
public class DSTester {
  //Test out singly linked list
	public static void main(String[] args) {
		
		SinglyLinkedList llist = new SinglyLinkedList();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		/* Three nodes have been allocated  dynamically.
        We have references to these three blocks as first,  
        second and third

        llist.head        second              third
           |                |                  |
           |                |                  |
       +----+------+     +----+------+     +----+------+
       | 1  | null |     | 2  | null |     |  3 | null |
       +----+------+     +----+------+     +----+------+ */

      llist.head.next = second; // Link first node with the second node

      /*  Now next of first Node refers to second.  So they
          both are linked.

       llist.head        second              third
          |                |                  |
          |                |                  |
      +----+------+     +----+------+     +----+------+
      | 1  |  o-------->| 2  | null |     |  3 | null |
      +----+------+     +----+------+     +----+------+ */

      second.next = third; // Link second node with the third node

      /*  Now next of second Node refers to third.  So all three
          nodes are linked.

       llist.head        second              third
          |                |                  |
          |                |                  |
      +----+------+     +----+------+     +----+------+
      | 1  |  o-------->| 2  |  o-------->|  3 | null |
      +----+------+     +----+------+     +----+------+ */
      
      
      llist.append(6);
      
      // Insert 7 at the beginning. So linked list becomes
      // 7->6->NUllist
      llist.push(7);

      // Insert 1 at the beginning. So linked list becomes
      // 1->7->6->NUllist
      llist.push(1);

      // Insert 4 at the end. So linked list becomes
      // 1->7->6->4->NUllist
      llist.append(4);
      llist.deleteNode(1);
      llist.deleteNodeAtposition(0);

      
      llist.printList();
      
      System.out.println(llist.getCount() + ": count of nodes in list");
      
		
		
	}
}
