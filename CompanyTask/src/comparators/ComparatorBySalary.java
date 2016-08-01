package comparators;

import java.util.Comparator;

import company.Employee;

public class ComparatorBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getSalary() > o2.getSalary()) {
			return -1;
		} else if (o1.getSalary() < o2.getSalary()) {
			return 1;
		}
		return 0;
	}

}
