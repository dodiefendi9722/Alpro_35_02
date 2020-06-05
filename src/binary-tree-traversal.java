class Node 
{ 
	int key; 
	Node kiri, kanan; 

	public Node(int item) 
	{ 
		key = item; 
		kiri = kanan = null; 
	} 
} 

class BinaryTree 
{ 
	// induk binary tree 
	Node induk; 

	BinaryTree() 
	{ 
		induk = null; 
    } 
    
    /* preorder*/
    void printPreorder(Node node) 
	{ 
		if (node == null) 
			return; 

		/* print induk */
		System.out.print(node.key + " "); 

		/* print kiri subtree */
		printPreorder(node.kiri); 

		/* print kanan subtree */
		printPreorder(node.kanan); 
	} 


	/* inorder*/
	void printInorder(Node node) 
	{ 
		if (node == null) 
			return; 

		/* print kiri subtree */
		printInorder(node.kiri); 

		/* print induk */
		System.out.print(node.key + " "); 

		/* print kanan subtree */
		printInorder(node.kanan); 
	} 


	/*  postorder */
	void printPostorder(Node node) 
	{ 
		if (node == null) 
			return; 

		// print kiri subtree 
		printPostorder(node.kiri); 

		// print kanan subtree
		printPostorder(node.kanan); 

		// print induk
		System.out.print(node.key + " "); 
    } 
    

	// fungsi rekursif
	void printPostorder() {	 printPostorder(induk); } 
	void printInorder() {	 printInorder(induk); } 
	void printPreorder() {	 printPreorder(induk); } 

	// method 
	public static void main(String[] args) 
	{ 
		BinaryTree tree = new BinaryTree(); 
		tree.induk = new Node(10);
		tree.induk.kiri = new Node(8); 
		tree.induk.kanan = new Node(16); 
		tree.induk.kiri.kiri = new Node(5); 
        tree.induk.kiri.kiri.kanan = new Node(7); 
        tree.induk.kanan.kiri = new Node(12);
        tree.induk.kanan.kanan = new Node(18);
        tree.induk.kanan.kiri.kanan = new Node(15);


		System.out.print("Pre-order binary tree traversal = "); 
		tree.printPreorder(); 

		System.out.print("\nIn-order binary tree traversal = "); 
		tree.printInorder(); 

		System.out.print("\nPost-order binary tree traversal = "); 
		tree.printPostorder(); 
	} 
} 
