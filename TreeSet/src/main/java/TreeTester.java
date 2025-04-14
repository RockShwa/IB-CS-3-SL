// TODO: Add any necessary import statements



/** Tester program to test the implementation of various tree classes.
 *
 * @author xxxxx // TODO: Complete the "@author" tag by filling in your name
 */
public class TreeTester {
	
	
	/** This method tests the functionality of various tree classes.
	 *
	 * @param args		Program arguments (unused)
	 */
	public static void main(String[] args) {
		
		System.out.println("Tree Tester:");
		System.out.println("------------");
		
		Tree<String> tree = new Tree<>("Huey", 5);
		BinaryTree<String> binTree = new BinaryTree<>("Dewey");
		BinarySearchTree<String> bst = new BinarySearchTree<>("Louie");
		ExpressionTree expr = ExpressionTree.infix2Tree("2+3");
		
		System.out.println(tree);
		System.out.println(binTree);
		System.out.println(bst);
		System.out.println(expr);

		System.out.println();
		
		// TODO: Instantiate 1 or more tree objects to test their functionality
		
		
		
		
		
		
		
		
		System.out.println("...done.");
	}
}