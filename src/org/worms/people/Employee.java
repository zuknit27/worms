package org.worms.people;


import java.util.ArrayList;
import org.worms.hardware.Department;
import org.worms.hardware.Task;

public class Employee
{
	private String name;
	private double salary;
	private ArrayList<Integer> workSchedule = new ArrayList<Integer>();
	private ArrayList<Integer> appointmentSchedule = new ArrayList<Integer>();
	private ArrayList<Task> taskList = new ArrayList<Task>();
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
	public void addTask(Task taskItem)
	{
		this.taskList.add(taskItem);
	}
	public void removeTask(Task taskItem)
	{
		this.taskList.remove(taskItem);
	}
	public ArrayList<Task> getTaskList()
	{
		return taskList;
	}
	
}
