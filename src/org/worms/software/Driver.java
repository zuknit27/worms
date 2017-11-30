package org.worms.software;

import org.worms.people.*;
import org.worms.hardware.*;


public class Driver 
{
	public static void main(String[] args)
	{

		Store wormStore = new Store();
		Department d1 = new Department();
		

		Manager m1 = new Manager();
		HREmployee h1 = new HREmployee();
		SalesEmployee s1 = new SalesEmployee();
		SalesEmployee s2 = new SalesEmployee();
		SalesEmployee s3 = new SalesEmployee();
		
		Product p1 = new Product();
		Task t1 = new Task();
		Task t2 = new Task();
		Task t3 = new Task();
		
		wormStore.setName("I've Got Worms");
		wormStore.addToDepartmentList(d1);
		
		//Set names
		d1.setName("Worm Sales");
		
		m1.setName("Mike");
		h1.setName("Henry");
		s1.setName("Steve");
		s2.setName("Jim");
		s3.setName("Bill");
		
		p1.setName("Earthworms");
		
		//List tasks
		t1.setName("Make a sale.");
		t2.setName("Report to Mike.");
		t3.setName("Go to appointment.");
		
		
		//Add to department
		m1.setDepartment(d1);
		h1.setDepartment(d1);
		s1.setDepartment(d1);
		s2.setDepartment(d1);
		s3.setDepartment(d1);
		
		//Add employees to employee lists
		h1.hire(s1);
		h1.hire(s2);
		h1.hire(s3);
		
		m1.setEmployeeList(s1);
		m1.setEmployeeList(s2);
		m1.setEmployeeList(s3);
		
		//Set manager for employees
		s1.setManager(m1);
		s2.setManager(m1);
		s3.setManager(m1);
		
		//Set positions
		s1.setPosition("Cashier");
		s2.setPosition("Greeter");
		s3.setPosition("Cashier");
		
		//Set schedules
		s1.addToWorkSchedule(101);
		s1.addToWorkSchedule(201);
		s1.addToWorkSchedule(301);
		s1.addToWorkSchedule(401);
		s1.addToWorkSchedule(501);
		
		s2.addToWorkSchedule(101);
		s2.addToWorkSchedule(301);
		s2.addToWorkSchedule(501);
		
		s3.addToWorkSchedule(101);
		s3.addToWorkSchedule(201);
		s3.addToWorkSchedule(401);
		s3.addToWorkSchedule(501);
		
		//Assign tasks
		s1.addTask(t1);
		s2.addTask(t2);
		s3.addTask(t3);
		
		//Assign salaries
		m1.setSalary(400);
		h1.setSalary(300);
		s1.setSalary(200);
		s2.setSalary(200);
		s3.setSalary(200);
		
		
		
		
//		
//		
//		//Test 1: Department functions
//		System.out.println("Test 1:");
//		System.out.println("This department is named " + d1.getName());
//		System.out.println("Employees in this department: ");
//		for(int i = 0; i < d1.getEmployeeList().size(); i++) {
//			System.out.println(d1.getEmployeeList().get(i).getName() + "\n\t");
//		}
//		
//		//Test 2: Manager Team Schedule check
//		System.out.println("\n\nTest 2:");
//		m1.checkTeamSchedule();
//		
//		
//		//Test 3: Task assignment
//		System.out.println("\n\nTest 3:");
//		System.out.println(s1.getName() + "'s task is " + s1.getTaskList().get(0).getName());
//		System.out.println(s2.getName() + "'s task is " + s2.getTaskList().get(0).getName());
//		System.out.println(s3.getName() + "'s task is " + s3.getTaskList().get(0).getName());
//		
//		
//		//Test 4: Salaries
//		System.out.println("\n\nTest 4:");
//		System.out.println(m1.getName() + "'s salary is $" + m1.getSalary());
//		System.out.println(h1.getName() + "'s salary is $" + h1.getSalary());
//		System.out.println(s1.getName() + "'s salary is $" + s1.getSalary());
//		System.out.println(s2.getName() + "'s salary is $" + s2.getSalary());
//		System.out.println(s3.getName() + "'s salary is $" + s3.getSalary());
//		
//		
//		//Test 5: Check that task is removed
//		System.out.println("\n\nTest 5:");
//		s1.removeTask(t1);
//		m1.checkOperationsCompleted();
//		
//		//Test 6: Check appointment is made
//		System.out.println("\n\nTest 6:");
//		h1.scheduleAppointment(s3);
//		System.out.println(s3.getName() + " has an appointment at " + s3.getAppointmentSchedule().get(0));
//		
//		//Test 7: Check firing employee removes from lists
//		System.out.println("\n\nTest 7:");
//		h1.fire(s3);
//		System.out.println(s3.getName() + " has been fired. Employees still in department: ");
//		for(int i = 0; i < d1.getEmployeeList().size(); i++) {
//			System.out.println(d1.getEmployeeList().get(i).getName() + "\n\t");
//		}
//		
		
		WormsGUI newGUI;
		newGUI = new WormsGUI("I've Got Worms", wormStore);
	}
}
