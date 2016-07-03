package studentTask;

public class College {

	public static void main(String[] args) {
		//create students
				Student ivan = new Student();
				Student gosho = new Student("Gosho", "Geodeziq", 19);
				Student pesho = new Student("Pesho", "Geodeziq", 19);
				Student martin = new Student("Martin","Geodeziq", 19);
				Student vladi = new Student("Vladi","Geodeziq", 19);
				Student rali = new Student("Rali", "Geodeziq",19);
				Student gabi = new Student("Gabi", "SSS",19);
				Student ivo = new Student("Ivo", "SSS",19);
				Student niq = new Student("Niq", "SSS",19);
				Student iva = new Student("Iva", "SSS",19);
				Student simo = new Student("Simo", "SSS",19);
				//adjust the success of some students
				pesho.setGrade(5.5);
				rali.setGrade(6.00);
				ivo.setGrade(5.75);
				gabi.setGrade(5.5);
				// add scholarships
				pesho.receiveScholarship(5.5, 20);
				rali.receiveScholarship(5.5, 30);
				ivo.receiveScholarship(5.5, 25);
				gabi.receiveScholarship(5.5, 20);
				gosho.upYear();
				pesho.upYear();
				martin.upYear();
				ivan.upYear();
				vladi.upYear();
				rali.upYear();
				System.out.println("Rali is " + rali.getYearInCollege() + " years in college.");
				System.out.println("-----------------------------");
				StudentGroup geodeziq = new StudentGroup("Geodeziq");
				StudentGroup sss = new StudentGroup();
				geodeziq.addStudent(gosho);
				geodeziq.addStudent(pesho);
				geodeziq.addStudent(martin);
				geodeziq.addStudent(ivan);
				geodeziq.addStudent(vladi);
				geodeziq.addStudent(rali);
				sss.addStudent(gabi);
				sss.addStudent(ivo);
				sss.addStudent(niq);
				sss.addStudent(simo);
				sss.addStudent(iva);
				geodeziq.printStudentsInGroup();
				System.out.println("-----------------------------");
				System.out.println("The best student from geodesy group is: " + geodeziq.theBestStudent());
				System.out.println("-----------------------------");
				geodeziq.upYearGroup();
				geodeziq.printStudentsInGroup();

		
	}

}
