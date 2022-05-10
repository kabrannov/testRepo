package streams;

import java.util.List;

public class Employee {
	private String firstName;
	private String lastName;
	private int age;
	private List skills;
	
	public Employee(String firstName, String lastName, int age, List skills) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.skills = skills;
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

	public void setAge(int age) {
		this.age = age;
	}

	public List getSkills() {
		return skills;
	}

	public void setSkills(List skills) {
		this.skills = skills;
	}
	
	public String toString() {
		return "Employee, first name: " + firstName + " last name: " + 
				lastName + " age: " + age + " skills: " + this.getSkills();
	}
	
	
}
