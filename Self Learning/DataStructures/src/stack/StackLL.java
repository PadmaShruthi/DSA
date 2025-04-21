package stack;

public class StackLL {
    private Node top;
    private Node bottom;
    private int length;

    public StackLL() {
        top = null;
        bottom = null;
        length = 0;
    }

    public String peek() {
        if (length > 0) {
            return top.value;
        } else {
            return null;
        }
    }

    public void push(String value) {
        Node newNode = new Node(value);
        if (length == 0) {
            top = newNode;
            bottom = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        this.length++;
    }

    public void pop() {
        if (length > 0) {
            top = top.next;

            if (length == 1) {
                bottom = null;
            }
            length--;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public String getLastElement() {
        if (length > 0) {
            return bottom.value;
        }
        return null;
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