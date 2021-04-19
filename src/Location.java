/**
 * A class that is used to represent the Location of an animal.
 * Location is determined through the usage of an x coordinate and
 * y coordinate within a 2 dimensional field or plane. The Location
 * can also update itself with new x and y coordinates.
 * 
 * @author Jose Garcia Balboa
 * @version 1.0
 * @since 2020-03-10
 */
public class Location {

	private int xCoord;
	private int yCoord;

	public Location() {

		xCoord = 0;
		yCoord = 0;
	}

	public Location(int x, int y) {

		xCoord = x;
		yCoord = y;
	}

	public void update(int x, int y) {

		this.xCoord = x;
		this.yCoord = y;
	}

	public int[] getCoordinates() {

		return new int[] { xCoord, yCoord };
	}

	public void setCoordinates(int xCoord, int yCoord) throws InvalidCoordinateException {

		if (xCoord < 0 || yCoord < 0)
			throw new InvalidCoordinateException("Cannot be less than 0");
		this.yCoord = yCoord;
		this.xCoord = xCoord;
		return;
	}
	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}
}
