package org.worms.software;

import org.worms.hardware.*;
import org.worms.people.*;


public class Driver 
{
	public static void main(String[] args)
	{

		
		Department dept1 = new Department();

		Manager mang1 = new Manager();
		HREmployee hr1 = new HREmployee();
		SalesEmployee sales1 = new SalesEmployee();
		SalesEmployee sales2 = new SalesEmployee();
		SalesEmployee sales3 = new SalesEmployee();
		
		Product prod1 = new Product();
		Task task1 = new Task();
		Task task2 = new Task();
		Task task3 = new Task();
		
		Store store = new Store();
		
		
		//Set names
		dept1.setName("Worm Sales");
		
		mang1.setName("Mike");
		hr1.setName("Henry");
		sales1.setName("Steve");
		sales2.setName("Jim");
		sales3.setName("Bill");
		
		prod1.setName("Earthworms");
		
		//List tasks
		task1.setName("Make a sale.");
		task2.setName("Report to Mike.");
		task3.setName("Go to appointment.");
		
		//Set store name
		store.setName("I GOT WORMS");
		
		//Add to department
		mang1.setDepartment(dept1);
		hr1.setDepartment(dept1);
		sales1.setDepartment(dept1);
		sales2.setDepartment(dept1);
		sales3.setDepartment(dept1);
		
		//Add employees to employee lists
		hr1.hire(sales1);
		hr1.hire(sales2);
		hr1.hire(sales3);
		
		mang1.setEmployeeList(sales1);
		mang1.setEmployeeList(sales2);
		mang1.setEmployeeList(sales3);
		
		//Set manager for employees
		sales1.setManager(mang1);
		sales2.setManager(mang1);
		sales3.setManager(mang1);
		
		//Set positions
		sales1.setPosition("Cashier");
		sales2.setPosition("Greeter");
		sales3.setPosition("Cashier");
		
		//Set schedules
		sales1.addToWorkSchedule(101);
		sales1.addToWorkSchedule(201);
		sales1.addToWorkSchedule(301);
		sales1.addToWorkSchedule(401);
		sales1.addToWorkSchedule(501);
		
		sales2.addToWorkSchedule(101);
		sales2.addToWorkSchedule(301);
		sales2.addToWorkSchedule(501);
		
		sales3.addToWorkSchedule(101);
		sales3.addToWorkSchedule(201);
		sales3.addToWorkSchedule(401);
		sales3.addToWorkSchedule(501);
		
		//Assign tasks
		sales1.addTask(task1);
		sales2.addTask(task2);
		sales3.addTask(task3);
		
		//Assign salaries
		mang1.setSalary(400);
		hr1.setSalary(300);
		sales1.setSalary(200);
		sales2.setSalary(200);
		sales3.setSalary(200);
		
		
		
		
		
		
		//Test 1: Department functions
		System.out.println("Test 1:");
		System.out.println("This department is named " + dept1.getName());
		System.out.println("Employees in this department: ");
		for(int i = 0; i < dept1.getEmployeeList().size(); i++) {
			System.out.println("\t" + dept1.getEmployeeList().get(i).getName());
		}
		
		//Test 2: Manager Team Schedule check
		System.out.println("\n\nTest 2:");
		System.out.print(mang1.checkTeamSchedule());
		
		
		//Test 3: Task assignment
		System.out.println("\n\nTest 3:");
		System.out.println(sales1.getName() + "'s task is " + sales1.getTaskList().get(0).getName());
		System.out.println(sales2.getName() + "'s task is " + sales2.getTaskList().get(0).getName());
		System.out.println(sales3.getName() + "'s task is " + sales3.getTaskList().get(0).getName());
		
		
		//Test 4: Salaries
		System.out.println("\n\nTest 4:");
		System.out.println(mang1.getName() + "'s salary is $" + mang1.getSalary());
		System.out.println(hr1.getName() + "'s salary is $" + hr1.getSalary());
		System.out.println(sales1.getName() + "'s salary is $" + sales1.getSalary());
		System.out.println(sales2.getName() + "'s salary is $" + sales2.getSalary());
		System.out.println(sales3.getName() + "'s salary is $" + sales3.getSalary() + "\n");
		
		sales1.setRaise(100);
		mang1.setRaise(50);
		hr1.setRaise(5);
		
		System.out.println(mang1.getName() + "'s salary is $" + mang1.getSalary());
		System.out.println(hr1.getName() + "'s salary is $" + hr1.getSalary());
		System.out.println(sales1.getName() + "'s salary is $" + sales1.getSalary());
		System.out.println(sales2.getName() + "'s salary is $" + sales2.getSalary());
		System.out.println(sales3.getName() + "'s salary is $" + sales3.getSalary());
		
		
		//Test 5: Check that task is removed
		System.out.println("\n\nTest 5:");
		//sales1.removeTask(task1);
		sales1.taskCompleted(task1, true);
		System.out.println(mang1.checkOperationsCompleted());
		
		//Test 6: Check appointment is made
		System.out.println("\n\nTest 6:");
		hr1.scheduleAppointment(sales3, 101);
		System.out.println(sales3.getName() + " has an appointment at " + sales3.getAppointmentSchedule().get(0));
		
		//Test 7: Check firing employee removes from lists
		System.out.println("\n\nTest 7:");
		hr1.fire(sales3, dept1);
		hr1.fire(mang1, dept1);
		hr1.hire(sales3);
		sales3.setDepartment(dept1);
		System.out.println(mang1.getName() + " has been fired. Employees still in department: ");
		for(int i = 0; i < dept1.getEmployeeList().size(); i++) {
			System.out.println(dept1.getEmployeeList().get(i).getName() + "\n\t");
		}
		
		
	//	WormsGUI newGUI;
	//	newGUI = new WormsGUI("I've Got Worms");
	}
}
