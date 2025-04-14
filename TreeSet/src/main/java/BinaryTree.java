import java.util.List;
import java.util.ArrayList;








/** Represents a tree with a branching factor of 2. Each node has a "left" 
 *  subtree in index position 0 and a "right" subtree in index position 1.
 */
public class BinaryTree<E> extends Tree<E>
{
	
	/** precondition: rootValue may be null.
	 * postcondition: The root node for this tree is initialized with the 
	 *                  specified value.
	 *                The left and right subtrees are each initialized to null.
	 *   performance: O(1)
	 *
	 * @param rootValue		The value stored within the root of this tree
	 */
	public BinaryTree(E rootValue) {
		// TODO: Implement this constructor correctly
		
		this(null, null, null);
	}
	
	
	
	/** precondition: rootValue may be null.
	 * postcondition: The root node for this tree is initialized with the 
	 *                  specified value.
	 *                The left and right subtrees is been initialized with
	 *                  references to the specified trees.
	 *   performance: O(1)
	 *
	 * @param rootValue		The value stored within the root of this tree
	 * @param left			The left subtree of this tree
	 * @param right			The right subtree of this tree
	 */
	public BinaryTree(E rootValue, BinaryTree<E> left, BinaryTree<E> right) {
		// TODO: Implement this constructor correctly
		
		super(null, -1);
	}
	
	
	
	/** precondition: This tree may or may not be empty.	
	 *                The left subtree may be null.
	 * postcondition: If this tree is empty, returns null.
	 *                Otherwise, returns a reference to the left subtree of 
	 *                  this tree.
	 *   performance: O(1)
	 *
	 * @return 			The left subtree of this tree
	 */
	public BinaryTree<E> getLeft() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may or may not be empty.	
	 *                The right subtree may be null.
	 * postcondition: If this tree is empty, returns null.
	 *                Otherwise, returns a reference to the right subtree of 
	 *                  this tree.
	 *   performance: O(1)
	 *
	 * @return 			The right subtree of this tree
	 */
	public BinaryTree<E> getRight() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may or may not be empty.	
	 *                The left subtree may be null.
	 * postcondition: If this tree is empty, returns null.
	 *                Otherwise, replaces the left subtree with the specified 
	 *                  tree and returns a reference to the previous left subtree.
	 *   performance: O(1)
	 *
	 * @param left		The new left subtree for this tree
	 * @return			The subtree previously at the specified index position
	 */
	public BinaryTree<E> setLeft(BinaryTree<E> left) {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may or may not be empty.	
	 *                The right subtree may be null.
	 * postcondition: If this tree is empty, returns null.
	 *                Otherwise, replaces the right subtree with the specified 
	 *                  tree and returns a reference to the previous right subtree.
	 *   performance: O(1)
	 *
	 * @param right		The new right subtree for this tree
	 * @return			The subtree previously at the specified index position
	 */
	public BinaryTree<E> setRight(BinaryTree<E> right) {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 * postcondition: Returns a list of all elements contained within this tree
	 *                  arranged in an in-order traversal.
	 *   performance: O(N)
	 *
	 * @return 			An in-order list of all items in this tree
	 */
	public List<E> inOrder() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 *                x may or may not exist within this tree.
	 * postcondition: Conducts a search to determine whether the specified item
	 *                  exists within this tree or not.
	 *   performance: O(N)
	 *
	 * @param x			The item to search for
	 * @return 			true if the specified item exists within this tree,
	 *                    otherwise false
	 */
	public boolean contains(E x) {
		return false;	// TODO: Implement this method correctly
	}
	
	
}