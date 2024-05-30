package linkedList;

public class DoublyLL {
private Node head;
    
    DoublyLL(){
        this.head=null;
    }
    
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }
    
    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public void deleteFirst(int val){
        Node node = head;
        
        if (head == null){
            return;
        }
        
        if (node.val == val){
            head = head.next;
        }
        
        if(node.next != null){
            node.next.prev = node.prev;
        }
        
    }
    
    public void deleteLast(int val){
        Node node = head;
        
        while (node.next != null){
            node = node.next;
        }
        
        if (node.prev !=null){
            node.prev.next = node.next;
        }
    }
    
    public void deleteSpecval(int val){
        Node node = head;
        while (node.next != null){
            if (node.val == val){
                node.prev.next = node.next;
                node.next.prev = node.prev;
                break;
            }
            node = node.next;
        }
    }
    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

	void rotate(int rotation){
	        int c = 0;
	        Node current = head;
	        Node tail = null;
	        Node temp = null;
	        while(current.next != null){
	            c++;
	            if(c == rotation){
	                temp = current.next;
	                tail = current;
	            }
	            current = current.next;
	        }
	        current.next = head;
	        head.prev = current;
	        head = temp;
	        head.prev = null;
	        tail.next = null;
	    }
	class Node{
		int val;
		Node next;
		Node prev;
		
		Node(int val){
			this.val = val;
			this.next = null;
			this.prev = null;
		}
	}
}