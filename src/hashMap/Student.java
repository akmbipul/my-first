package hashMap;

public class Student {

	private String firstName;
	private String lastName;
	private double salary;
	private int yearOfExp;
	

	
	public Student(String firstName, String lastName, double salary, int yearOfExp) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.yearOfExp = yearOfExp;
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

	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	public int getYearOfExp() {
		return yearOfExp;
	}

	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}



}
