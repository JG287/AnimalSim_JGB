/**
 * A class that is used to throw a custom exception
 * if someone tries to enter an invalid SimID.
 * 
 * @author Jose Garcia Balboa
 * @version 1.0
 * @since 2020-03-10
 */
public class InvalidSimIDException extends Exception {
	
	public InvalidSimIDException(String message) {
        super(message);
    }

}
