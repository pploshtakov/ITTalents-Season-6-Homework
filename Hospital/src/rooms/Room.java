package rooms;

public class Room {
	private Bed[] beds;
	private boolean isManRoom;
	private int freePlaces;
	
	public Room() {
		beds = new Bed[3];
		this.freePlaces = 3;
		for (int i = 0; i < beds.length; i++) {
			beds[i] = new Bed();
		}
	}

	public int howManyBads() {
		int bed = 0;
		for (int i = 0; i < beds.length; i++) {
			if (beds[i].isFree()) {
				bed++;
			}
		}
		return bed;
	}
}
