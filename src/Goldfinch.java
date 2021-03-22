
public class Goldfinch extends Animal implements Walkable, Flyable {

	private double wingSpan;

	public Goldfinch() {

		simID = 0;
		location = new Location(0, 0);
		full = false;
		rested = true;
		wingSpan = 9.0;
	}

	public Goldfinch(int simID, Location i, double ws) {

		this.simID = simID;
		this.location = i;
		this.wingSpan = ws;
		this.full = false;
		this.rested = true;
	}

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) throws InvalidWingSpanException {
		if (wingSpan < 5.0 || wingSpan > 11.0)
			throw new InvalidWingSpanException("Invalid Wing Span (cm)");
		this.wingSpan = wingSpan;
		return;
	}

	public void fly(Location i) {
		
		int[] position = location.getCoordinates();

		location.update(position[0], position[1]);
	}

	public void walk(int direction) {

		int[] position = location.getCoordinates();

		if (direction == 1) {

			position[0] += 1;
		} else if (direction == 2) {

			position[0] -= 1;
		} else if (direction == 3) {

			position[1] += 1;
		} else if (direction == 4) {

			position[1] -= 1;
		}
		location.update(position[0], position[1]);
	}
	
	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + "]";
	}

}
