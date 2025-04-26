package trees;

import java.util.ArrayList;

public class BST {
	public class Node {
	    private int value;
	    private Node left;
	    private Node right;
	    private int height;

	    public Node(int value) {
	      this.value = value;
	    }

	    public int getValue() {
	      return value;
	    }
	  }

	  public Node root;

	  public BST() {

	  }

	  public int height(Node node) {
	    if (node == null) {
	      return -1;
	    }
	    return node.height;
	  }

	  public boolean isEmpty() {
	    return root == null;
	  }

	  public void insert(int value) {
	    root = insert(value, root);
	  }

	  private Node insert(int value, Node node) {
	    if (node == null) {
	      node = new Node(value);
	      return node;
	    }

	    if (value < node.value) {
	      node.left = insert(value, node.left);
	    }

	    if (value > node.value) {
	      node.right = insert(value, node.right);
	    }

	    node.height = Math.max(height(node.left), height(node.right)) + 1;
	    return node;
	  }

	  public void populate(int[] nums) {
	    for (int i = 0; i < nums.length; i++) {
	      this.insert(nums[i]);
	    }
	  }

	  public void populatedSorted(int[] nums) {
	    populatedSorted(nums, 0, nums.length);
	  }

	  private void populatedSorted(int[] nums, int start, int end) {
	    if (start >= end) {
	      return;
	    }

	    int mid = (start + end) / 2;

	    this.insert(nums[mid]);
	    populatedSorted(nums, start, mid);
	    populatedSorted(nums, mid + 1, end);
	  }

	  public boolean balanced() {
	    return balanced(root);
	  }

	  private boolean balanced(Node node) {
	    if (node == null) {
	      return true;
	    }
	    return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
	  }

	  public void display() {
	    display(this.root, "Root Node: ");
	  }

	  private void display(Node node, String details) {
	    if (node == null) {
	      return;
	    }
	    System.out.println(details + node.value);
	    display(node.left, "Left child of " + node.value + " : ");
	    display(node.right, "Right child of " + node.value + " : ");
	  }
	  
	  
	  //BFS - Left to right in each level
	  public ArrayList<Integer> breadthFirstSearchRecursive(
	            ArrayList<Node> queue,
	            ArrayList<Integer> resultArray
	    ) {
	        if (queue.size() == 0) {
	            return resultArray;
	        }

	        Node currentNode = queue.remove(0);
	        resultArray.add(currentNode.value);
	        if (currentNode.left != null) {
	            queue.add(currentNode.left);
	        }
	        if (currentNode.right != null) {
	            queue.add(currentNode.right);
	        }

	        return breadthFirstSearchRecursive(queue, resultArray);
	    }
	  
	  //DFS
	  //Inorder - L,N,R
	  public ArrayList<Integer> dfsInorder(){
		  ArrayList<Integer> answer = new ArrayList<>();
		  return traverseInorder(this.root, answer);
	  }
	  
	  private ArrayList<Integer> traverseInorder(Node node, ArrayList<Integer> answer) {
		// TODO Auto-generated method stub
		  if(node.left != null) {
			  traverseInorder(node.left, answer);
		  }
		  answer.add(node.value);
		  if(node.right != null) {
			  traverseInorder(node.right, answer);
		  }
		  
		  return answer;
	}

	//Preorder - N,L,R
	  public ArrayList<Integer> dfsPreorder(){
		  ArrayList<Integer> answer = new ArrayList<>();
		  return traversePreorder(this.root, answer);
	  }
	  
	  private ArrayList<Integer> traversePreorder(Node node, ArrayList<Integer> answer) {
		// TODO Auto-generated method stub
		  
		  answer.add(node.value);
		  
		  if(node.left != null) {
			  traverseInorder(node.left, answer);
		  }
		  
		  if(node.right != null) {
			  traverseInorder(node.right, answer);
		  }
		  return answer;
	}

	//Postorder - L,R,N
	  public ArrayList<Integer> dfsPostorder(){
		  ArrayList<Integer> answer = new ArrayList<>();
		  return traversePostorder(this.root, answer);
	  }

	private ArrayList<Integer> traversePostorder(Node node, ArrayList<Integer> answer) {
		// TODO Auto-generated method stub
		if(node.left != null) {
			  traverseInorder(node.left, answer);
		  }
		  
		  if(node.right != null) {
			  traverseInorder(node.right, answer);
		  }
		answer.add(node.value);
		return answer;
	}
	  

}
