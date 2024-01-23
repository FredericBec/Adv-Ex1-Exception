package fr.fms.entities;

public class Capital extends City {
	
	private String monument;

	public Capital(String name, String country, int residentNumber, String monument) {
		super(name, country, residentNumber);
		this.monument = monument;
	}

	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}

	@Override
	public String toString() {
		return "Capital [monument=" + monument + ", toString()=" + super.toString() + "]";
	}
}
