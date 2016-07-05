package personClasses;

public class Student extends Person {

	//	Кла�?ът Student на�?лед�?ващ Person, репрезентиращ ученик да има
	//	Полета:
	//	score - показва оценката на ученика (чи�?ло между 2 и 6, не е
	//	задължително да е ц�?ло)
	private double score;
	//	Един�?твен кон�?труктор:
	//	Student(String name, int age, boolean isMale, double score)
	//	задаващ �?тойно�?ти и на на�?ледените полета
	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		setScore(score);
	}
	private void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		} else {
			System.out.println("Score must be from 2 to 6, please set again (default is 4)!");
		}
	}
	
	//	Метод showStudentInfo() който показва информаци�? за човека и
	//	информаци�? за оценката му (чрез надпи�?и на екрана)
	public void showStudentInfo() {
		super.showPersonInfo();
		System.out.println("Score: " + this.score);
	}
	
}
