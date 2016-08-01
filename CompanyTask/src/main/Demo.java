package main;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import company.Company;
import company.Employee;
import comparators.ComparatorByName;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		Company theSmilePeople = new Company("The Smile People");
		Employee pesho = new Employee("Pesho", 27, 2350);
		Employee ivan = new Employee("Ivan", 22, 1800);
		Employee simo = new Employee("Simo", 28, 2600);
		Employee dori = new Employee("Dori", 35, 1400);
		Employee kris = new Employee("Kris", 25, 2250);
		Employee ivet = new Employee("Ivet", 21, 2300);
		theSmilePeople.addEmployee("IT", pesho);
		theSmilePeople.addEmployee("IT", kris);
		theSmilePeople.addEmployee("IT", ivet);
		theSmilePeople.addEmployee("HR's", ivan);
		theSmilePeople.addEmployee("Sales", simo);
		theSmilePeople.addEmployee("Sales", dori);
		theSmilePeople.printCompanyInfo(Company.Criteria.SALARY);
		System.out.println(convertEmps(theSmilePeople.getEmployees()));
		
	}
	public static TreeSet<Employee> convertEmps(Map<String, HashSet<Employee>> emp) {
		TreeSet<Employee> set = new TreeSet<>(new ComparatorByName());
		for(HashSet<Employee> e : emp.values() ) {
			set.addAll(e);
		}
		return set;
	}
}
