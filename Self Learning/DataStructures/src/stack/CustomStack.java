package stack;

public class CustomStack {
	int top = -1;
    int[] array;
    private static final int DEFAULT_SIZE = 10;
    
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.array = new int[size];
    }
    
    void push(int item){
        if (isFull()){
            System.out.println("Stack is full");
        }
        top++;
        array[top] = item;
    }
    
    int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }
        int val = array[top];
        top--;
        
        return val;
        //return array[top--];
    }
    
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from an empty stack!!");
        }
        return array[top];
    }

    public boolean isFull() {
        return top == array.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return top == -1;
    }
    
    void display(){
        for(int i=0; i<=top; i++){
            System.out.print(array[i] + " ");
        }
    }
}
