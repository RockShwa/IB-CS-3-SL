
import java.util.Stack;


/** TOWERS OF HANOI PUZZLE
 *
 *    GOAL: Move all of the discs from the first pillar to the center pillar.
 *
 *   RULES: Only 1 disc may be moved at a time.
 *          No discs may be placed on top of a smaller disc.
 */
public class TowersOfHanoi
{
	// FIELDS
	// ----------------------------------------------------------------------
	private Stack<Disc> myPegA;	// 1st pillar of discs
	private Stack<Disc> myPegB;	// 2nd pillar of discs
	private Stack<Disc> myPegC;	// 3rd pillar of discs
	
	
	// CONSTRUCTORS
	// ----------------------------------------------------------------------
	/** Initializes myPegA to have n discs ranging from size 1 to n,
	 *  with the smaller discs on the top of the stack and the larger discs
	 *  on the bottom of the stack.  Initializes myPegB and myPegC to be
	 *  empty stacks.
	 */
	public TowersOfHanoi(int n)
	{
		myPegA = new Stack<Disc>();
		myPegB = new Stack<Disc>();
		myPegC = new Stack<Disc>();
		
		for (int i = n; i > 0; i--)
		{
			myPegA.push(new Disc(i));
		}
	}
	
	
	// METHODS
	// ----------------------------------------------------------------------
	/** precondition: All discs are stacked in ascending order on myPegA.
	 * postcondition: All discs are stacked in ascending order on myPegB.
	 *                discs must be moved from one pillar to another one at
	 *                a time in accordance with the rules of the puzzle.
	 */
	public void solvePuzzle()
	{
		// TODO: Implement this method correctly
	}
	
	
	
	/** precondition: n is the number of discs to be moved. There are at
	 *                least n discs on the source stack. dest and temp each
	 *                contain 0 or more discs. All discs on each pillar are 
	 *                stacked in ascending order. The top n discs of source
	 *                are all smaller than any discs in dest and temp.
	 * postcondition: The top n discs of source have been removed and 
	 *                placed on top of any discs on dest. All other discs
	 *                in the puzzle remain in their original locations.
	 *                All discs on each pillar are stacked in ascending 
	 *                order. discs must be moved from one pillar to another  
	 *                one at a time in accordance with the rules of the 
	 *                puzzle.
	 */
	private void moveTower(int n, Stack<Disc> source, 
	                              Stack<Disc> dest,
	                              Stack<Disc> temp)
	{
		// TODO: Implement this method correctly
        if (n == 0) {
            moveDisc(source, dest);
            return;
        }    
        // } else if (source.isEmpty() || temp.isEmpty()) {
        //     moveDisc(source, dest);
        // }
        // this needs some work still
        else if (n % 2 == 0) {
            moveDisc(source, temp);
        } else if (n % 2 == 1) {
            moveDisc(dest, temp);
            moveDisc(source, dest);
        }
        moveTower(n-1, source, dest, temp);

	}
	
	
	
	/** precondition: There is at least 1 disc on the source stack. All 
	 *                discs in dest are stacked in ascending order. The
	 *                topmost disc of source is smaller than any disc
	 *                in dest.
	 * postcondition: The topmost disc of source has been removed and 
	 *                placed on the top of dest. All other discs in the 
	 *                puzzle remain in their original locations. All discs
	 *                on each pillar are stacked in ascending order. discs
	 *                must be moved from one pillar to another one at a 
	 *                time in accordance with the rules of the puzzle.
	 */
	private void moveDisc(Stack<Disc> source, Stack<Disc> dest)
	{
		// TODO: Implement this method correctly
        Disc topDisc = source.pop();
        // int topDiscSize = Integer.parseInt(topDisc.toString().substring(1, topDisc.toString().length() - 1));
        // int destDiscSize = Integer.parseInt(dest.peek().toString().substring(1, dest.peek().toString().length() - 1));
        // if (topDiscSize < destDiscSize) {
        //     dest.push(topDisc);
        // }
        dest.push(source.pop());
	}
	
	
	
	/** precondition: myPegA, myPegB, and myPegC each contain 0 or more
	 *                Discs.
	 * postcondition: Returns a String representation of the puzzle,
	 *                showing the current contents of each pillar.
	 */
	public String toString()
	{
		String s = "";
		s += "A:" + myPegA + "\n";
		s += "B:" + myPegB + "\n";
		s += "C:" + myPegC + "\n";
		return s;
	}
	
	
	/** Main method.  Instantiates and solves a Towers of Hanoi puzzle.
	 */
	public static void main(String[] args)
	{
		TowersOfHanoi t = new TowersOfHanoi( 7 );
		System.out.println("BEFORE...");
		System.out.println(t);

		t.solvePuzzle();

		System.out.println("AFTER...");
		System.out.println(t);
	}
	
	
}
