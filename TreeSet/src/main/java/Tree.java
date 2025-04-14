import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;




/** Represents a tree data structure. NOTE: This tree may not contain null 
 *    elements. A null element in the root of a tree signifies an empty tree.
 *    The subtrees of an empty tree will all be null as well.
 */
public class Tree<E>
{
	/** The value represented by the root of this tree.
	 */
	private E myRootValue;
	
	
	
	/** The array of subtrees of the root of this tree.
	 */
	private Tree<E>[] mySubtrees;
	
	
	
	/** precondition: rootValue may be null.
	 *                branchingFactor may be negative.
	 * postcondition: If branchingFactor is negative, throws a new 
	 *                  IllegalArgumentException.
	 *                The root node for this tree has been initialized with the 
	 *                  specified value and the specified number of null subtrees.
	 *   performance: O(1)
	 *    usage note: Each subtree may have a different branching factor than 
	 *                  the root of this tree.
	 *                A rootValue of null represents an empty tree in which
	 *                  all subtrees will also be null.
	 *
	 * @param rootValue			The value stored within the root of this tree
	 * @param branchinFactor	The maximum number of children branching from 
	 *                            root of this tree
	 * @throws		IllegalArgumentException if branchingFactor is negative
	 */
	@SuppressWarnings("unchecked")
	public Tree(E rootValue, int branchingFactor) {
		// TODO: Implement this constructor correctly
		
		if (branchingFactor < 0) {
			throw new IllegalArgumentException();
		}

		this.myRootValue = rootValue;
		this.mySubtrees = (Tree<E>[]) new Tree[branchingFactor];
		
	}
	
	
		
	/** precondition: This tree may be empty or non-empty.
	 * postcondition: Returns the value stored in the root of this tree or 
	 *                  returns null if this tree is empty.
	 *   performance: O(1)
	 *
	 * @return		The value stored within the root of this tree.
	 */
	public E getValue() {
		return myRootValue;	
	}
	
	
		
	/** precondition: This tree may be empty or non-empty.
	 * postcondition: Assigns to myRootValue a new TreeNode with the specified  
	 *                  value.
	 *                If the new root value is null, reinitializes all subtrees
	 *                  to null as well.
	 *   performance: O(1)
	 *
	 * @param value		The new value for the root of this tree
	 */
	@SuppressWarnings("unchecked")
	public void setValue(E value) {
		myRootValue = value;
	}
	
	
	
	/** precondition: This tree may be empty.
	 * postcondition: Returns the maximum number of subtrees that the root level
	 *                  of this tree can have.
	 *   performance: O(1)
	 *    usage note: This tree's subtrees are not constrained to have the same
	 *                  branching factor as their parent.
	 * 
	 * @return 		The maximum number of children for the root of this tree
	 */
	public int getBranchingFactor() {
		return mySubtrees.length;
	}
	
	
	
	/** precondition: Each of this tree's subtrees may be null, empty, or 
	 *                  non-empty.
	 * postcondition: Returns a "shallow copy" of the array of subtrees in this
	 *                  tree.
	 *   performance: O(N), where N is the branching factor of the root node.
	 *    usage note: Modifications to the returned array will not affect the
	 *                  structure of this tree.
	 *
	 * @return		A shallow copy of this tree's array of subtrees
	 */
	@SuppressWarnings("unchecked")
	public Tree<E>[] getChildren() {
		Tree<E>[] shallowCopy = (Tree<E>[]) new Tree[mySubtrees.length];
		for (int i = 0; i < shallowCopy.length; i++) {
			shallowCopy[i] = mySubtrees[i];
		}
		return shallowCopy;
	}
	
	
		
	/** precondition: The specified subtree may be null, empty, or non-empty.
	 * postcondition: Returns the specified subtree of this tree.
	 *   performance: O(1)
	 *
	 * @param i		The index of the specified subtree of this tree
	 * @return		The specified subtree of this tree
	 * @throws		IllegalArgumentException if the index is invalid
	 */
	public Tree<E> getChild(int i) {
		if (i < 0 || i >= mySubtrees.length) {
			throw new IllegalArgumentException();
		}
		return mySubtrees[i];	// TODO: Implement this method correctly
	}
	
	
	

	/** precondition: child may be null, empty, or non-empty.
	 *                i may be an illegal
	 * postcondition: Replaces the subtree at the specified index with the 
	 *                  provided tree.
	 *                Returns a reference to the subtree that was previously at 
	 *                  the specified index.
	 *   performance: O(1)
	 *
	 * @param i			The index of the specified subtree of this tree
	 * @param child		The new subtree to be inserted into this tree
	 * @return			The subtree previously at the specified index position
	 * @throws			IllegalArgumentException if the index is invalid
	 */
	public Tree<E> setChild(int i, Tree<E> child) {
		if (i < 0 || i >= mySubtrees.length) {
			throw new IllegalArgumentException();
		}
		Tree<E> replaced = mySubtrees[i];
		mySubtrees[i] = child;
		return replaced;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 * postcondition: Returns true if this tree is empty (i.e., myRootValue is
	 *                  null), otherwise returns false.
	 *   performance: O(1)
	 *
	 * @return 			true if this tree is empty, otherwise false
	 */
	public boolean isEmpty() {
		return myRootValue == null;	// TODO: Implement this method correctly
	}
	
	
	
	/*******************************************************************
	 *                    YARRR! HERE BE RECURSION!                    *
	 *******************************************************************/
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 *                Each subtree may be null, empty, or non-empty.
	 * postcondition: Returns the total number of items in this tree.
	 *   performance: O(N)
	 *
	 * @return		The total number of items in this tree.
	 */
	public int size() {
		return -1;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 * postcondition: Returns true if this tree is a leaf node, otherwise
	 *                  returns false.
	 *   performance: O(N)
	 *
	 * @return 			true if this tree is a leaf node, otherwise false
	 */
	public boolean isLeaf() {
		return false;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 * postcondition: Returns the maximum height of the tree from its root to
	 *                  its farthest/lowest-leveled leaf.
	 *   performance: O(N)
	 *    usage note: For the purposes of this class hierarchy, "height" is 
	 *                  defined as the number of levels in the tree. An empty 
	 *                  tree has a height of 0 because it doesn't have any 
	 *                  nodes, while leaf node has a height of 1 because it 
	 *                  only contains a single root-level node. If the root has
	 *                  one or more leaves, they would be at a height of 2, etc.
	 *
	 * @return 			The maximum height of the tree
	 */
	public int maxHeight() {
		return -1;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 * postcondition: The size of the tree is 0 (i.e., the root's value and all
	 *                  of its subtrees are set to null).
	 *   performance: O(1)
	 */
	public void empty() {
		return;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 * postcondition: Returns a list of all elements contained within this tree
	 *                  arranged in a pre-order traversal.
	 *   performance: O(N)
	 *
	 * @return 			A pre-order list of all items in this tree
	 */
	public List<E> preOrder() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 * postcondition: Returns a list of all elements contained within this tree
	 *                  arranged in a post-order traversal.
	 *   performance: O(N)
	 *
	 * @return 			A post-order list of all items in this tree
	 */
	public List<E> postOrder() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 * postcondition: Returns a list of all elements contained within this tree
	 *                  arranged in a level-by-level traversal.
	 *   performance: O(N)
	 *
	 * @return 			A level-by-level list of all items in this tree
	 */
	public List<E> levelByLevel() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 *                x may or may not exist within this tree.
	 * postcondition: Conducts a breadth-first search to determine whether the
	 *                  specified item exists within this tree or not.
	 *   performance: O(N)
	 *
	 * @param x			The item to search for
	 * @return 			true if the specified item exists within this tree,
	 *                    otherwise false
	 */
	public boolean breadthFirstSearch(E x) {
		return false;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may be empty or non-empty.
	 *                x may or may not exist within this tree.
	 * postcondition: Conducts a depth-first search to determine whether the
	 *                  specified item exists within this tree or not.
	 *   performance: O(N)
	 *
	 * @param x			The item to search for
	 * @return 			true if the specified item exists within this tree,
	 *                    otherwise false
	 */
	public boolean depthFirstSearch(E x) {
		return false;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may or not be emtpy.
	 * postcondition: Returns a string representation of the contents of this
	 *                  tree. The string consists of a pair of square brackets
	 *                  surrounding a comma separated list of the items in a
	 *                  level-by-level traversal order.
	 *   performance: O(N)
	 *
	 * @return			A string representation of this tree
	 */
	@Override
	public String toString() {
		return "Tree.toString() to be implemented...";	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may or may not be null.
	 *                x may or may not be null.
	 * postcondition: Returns true if x is a Tree that contains the same items,
	 *                  branching factors, and structures for every node within
	 *                  each tree, otherwise returns false
	 *   performance: O(N)
	 *
	 * @return			true if this tree is equivalent to x, otherwise false
	 */
	@Override
	@SuppressWarnings("unchecked")
	public boolean equals(Object x) {
		return false;	// TODO: Implement this method correctly
	}
	
	
	/** precondition: This tree may or may not be empty.
	 * postcondition: Returns the hash value derived from the string 
	 *                  representation of the items in this tree (i.e., see
	 *                  this.toString()).
	 *   performance: O(N)
	 *
	 * @return			A "unique" hash value for this tree
	 */
	@Override
	public int hashCode() {
		return -1;	// TODO: Implement this method correctly
	}
	
	
}