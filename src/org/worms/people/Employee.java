package org.worms.people;

import java.util.ArrayList;
import org.worms.hardware.Department;

public class Employee
{
	private String name;
	private double salary;
	private ArrayList<Integer> schedule = new ArrayList<Integer>();
	private Department department;
	
	public Employee()
	{
		this.name = "unknown";
		this.salary = 0.0;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public void addToSchedule(int s)
	{
		schedule.add(s);
	}
	public ArrayList<Integer> getSchedule()
	{
		return schedule;
	}
	public void setDepartment(Department department)
	{
		this.department = department;
	}
	public Department getDepartment()
	{
		return department;
	}
}
