package fr.fms.entities;

import fr.fms.exception.RemunerationException;

public class Employee extends Person {

	private static final double wageCosts = 0.20;
	private static final double MIN_SALARY = 1100.0;
	
	private String company;
	private double salary;
	City bornCity;
	
	public Employee(String firstName, String lastName, int age, String address, City bornCity, String company, double salary) {
		super(firstName, lastName, age, address);
		this.bornCity = new City(bornCity.getName(), bornCity.getCountry(), bornCity.getResidentNumber());
		this.company = company;
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws Exception{
		if(salary < 0) throw new RemunerationException("Le salaire de l'employé " + this.getLastName() + " ne peut pas être inférieur à 0");
		else this.salary = salary;
	}

	public City getBornCity() {
		return bornCity;
	}

	public void setBornCity(City bornCity) {
		this.bornCity = bornCity;
	}
	
	@Override
	public double remuneration() {
		return salary -= salary * wageCosts;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + bornCity + " entreprise : " + company + ", salaire : " + salary;
	}
}
