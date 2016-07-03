package studentTask;

public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	int freePlaces;
	public StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	public StudentGroup(String groupSubject) {
		this();
		setGroupSubject(groupSubject);
	}
	private void setGroupSubject(String groupSubject2) {
		if (!groupSubject2.isEmpty()) {
			this.groupSubject = groupSubject2;
		} else {
			this.groupSubject = "Students aren't subject!";
			System.out.println("You don't typed subject, default subject is 'Students aren't subject!' ");
		}
	}
	void addStudent(Student s) {
		if (this.groupSubject == null) {
			this.groupSubject = s.getSubject();
		}
		if (s.getSubject().equalsIgnoreCase(this.groupSubject)) {
			if (s != null) {
				if (this.freePlaces > 0) {
					students[students.length - this.freePlaces--] = s;
				} else {
					System.out.println("Don't have free places!");
				}
			} 
		} else {
			System.out.println("This student is from another subject!");
		}
	}
	void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	String theBestStudent() {
		String theBest = this.students[0].getName();
		int indexTheBest = 0;
		for (int i = 1; i < this.students.length; i++) {
			if (this.students[i].getGrade() > this.students[indexTheBest].getGrade()) {
				theBest = this.students[i].getName();
				indexTheBest = i;
			}
		}
		return theBest;
	}
	void printStudentsInGroup() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].printStudentInfo();
			} else {
				System.out.println("No more students in this group!");
				break;
			}
		}
	}
	void upYearGroup() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				this.students[i].upYear();
			} else {
				System.out.println("No more students in this group!");
				break;
			}
		}
	}
	
}
