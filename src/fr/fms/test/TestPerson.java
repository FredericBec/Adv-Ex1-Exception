package fr.fms.test;

import fr.fms.entities.*;


public class TestPerson {

	public static void main(String[] args) {
		
		Person fred = new Employee("Frédéric", "Bec", 38, "habitant à muret", new City("Tulle", "France", 14000), "FMS", 0);
		System.out.println(fred + "\n");
		try {
			((Employee) fred).setSalary(-1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(fred + "\n");
		
		try {
			((Employee) fred).setSalary(1300.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fred);
		
		try {
			fred.setAge(-1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fred);
	}

}
