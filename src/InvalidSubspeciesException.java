/**
 * A class that is used to throw a custom exception
 * if someone tries to enter an invalid Subspecies.
 * 
 * @author Jose Garcia Balboa
 * @version 1.0
 * @since 2020-03-10
 */
public class InvalidSubspeciesException extends Exception {

	public InvalidSubspeciesException(String message) {
		super(message);
	}
}
