/**
 * A class that is used to throw a custom exception
 * if someone tries to enter an invalid wingspan.
 * 
 * @author Jose Garcia Balboa
 * @version 1.0
 * @since 2020-03-10
 */
public class InvalidWingSpanException extends Exception {

	public InvalidWingSpanException(String message) {
		super(message);
	}
}