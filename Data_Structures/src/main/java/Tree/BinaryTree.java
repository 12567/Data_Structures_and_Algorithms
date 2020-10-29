package Tree;

class NodeB 
{ 
	int key; 
	NodeB left, right; 

	public NodeB(int item) 
	{ 
		key = item; 
		left = right = null; 
	} 
} 

class BinaryTree 
{ 
	NodeB root; 

	BinaryTree() 
	{ 
		root = null; 
	} 

	void printPostorder(NodeB node) 
	{ 
		if (node == null) 
			return; 

		printPostorder(node.left); 
		printPostorder(node.right); 
		System.out.print(node.key + " "); 
	} 

	void printInorder(NodeB node) 
	{ 
		if (node == null) 
			return; 
		printInorder(node.left); 
		System.out.print(node.key + " "); 
		printInorder(node.right); 
	} 

	void printPreorder(NodeB node) 
	{ 
		if (node == null) 
			return; 
		System.out.print(node.key + " "); 
		printPreorder(node.left); 
		printPreorder(node.right); 
	} 

	void printPostorder() {	 printPostorder(root); } 
	void printInorder() {	 printInorder(root); } 
	void printPreorder() {	 printPreorder(root); } 

	public static void main(String[] args) 
	{ 
		BinaryTree tree = new BinaryTree(); 
		tree.root = new NodeB(1); 
		tree.root.left = new NodeB(2); 
		tree.root.right = new NodeB(3); 
		tree.root.left.left = new NodeB(4); 
		tree.root.left.right = new NodeB(5); 

		System.out.println("Preorder traversal of binary tree is "); 
		tree.printPreorder(); 

		System.out.println("\nInorder traversal of binary tree is "); 
		tree.printInorder(); 

		System.out.println("\nPostorder traversal of binary tree is "); 
		tree.printPostorder(); 
	} 
} 
