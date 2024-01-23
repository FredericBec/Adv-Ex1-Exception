package fr.fms.entities;

public class City {

	private String name;
	private String country;
	private int residentNumber;
	
	public City(String name, String country, int residentNumber) {
		this.name = name;
		this.country = country;
		this.residentNumber = residentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getResidentNumber() {
		return residentNumber;
	}

	public void setResidentNumber(int residentNumber) {
		this.residentNumber = residentNumber;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", country=" + country + ", residentNumber=" + residentNumber + "]";
	}
	
	
}
