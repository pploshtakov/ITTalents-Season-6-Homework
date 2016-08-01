package company;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

import comparators.ComparatorByAge;
import comparators.ComparatorByName;
import comparators.ComparatorBySalary;

public class Company {
	private String name;
	private TreeMap<String, HashSet<Employee>> employees;
	public enum Criteria {NAME, AGE, SALARY};
	
	public Company(String name) {
		this.name = name;
		this.employees = new TreeMap<>();
	}

	public void addEmployee(String dep, Employee emp) {
		if (!employees.containsKey(dep)) {
			employees.put(dep, new HashSet<>());
		}
		employees.get(dep).add(emp);
	}

	public void printCompanyInfo(Criteria cr) {
		for(Entry <String, HashSet<Employee>> e : employees.entrySet()) {
			HashSet<Employee> set = e.getValue();
			TreeSet<Employee> tree = new TreeSet<>();
			System.out.println("      Department: " + e.getKey());
			switch (cr) {
			case AGE:
				tree = new TreeSet<>(new ComparatorByAge());
				break;
			case NAME:
				tree = new TreeSet<>(new ComparatorByName());
				break;
			case SALARY:
				tree = new TreeSet<>(new ComparatorBySalary());
				break;
			default:
				System.out.println("No such criteria!");
				return;
			}
			tree.addAll(set);
			for(Employee emp : tree) {
				System.out.println("   Employee: " + emp);
			}
		}
//		for(Entry <String, HashSet<Employee>> e : employees.entrySet()) {
//			System.out.println("      Department: " + e.getKey());
//			for(Employee emp : e.getValue()) {
//				System.out.println("   Employee: " + emp);
//			}
//		}
	}
	
	public Map<String, HashSet<Employee>> getEmployees() {
		return Collections.unmodifiableMap(this.employees);
	}
	
}
