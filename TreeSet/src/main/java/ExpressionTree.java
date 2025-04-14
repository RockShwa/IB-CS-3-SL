import java.util.List;
import java.util.Stack;
import java.util.EmptyStackException;
import java.util.*;

/** Represents a binary tree that encapulates an arithmetic expression and 
 *  that supports the standard order of operations for multiplication, division, 
 *  remainder, addition, and subtraction.
 *  
 *  Static methods allow for parsing infix, prefix, and postfix expressions into
 *  valid expression trees as well as describing the tree in infix, prefix,
 *  or postfix notation.
 */
public class ExpressionTree extends BinaryTree<Object> {
	
	/** precondition: rootValue may be null.
	* postcondition: The root node for this tree is initialized with the 
	*                  specified value.
	*                The left and right subtrees are each initialized to null.
	 *   performance: O(1)
	 *
	 * @param rootValue		The value stored within the root of this tree
	 */
	public ExpressionTree(Object rootValue) {
		// TODO: Implement this constructor correctly
		
		super(null);
	}
	
	
	
	/** precondition: expression contains potentially valid infix, prefix, or 
	 *                  postfix expression.
	 * postcondition: Returns an array of the sequence of tokens (i.e., digits 
	 *                  and operators) that make up expression.
	 *   performance: O(N)
	 *    usage note: This is a private helper method for use in converting an
	 *                  infix, prefix, or postfix expression into an expression
	 *                  tree.
	 *
	 * @param expression		The expression to be parsed
	 */
	private static Object[] parseExpression(String expression) {		
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: infix may or may not be a valid infix expression.
	 * postcondition: Returns a fully initialized expression tree from the 
	 *                  specified expression.
	 *                Throws an exception if the expression is not valid.
	 *   performance: O(N)
	 *    usage note: This is a static method that can be used to generate a
	 *                  complete expression tree from a infix expression.
	 *                Invoke using... ExpressionTree.infix2Tree("2+3");
	 *
	 * @param infix		The infix expression
	 * @throws 			IllegalArgumentException if the expression is malformed
	 */
	public static ExpressionTree infix2Tree(String infix) {
		return new ExpressionTree("-1");	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: prefix may or may not be a valid prefix expression.
	 * postcondition: Returns a fully initialized expression tree from the 
	 *                  specified expression.
	 *                Throws an exception if the expression is not valid.
	 *   performance: O(N)
	 *    usage note: This is a static method that can be used to generate a
	 *                  complete expression tree from a prefix expression.
	 *                Invoke using... ExpressionTree.prefix2Tree("+23");
	 *
	 * @param prefix	The prefix expression
	 * @throws 			IllegalArgumentException if the expression is malformed
	 */
	public static ExpressionTree prefix2Tree(String prefix) {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: postfix may or may not be a valid postfix expression.
	 * postcondition: Returns a fully initialized expression tree from the 
	 *                  specified expression.
	 *                Throws an exception if the expression is not valid.
	 *   performance: O(N)
	 *    usage note: This is a static method that can be used to generate a
	 *                  complete expression tree from a postfix expression.
	 *                Invoke using... ExpressionTree.postfix2Tree("23+");
	 *
	 * @param postfix	The postfix expression
	 * @throws 			IllegalArgumentException if the expression is malformed
	 */
	public static ExpressionTree postfix2Tree(String postfix) {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may or may not be empty.
	 * postcondition: If this tree is empty, returns 0.
	 *                Otherwise, returns the evaluated value of this expression
	 *                  tree.
	 *   performance: O(N)
	 *    usage note: Expression trees evaluate using integer arithmetic (i.e., 
	 *                  integer division, etc.).
	 *
	 * @return 			The fully evaluated value of this expression tree
	 */
	public int eval() {
		return -1;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: The elements of traversal may be Integer or String objects.
	 * postcondition: Returns a string concatenation of each token in traversal.
	 *   performance: O(N)
	 *    usage note: This is a private helper method for use in converting a 
	 *                  pre-order or post-order list into a simple string.
	 *
	 * @param traversal		The list of tokens
	 * @return 				The string concatenation of the tokens in traversal
	 */
	private String list2String(List<String> traversal) {	
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree is a valid expression tree and may or may not 
	 *                  be empty.
	 * postcondition: Returns the infix notation for this expression tree.
	 *   performance: O(N)
	 *
	 * @return 			The infix notation for this expression tree
	 */
	public String infix() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree is a valid expression tree and may or may not 
	 *                  be empty.
	 * postcondition: Returns the prefix notation for this expression tree.
	 *   performance: O(N)
	 *
	 * @return 			The prefix notation for this expression tree
	 */
	public String prefix() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree is a valid expression tree and may or may not 
	 *                  be empty.
	 * postcondition: Returns the postfix notation for this expression tree.
	 *   performance: O(N)
	 *
	 * @return 			The postfix notation for this expression tree
	 */
	public String postfix() {
		return null;	// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: This tree may or not be emtpy.
	 * postcondition: Returns an infix expression of the contents of this tree.
	 *   performance: O(N)
	 *
	 * @return			A string representation of this tree
	 */
	@Override
	public String toString() {
		return "ExpressionTree.toString() to be implemented...";	// TODO: Implement this method correctly
	}
	
	
}