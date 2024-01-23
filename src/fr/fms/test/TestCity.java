package fr.fms.test;

import fr.fms.entities.City;

public class TestCity {

	public static void main(String[] args) {
		
		City toulouse = new City("Toulouse", "France", 450_000);
		City bordeaux = new City("Bordeaux", "France", 249_712);
		City boston = new City("Boston", "United States", 654_776);
		City papeete = new City("Papeete", "Tahiti", 26_926);
		City tolede = new City("Tolede", "Espagne", 84_282);
		
		System.out.println(toulouse);

		try {
			toulouse.setResidentNumber(-150);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(toulouse);
		
		int newResident = 20_000;
		try {
			toulouse.setResidentNumber(toulouse.getResidentNumber() + newResident);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(toulouse);
		
		try {
			tolede.setResidentNumber(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(tolede);
	}

}
