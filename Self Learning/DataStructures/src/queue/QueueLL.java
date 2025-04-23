package queue;

public class QueueLL {
	Node first = null;
	Node last = null;
	int length = 0;

	public String peek() {
		if (this.length > 0) {
			return this.first.value;
		} else {
			return null;
		}
	}

	public void enqueue(String value) {
		Node newNode = new Node(value);
		if (this.length == 0) {
			this.first = newNode;
		} else {
			this.last.next = newNode;
		}
		this.last = newNode;
		this.length++;
	}

	public void dequeue() {
		if (this.length > 0) {
			this.first = this.first.next;

			if (this.length == 1) {
				this.last = null;
			}
			this.length--;
		}
	}

	public boolean isEmpty() {
		return this.length == 0;
	}
	
	class Node{
    	String value;
    	Node next;
    	Node(String data){
    		this.value = data;
    		this.next = null;
    	}
    }
}
