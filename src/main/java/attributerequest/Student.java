package attributerequest;

public class Student 
{

	String name;
	String surName;
	String number;

	public Student(String name,String surName,String number) 
	{
	this.name=name;
	this.surName=surName;
	this.number=number;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
