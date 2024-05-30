package linkedList;

public class SinglyLL {
	Node head; //to check the first node
	Node tail; // to check the last node
	int size; // to get the size of linked list 
	
	SinglyLL(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	
	void addLast(int data) {
		Node newnode = new Node(data);
		if(tail == null) {
			addBegin(data);
			return;
		}
		
		tail.nxt = newnode;
		tail = newnode;
		size++; // increase the size after every insertion to get the total size
	}
	void addBegin(int data) {
		Node newnode = new Node(data);
		
		if(head != null){
			newnode.nxt = head; 
			}
		
		head = newnode;
		if (tail == null) {
			tail = head;
		}
		size++;
	}
	void addToSpeci(int index, int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			return;
		}
		// index starts from 0, if index is 0 so call begin method
		if (index == 0) {
			addBegin(data);
			return;
		}
		// size has the total length of LL, if index is same as size, call last method
		if (index == size) {
			addLast (data);
			return;
		}
		
		Node current = head;
		for (int i=1; i<index; i++) {
			current = current.nxt;
		}
		newnode.nxt = current.nxt;
		current.nxt = newnode;
		size++;
	}
	
	int deleteFirst(){
	    if(head != null){ //add this null check to avoid null pointer exception
	        int data = head.data; // data is the value to be returned
	        head = head.nxt;
	        size--; // reduce the size after every deletion
	        return data;
	    }
	    //if there is no node in the list, make the tail also null
	    if (head == null){
	        tail = null;
	        
	    }
	    return 0; //if there is no data matched return 0
	}
	
	int deleteLast(){
	    //if there is only one node in the list, call deleteFirst
	    if (size <= 1) {
            return deleteFirst();
        }
        //to reach the last node in the list, traverse till the node's next is equal to tail, else move forward t0 nextnode 
	    Node node = head;
	    while(node.nxt != tail){
	        node = node.nxt;
	    }
	    int data = node.nxt.data; //return the node's next data i.e the tail's value
	    tail = node;
	    tail.nxt = null;
	    size--;
	    return data;
	}
	
	int deleteAtSpec(int index){
	    //if index is 0, first node deletion
	    if (index == 0){
	        deleteFirst();
	    }
	    //if index is equal to size-1 (0 based indexing), last node deletion
	    if(index == size - 1){
	        deleteLast();
	    }
	    //if the deletion is in the middle, reach one index before the given index to change the pointer(index-1)
	    Node node = head;
	    for(int i=0;i<index-1;i++){
	       node = node.nxt; 
	    }
	    int data = node.nxt.data;
	    node.nxt = node.nxt.nxt;
	    size--;
	    return data;
	}
	void traverse() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.nxt;
		}
		System.out.println("Size: " + size);
	}
}

class Node{
	int data;
	Node nxt;
	Node(int data){
		this.data = data;
		this.nxt = null;
	}

}
