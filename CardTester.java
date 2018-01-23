/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		Card a = new Card ("9", "Hearts", 20);
		Card b = new Card ("9", "Hearts", 20);
		Card c = new Card ("Jack", "Spades", 30);
		if (a.matches(b) == true) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAIL");
		}
		if (a.matches(c) == false) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println(c.toString());
		System.out.println(b.toString());
		System.out.println(a.toString());
	}
}