package org.worms.people;

import java.util.ArrayList;
import org.worms.people.Manager;

public class SalesEmployee  extends Employee{
	
	private String position;
	Manager manager;
	private ArrayList<Integer> schedule = new ArrayList<Integer>();
	//private ArrayList<String> toDoList = new ArrayList<String>();
	
	public SalesEmployee()
	{
		this.position = "unknow";
		Manager manager = new Manager();
		
	}
	
	public void setPosition(String position)
	{
		this.position = position;
	}
	public String getPosition()
	{
		return position;
	}
	public void setManager(Manager manager)
	{
		this.manager = manager;
	}
	public Manager getManager()
	{
		return manager;
	}
	public void addToSchedule(int schedule)
	{
		this.schedule.add(schedule);
	}
//	public void addTask(String taskItem)
//	{
//		this.toDoList.add(taskItem);
//	}
//	public void removeTask(String taskItem)
//	{
//		this.toDoList.remove(taskItem);
//	}
	

}
