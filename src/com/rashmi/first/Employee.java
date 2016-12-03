package com.rashmi.first;

public class Employee {

	String name;
	int age;
	float income;
	boolean marital_status;

	public Employee() {
		super();
	}

	public Employee(String name, int age, float income, boolean marital_status) {
		super();
		this.name = name;
		this.age = age;
		this.income = income;
		this.marital_status = marital_status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getIncome() {
		return income;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + Float.floatToIntBits(income);
		result = prime * result + (marital_status ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		//  the below line compares the memory address of the present object with the object being compared to.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (Float.floatToIntBits(income) != Float.floatToIntBits(other.income))
			return false;
		if (marital_status != other.marital_status)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void setIncome(float i) {
		this.income = i;
	}

	public boolean isMarital_status() {
		return marital_status;
	}

	public void setMarital_status(boolean marital_status) {
		this.marital_status = marital_status;
	}

}
