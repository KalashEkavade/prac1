package ash142;

public class ash142 {
	public static void main(String[] args) 
	{
		int r=7;
		double pi=3.14,ar;
		
		System.out.println("The area of circle is");
		ar = pi*r*r;
		System.out.println(ar);
		
		\\im adding coment
	}
}
package ash142;
/**
 * 
 * @author Kalash
 * @version (1)
 * class creates a class for caterpillar
 * <p>
 * this class stimulates th working of caterpillar
 * <br>
 * which does two things
 * <br>
 * it moves and it eats
 *
 */

public class Caterpillar {
	private int moves;
	private int cabbages_eaten;
	/**
	 * This is the constructor used to initialize attributes<br>
	 * Eaten and moves
	 * @param moves - the number of moves made by the caterpillar
	 * @param eaten - the number of cabbages eaten by the caterpillar
	 * 
	 */
	

	public Caterpillar(int moves, int eaten)
	{
		this.setMoves(moves);
		this.setCabbages_eaten(eaten);
	}
	
	int getMoves() {
		return moves;
	}
	/**
	 * this the method to get the number of moves made by the caterpillar
	 * <p>
	 * @return- the number of moves
	 */

	void setMoves(int moves) {
		this.moves = moves;
	}
	/**
	 * this the method to set the number of moves made by the caterpillar
	 * <p>
	 * @return- the number of moves
	 */

	int getCabbages_eaten() {
		return cabbages_eaten;
	}
	/**
	 * this the method increments number of moves 
	 * <p>
	 * in particular to every move made the number of move is incremented by one
	 * 
	 */


	void setCabbages_eaten(int cabbages_eaten) {
		this.cabbages_eaten = cabbages_eaten;
	}

	void move()
	{
		setMoves(getMoves() + 1);
	}

	void eat()
	{
		this.setCabbages_eaten(this.getCabbages_eaten() + 1);
	}
	/**
	 * this method displays the following,p>
	 * 1)the number of moves made
	 * 2)the number of cabbages eaten
	 * 
	 * @see get moves()
	 * @see get cabbages eaten()
	 */
	
	void display()
	{
		System.out.println("Moves made =" + getMoves());
		System.out.println("Cabbages eaten =" + getCabbages_eaten());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caterpillar fred = new Caterpillar(0,0);
		fred.move();
		fred.eat();
		fred.display();
	}

}

