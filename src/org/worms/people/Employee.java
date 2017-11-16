package org.worms.people;

import java.util.ArrayList;
import org.worms.hardware.Department;

public class Employee
{
	private String name;
	private double salary;
	private ArrayList<Integer> workSchedule = new ArrayList<Integer>();
	private ArrayList<Integer> appointmentSchedule = new ArrayList<Integer>();
	private ArrayList<String> toDoList = new ArrayList<String>();
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
	public void addToWorkSchedule(int schedule)
	{
		workSchedule.add(schedule);
	}
	public ArrayList<Integer> getWorkSchedule()
	{
		return workSchedule;
	}
	public void addToAppointmentSchedule(int schedule)
	{
		appointmentSchedule.add(schedule);
	}
	public ArrayList<Integer> getAppointmentSchedule()
	{
		return appointmentSchedule;
	}
	public void setDepartment(Department department)
	{
		this.department = department;
	}
	public Department getDepartment()
	{
		return department;
	}
	public void addTask(String taskItem)
	{
		this.toDoList.add(taskItem);
	}
	public void removeTask(String taskItem)
	{
		this.toDoList.remove(taskItem);
	}
	public ArrayList<String> getToDoList()
	{
		return toDoList;
	}
}
