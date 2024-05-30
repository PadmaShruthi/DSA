package linkedList;

public class DoublyCLL {
	Node head;
	DoublyCLL(){
        this.head = null;
    }
    
    void addLast (int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.nxt != head){
            current = current.nxt;
        }
        current.nxt = newNode;
        newNode.prev = current;
        newNode.nxt = head;
        head.prev = newNode;
    }
    
    void addBegin (int data){
        Node newNode = new Node (data);
        if (head == null){
            head = newNode;
            newNode.nxt = head;
            head.prev = newNode;
            return;
        }
        Node current = head;
        while (current.nxt != head){
            
            current = current.nxt;
        }
        
        current.nxt = newNode;
        newNode.nxt = head;
        head = newNode;
        newNode.prev = current;
    }
    
    void addAtSpec( int index, int data){
        Node newNode = new Node (data);
        if (head == null){
            head = newNode;
            newNode.nxt = head;
            head.prev = newNode;
            return;
        }
        if (index == 1){
            addBegin(data);
            return;
        }
        Node current = head;
        int c=0;
        while (current.nxt != head){
            if (c == index-2){
                break;
            }
            current = current.nxt;
            c++;
        }
        newNode.prev = current;
        newNode.nxt = current.nxt;
        current.nxt = newNode;
        current.nxt.prev = newNode;
    }
    
    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.data + " -> ");
                if (node.nxt != null) {
		            node = node.nxt;
		        }
            } while (node != head);
        }
        System.out.println("HEAD");
    }
    class Node{
        int data;
        Node nxt, prev;
        Node(int data){
            this.data = data;
            this.nxt = null;
            this.prev = null;
        }
    
    }

}

