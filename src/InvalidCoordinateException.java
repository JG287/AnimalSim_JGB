/**
 * A class that is used to throw a custom exception
 * if someone tries to enter an invalid x or y coordinate.
 * 
 * @author Jose Garcia Balboa
 * @version 1.0
 * @since 2020-03-10
 */
public class InvalidCoordinateException extends Exception {

	public InvalidCoordinateException(String message) {
		super(message);
	}
}
