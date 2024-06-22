package trees;

public class Main {
 public static void main(String[] args) {
//	 BinaryTree t = new BinaryTree();
//	 t.populate(15);
//	 t.populate(23);
//	 t.populate(7);
//	 t.populate(6);
//	 t.populate(34);
//	 t.populate(5);
//	 t.populate(24);
//	 t.display();
//	 t.inorder();
	 
//	 BST tree = new BST();
//	    int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
//	    tree.populate(nums);
//	    tree.display();
	 
	    AVL tree = new AVL();

	    for(int i=0; i < 1000; i++) {
	      tree.insert(i);
	    }

	    System.out.println(tree.height());
 }
}
