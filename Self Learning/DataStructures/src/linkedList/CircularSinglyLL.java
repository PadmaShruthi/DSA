package linkedList;

public class CircularSinglyLL {

		Node head; //to check the first node
		Node tail; // to check the last node
		int size; // to get the size of linked list 

		CircularSinglyLL(){
			this.head = null;
			this.tail = null;
			this.size = 0;
		}
		
	    public void insertFirst(int val) {
	                Node node = new Node(val);
	                if (head == null) {
	                    head = node;
	                    tail = node;
	                    return;
	                }
	        
	                tail.next = node;
	                node.next = head;
	                head = node; //add at first, making newnode as head
	            }
	    
	    public void insertLast(int val) {
	            Node node = new Node(val);
	            if (head == null) {
	                head = node;
	                tail = node;
	                return;
	            }
	    
	            tail.next = node;
	            node.next = head;
	            tail = node; //add at first, making newnode as tail
	        }
	        
	    void addToSpeci(int index, int val) {
			Node newnode = new Node(val);
			if(head == null) {
				head = newnode;
				return;
			}
			// index starts from 0, if index is 0 so call begin method
			if (index == 0) {
				insertFirst(val);
				return;
			}
			// size has the total length of LL, if index is same as size, call last method
			if (index == size) {
				insertLast(val);
				return;
			}
			
			Node current = head;
			for (int i=1; i<index; i++) {
				current = current.next;
			}
			newnode.next = current.next;
			current.next = newnode;
			size++;
		}
		
		public void delete(int val){
		    Node node = head;
		    //if there is no node in the list
		    if (node == null){
		        return;
		    }
		    //if the val to delete itself is head
		    if (node.val == val){
		        head = head.next;
		        tail.next = head;
		        return;
		    }
		    //if the value to delete is in the middle of the list
		    do{
		        Node n = node.next; //n is the pointer pointed by the node.next
		        if (n.val == val){
		            node.next = n.next;
		            break;
		        }
		        node = node.next;
		    }while(node != head);
		    
		}

	 	public void display() {
	        Node node = head;
	        if (head != null) {
	            do {
	                System.out.print(node.val + " -> ");
	                if (node.next != null) {
			            node = node.next;
			        }
	            } while (node != head);
	        }
	        System.out.println("HEAD");
	    }
		
	 	class Node{
	 		int val;
	 		Node next;
	 		Node(int val){
	 			this.val = val;
	 			this.next = null;
	 		}
	 	}

}
