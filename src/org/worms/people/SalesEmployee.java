package org.worms.people;

import java.util.ArrayList;

import org.worms.hardware.*;
import org.worms.people.Manager;

public class SalesEmployee  extends Employee{
	
	private String position;
	private Manager manager;
	private Department department;
	private int punchTime;
	private ArrayList<Integer> schedule = new ArrayList<Integer>();
	private ArrayList<Task> taskList = new ArrayList<Task>();
	
	public SalesEmployee()
	{
		this.punchTime = 0;
		this.department = new Department();
		this.position = "unknown";
		this.manager = new Manager();
		
	}
	
	public void setDepartment(Department someD) {
		
		this.department = someD;
		someD.setEmployeeList(this);
		
	}
	
	public Department getDepartment() {
		return this.department;
	}
	
	public Manager getManager() {
		
		return this.manager;
		
	}
	
	public void setManager(Manager someM) {
		this.manager = someM;
	}
	public int getPunch() {
		
		return this.punchTime;
		
	}
	
	public void setPunch(int someP) {
		this.punchTime = someP;
	}
	
	public void setPosition(String position)
	{
		this.position = position;
	}
	public String getPosition()
	{
		return this.position;
	}

	public void addToSchedule(int schedule)
	{
		this.schedule.add(schedule);
	}
	public void addTask(Task taskItem)
	{
		this.taskList.add(taskItem);
		taskItem.setEmployeeList(this);
		super.addTask(taskItem);
	}
	public void removeTask(Task taskItem)
	{
		
		this.taskList.remove(taskItem);
	}
	public ArrayList<Task> getTaskList()
	{
		return this.taskList;
	}
	public void taskCompleted(Task someT, boolean someB) {
		int i;
		for(i = 0; i < this.taskList.size(); i++) {
			someT.setCompleted(someB);
		}
	}

}
