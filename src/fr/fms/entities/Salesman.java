package fr.fms.entities;

public class Salesman extends Person {

	private static final double turnover = 50000.0;
	
	City bornCity;
	private String company;
	private double percentageTurnover;
	
	public Salesman(String firstName, String lastName, int age, String address, City bornCity, String company, double percentageTurnover) {
		super(firstName, lastName, age, address);
		this.bornCity = bornCity;
		this.company = company;
		this.percentageTurnover = percentageTurnover;
	}

	public City getBornCity() {
		return bornCity;
	}

	public void setBornCity(City bornCity) {
		this.bornCity = bornCity;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPercentageTurnover() {
		return percentageTurnover;
	}

	public void setPercentageTurnover(double percentageTurnover) {
		this.percentageTurnover = percentageTurnover;
	}
	
	@Override
	public double remuneration() {
		return percentageTurnover *= turnover/100;
	}

	@Override
	public String toString() {
		return "Salesman [bornCity=" + bornCity + ", company=" + company + ", percentageTurnover=" + percentageTurnover
				+ ", toString()=" + super.toString() + "]";
	}
}
