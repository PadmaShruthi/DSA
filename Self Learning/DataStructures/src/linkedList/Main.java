package linkedList;

public class Main {
	public static void main(String[] args) {
		SinglyLL l1 = new SinglyLL();
		l1.addBegin(23);
    	l1.addBegin(45);
//		System.out.println(l1.deleteFirst());
		l1.addBegin(90);
 		l1.addLast(13);
 		l1.traverse();
// 		System.out.println(l1.deleteLast());
        System.out.println(l1.deleteAtSpec(1));
// 		l1.addBegin(78);
// 		l1.addToSpeci(0, 66);
// 		l1.addToSpeci(3, 67);
		l1.traverse();

		DoublyLL dl1 = new DoublyLL();
		dl1.insertFirst(45);
		dl1.insertFirst(90);
		dl1.insertFirst(13);
		dl1.insertLast(88);
		dl1.insertLast(65);
		dl1.insert(88,99);
		dl1.display();
//		dl1.deleteFirst(13);
//		dl1.deleteLast(65);
		dl1.deleteSpecval(45);
		dl1.deleteSpecval(88);
		dl1.display();
		
		CircularSinglyLL cl1 = new CircularSinglyLL();
		cl1.insertLast(45);
		cl1.display();
		cl1.insertFirst(90);
		cl1.display();
		cl1.insertLast(78);
		cl1.display();
		cl1.insertLast(22);
		cl1.display();
		cl1.insertFirst(66);
		cl1.display();
		cl1.insertFirst(88);
		cl1.display();
		cl1.addToSpeci(3,87);
		cl1.display();
		cl1.delete(88);
		cl1.display();
		cl1.delete(45);
		cl1.display();
		
		DoublyCLL dcl1 = new DoublyCLL();
		dcl1.addBegin(23);
		dcl1.addBegin(12);
		dcl1.addLast(14);
		dcl1.addLast(39);
		dcl1.addBegin(34);
		dcl1.addBegin(94);
		dcl1.addLast(99);
		dcl1.addAtSpec(3,100);
		dcl1.display();
    }
}
