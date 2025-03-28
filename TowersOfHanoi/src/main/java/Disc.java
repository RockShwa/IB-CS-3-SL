/** Represents a disc for the Towers of Hanoi puzzle.
*/
public class Disc
{
	// FIELDS
	// ----------------------------------------------------------------------
	private int mySize;			// The diameter of the disc
	
	
	// CONSTRUCTORS
	// ----------------------------------------------------------------------
	/** precondition: 0 < size
	 * postcondition: Initializes this disc with the specified diameter.
	 */
	public Disc(int size)
	{
		mySize = size;
	}
	
	
	// METHODS
	// ----------------------------------------------------------------------
	/** precondition:
	 * postcondition: Returns a String representation of this disc,
	 *                indicating its size.
	 */
	public String toString()
	{
		return "(" + mySize + ")";
	}
	
}