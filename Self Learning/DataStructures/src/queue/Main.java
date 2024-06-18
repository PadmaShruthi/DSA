package queue;

public class Main {
	public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(3);
//        queue.insert(6);
//        queue.insert(5);
//        queue.insert(19);
//        queue.insert(1);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.insert(133);
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.insert(99);
//        queue.display();
		
//		CircularQueue queue = new CircularQueue(5);
//        queue.insert(3);
//        queue.insert(6);
//        queue.insert(5);
//        queue.insert(19);
//        queue.insert(1);
//
//        queue.display();
        
		DynamicCircularQueue queue = new DynamicCircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);
        queue.remove();
        queue.display();
        queue.insert(10);
        queue.display();
//        System.out.println(queue.remove());
//        queue.insert(133);
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.insert(99);
//        queue.display();

    }
}
