/**
 * A class that contains varying properties about an Animal. Properties such
 * as whether or not the animal eats, whether or not it will sleep, it's ID,
 * and it's location are all found within this class.
 * 
 * @author Jose Garcia Balboa
 * @version 1.0
 * @since 2020-03-10
 */
public abstract class Animal extends RuntimeException {
	
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;

	public Animal() {

		simID = 0;
		full = false;
		rested = true;
		location = new Location(0, 0);

	}

	public Animal(int simID, Location i) {

		this.simID = simID;
		this.location = i;
		this.full = false;
		this.rested = true;
	}

	public boolean eat() {
		double value = Math.random();
		if (value <= 0.5) {
			this.full = false;
		} else {
			this.full = true;
		}
		return this.full;
	}

	public boolean sleep() {
		double value2 = Math.random();
		if (value2 <= 0.5) {
			this.rested = false;
		} else {
			this.rested = true;
		}
		return this.rested;
	}

	public int getSimID() {
		return simID;
	}

	public void setSimID(int simID) throws InvalidSimIDException {
		if (simID <= 0)
	        throw new InvalidSimIDException("Invalid SimID");
	    this.simID = simID;
	    return;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public boolean getFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}

	public boolean getRested() {
		return rested;
	}

	public void setRested(boolean rested) {
		this.rested = rested;
	}
}
