package queue;

public class CustomQueue {
	private int end = 0;
	
	private int[] data;
	
	private final static int DEFAULT_SIZE = 10;
	
	 public CustomQueue(){
	        this(DEFAULT_SIZE);
	    }

	 public CustomQueue(int size) {
	        this.data = new int[size];
	    }
	 
	 public boolean isFull() {
	        return end == data.length; // ptr is at last index
	    }

	 public boolean isEmpty() {
	        return end == 0;
	    }
	 
	 public void insert(int item) {
		 if(isFull()) {
			 System.out.println("Queue is full");
		 }
		 data[end++] = item;
		 
	 }
	 
	 public int remove() {
		 if(isEmpty()) {
			 System.out.println("Queue is empty");
		 }
		 
		 int removed = data[0]; // remove the element in first index
		 
		 //shift all the elements to the left size
		 for(int i = 1; i < end; i++) {
			 data[i-1] = data[i];
		 }
		 end--;
		 return removed;
	 }
	 
	 public void display() {
		 for(int i=0; i<data.length; i++) {
			 System.out.print(data[i] + "->");
		 }
		 System.out.println("END");
	 }
	
}
