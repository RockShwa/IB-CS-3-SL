


/** Represents a binary tree whose items are arranged such that an in-order 
 *  traversal of the tree will visit the items in ascending order. For any 
 *  given node, the items in its left subtree are less than or equal to the 
 *  root, while items in its right subtree are strictly greater than the root.
 *  
 *  Depending on the implementation of the add() and remove() methods, the tree 
 *  may or may not be guaranteed to be balanced. Balanced trees will offer 
 *  logarithmic performance for some methods, while unbalanced trees will only
 *  achieve linear performance for those same methods.
 */
public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E>
{
	
	/** precondition: rootValue may be null.
	* postcondition: The root node for this tree is initialized with the 
	*                  specified value.
	*                The left and right subtrees are each initialized to null.
	 *   performance: O(1)
	 *
	 * @param rootValue		The value stored within the root of this tree
	 */
	public BinarySearchTree(E rootValue) {
		// TODO: Implement this constructor correctly
		
		super(null, null, null);
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 *                x may or may not exist within this tree.
	 * postcondition: Conducts binary search to determine whether the specified
	 *                  item exists within this tree or not.
	 *   performance: O(log N) if balanced, O(N) if unbalanced
	 *
	 * @param x			The item to search for
	 * @return 			true if the specified item exists within this tree,
	 *                    otherwise false
	 */
	@Override
	public boolean contains(E x) {
		return false;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 *                x may be null.
	 * postcondition: If x is null, throws an IllegalArgumentException.
	 *                Otherwise, inserts x into this binary search tree and
	 *                  optionally, rebalances the tree.
	 *   performance: O(log N) if balanced, O(N) if unbalanced
	 *    usage note: If this tree allows duplicate items to be added, the 
	 *                  duplicate items will be added to the left subtree of 
	 *                  their counterpart item.
	 *
	 * @param x			The item to be added to this tree
	 * @return 			true if the number of elements in this tree increases,
	 *                    otherwise false
	 * @throws			IllegalArgumentException if x is null
	 */
	public boolean add(E x) {
		return false;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 *                x may be null.
	 * postcondition: If x is null, throws an IllegalArgumentException.
	 *                Otherwise, removes x from this binary search tree and
	 *                  optionally, rebalances the tree.
	 *   performance: O(log N) if balanced, O(N) if unbalanced
	 *    usage note: If this tree allows duplicate items to be added, the 
	 *                  only one instance of x will be removed from this tree.
	 *
	 * @param x			The item to be removed from this tree
	 * @return 			true if the number of elements in this tree decreases,
	 *                    otherwise false
	 * @throws			IllegalArgumentException if x is null
	 */
	public boolean remove(E x) {
		return false;	// TODO: Implement this method correctly
	}
	
	
}