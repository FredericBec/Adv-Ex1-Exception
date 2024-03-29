package fr.fms.entities;

public abstract class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String address;
	
	public Person(String firstName, String lastName, int age, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception{
		if(age < 0) throw new Exception("L'âge ne peut être négatif");
		else this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public abstract double remuneration();

	@Override
	public String toString() {
		return "prénom : " + firstName + ", nom : " + lastName + ", âge : " + age + ", adresse : " + address;
	}
}
