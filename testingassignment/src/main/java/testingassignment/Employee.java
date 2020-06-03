package testingassignment;

import java.util.Date;

public class Employee {

	public int employeeId = 0;
	public String employeeName;
	public int employeeAge = 0;
	public Date joiningDate;
	
	
	public Employee(String name)
	{
		this.employeeName = name;
	}
	

	public void setEmployeeAge(int age)
	{
		this.employeeAge = age;
	}
	
	public int getEmployeeAge()
	{
		return this.employeeAge;
	}
	
	public void setJoiningDate(Date joiningDate)
	{
		this.joiningDate = joiningDate;
	}
	
	public String getEmployeeName()
	{
		return this.employeeName;
	}
}
