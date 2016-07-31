package hospital;

import java.util.ArrayList;
import java.util.Collections;

import persons.Doctor;
import rooms.Room;

public abstract class Department {
	private Room[] rooms;
	private ArrayList<Doctor> doctors;
	
	public Department() {
		rooms = new Room[10];
		for (int i = 0; i < rooms.length; i++) {
			rooms[i] = new Room();
		}
		doctors = new ArrayList<>();
	}

	public boolean isHaveFreeBad() {
		int bads = 0;
		for (int i = 0; i < rooms.length; i++) {
			bads += rooms[i].howManyBads();
		}
		System.out.println("In department " + this.getClass().getName() + " has " + bads + " bads.");
		return !(bads == 0);
	}
	
	public ArrayList<Doctor> getDoctors() {
		return (ArrayList<Doctor>) Collections.unmodifiableList(doctors);
	}
}
