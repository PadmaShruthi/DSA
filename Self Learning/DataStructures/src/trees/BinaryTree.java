package trees;

public class BinaryTree {
	
 private class Node{
	 int key;
	 Node left;
	 Node right;
	 
	 Node (int key){
		 this.key = key;
	 }
 }
  private Node root;
  
  public void populate(int key) {
	  
	  root = populate(root,key);
  }
  
  private Node populate (Node root, int key) {
	  if (root == null) {
		  root = new Node(key);
	  }
	  else if (key < root.key) {
		  root.left = populate (root.left, key);
	  }
	  else if (key > root.key) {
		  root.right = populate(root.right, key);
	  }
	  return root;
  }
  
  public void inorder() {
	  inorderRecursive(root);
  }
  private void inorderRecursive(Node root) {
	  if (root != null) {
		  inorderRecursive(root.left);
		  System.out.println(root.key);
		  inorderRecursive(root.right);
	  }
  }
  
  	public void preOrder() {
	    preOrder(root);
	  }

	  private void preOrder(Node node) {
	    if (node == null) {
	      return;
	    }
	    System.out.print(node.key + " ");
	    preOrder(node.left);
	    preOrder(node.right);
	  }
	  
	  public void postOrder() {
		    postOrder(root);
		  }

		  private void postOrder(Node node) {
		    if (node == null) {
		      return;
		    }
		    preOrder(node.left);
		    preOrder(node.right);
		    System.out.print(node.key + " ");
		  }
  public void display() {
	  display(this.root, "");
  }
  private void display(Node node, String indent) {
	    if (node == null) {
	      return;
	    }
	    System.out.println(indent + node.key);
	    display(node.left, indent + "\t");
	    display(node.right, indent + "\t");
	  }
}
