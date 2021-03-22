
public class BrownBear extends Animal implements Walkable, Swimmable {

	private String subSpecies;

	public BrownBear() {

		simID = 0;
		location = new Location(0, 0);
		full = false;
		rested = true;
		subSpecies = "Alaskan";

	}

	public BrownBear(int simID, Location i, String subSpecies) {

		this.simID = simID;
		this.location = i;
		this.subSpecies = subSpecies;
		this.full = false;
		this.rested = true;
	}

	public String getSubSpecies() {
		return subSpecies;
	}

	public void setSubSpecies(String subSpecies) throws InvalidSubspeciesException {
		String[] mySubSpecies = new String[] { "Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian" };
		for (String s : mySubSpecies) {
			if (subSpecies.equals(s)) {
				this.subSpecies = subSpecies;
				return;
			}
		}
		throw new InvalidSubspeciesException("Invalid Subspecies of Brown Bear");
	}

	public void walk(int direction) {

		int[] position = location.getCoordinates();

		if (direction == 1) {

			position[0] += 3;
		} else if (direction == 2) {

			position[0] -= 3;
		} else if (direction == 3) {

			position[1] += 3;
		} else if (direction == 4) {

			position[1] -= 3;
		}
		location.update(position[0], position[1]);
	}

	public void swim(int direction) {

		int[] position = location.getCoordinates();

		if (direction == 1) {

			position[0] += 2;
		} else if (direction == 2) {

			position[0] -= 2;
		} else if (direction == 3) {

			position[1] += 2;
		} else if (direction == 4) {

			position[1] -= 2;
		}
		location.update(position[0], position[1]);
	}
	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + "]";
	}
}
