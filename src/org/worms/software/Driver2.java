package org.worms.software;

import java.io.IOException;

import org.worms.hardware.Department;
import org.worms.hardware.Product;
import org.worms.hardware.Store;
import org.worms.hardware.Task;
import org.worms.people.HREmployee;
import org.worms.people.Manager;
import org.worms.people.SalesEmployee;

public class Driver2 {
	public static void main(String[] args) throws IOException
	{
		
		//create a new store
		Store store = new Store();
		store.setName("I've Got Worms");
		
		//create a new departments
		Department dept1 = new Department();
		dept1.setName("Worm Sales");
		//add the department to the store
		store.setDepartment(dept1);
		
		Department dept2 = new Department();
		dept2.setName("Human Resources");
		store.setDepartment(dept2);
		
		//create a manager
		Manager mang1 = new Manager();
		mang1.setName("Bill");
		mang1.setSalary(500);
		mang1.setDepartment(dept1);
		
		mang1.setWorkSchedule(100);
		mang1.setWorkSchedule(200);
		mang1.setWorkSchedule(300);
		mang1.setWorkSchedule(400);
		mang1.setWorkSchedule(500);
		mang1.setWorkSchedule(600);
		mang1.setWorkSchedule(700);
		
		mang1.setAppointmentSchedule(110);
		
		//create hr employees
		HREmployee hr1 = new HREmployee();
		hr1.setName("Paul");
		hr1.setSalary(500);
		hr1.setDepartment(dept2);
		
		
		
		//create some sales employees
		SalesEmployee sales1 = new SalesEmployee();
		SalesEmployee sales2 = new SalesEmployee();
		SalesEmployee sales3 = new SalesEmployee();
		
		sales1.setName("Tom");
		sales2.setName("Bob");
		sales3.setName("Jon");
		
		sales1.setSalary(300);
		sales2.setSalary(300);
		sales3.setSalary(300);
		
		//Set schedules
        sales1.setWorkSchedule(100);
        sales1.setWorkSchedule(200);
        sales1.setWorkSchedule(300);
        sales1.setWorkSchedule(400);
        sales1.setWorkSchedule(500);
        
        sales2.setWorkSchedule(124);
        sales2.setWorkSchedule(324);
        sales2.setWorkSchedule(524);
        
        sales3.setWorkSchedule(148);
        sales3.setWorkSchedule(248);
        sales3.setWorkSchedule(448);
        sales3.setWorkSchedule(548);
		
		//Set positions
        sales1.setPosition("Cashier");
        sales2.setPosition("Greeter");
        sales3.setPosition("Cashier");
        
        //setting puch time for Monday
        sales1.setPunch(101);
        sales2.setPunch(123);
        sales3.setPunch(148);
		
		//add sales employees to department
		sales1.setDepartment(dept1);
		sales2.setDepartment(dept1);
		sales3.setDepartment(dept1);
		
		//create some tasks
		Task task1 = new Task();
		Task task2 = new Task();
		Task task3 = new Task();
		
		task1.setName("Make a sale");
		task2.setName("Report to Manager");
		task3.setName("Go to appointment");
	
		
		
		//create some products
		Product prod1 = new Product();
		Product prod2 = new Product();
		
		prod1.setName("Earthworms");
		prod1.setInventory(1500);
		prod1.setPrice(0.05);
		
		prod2.setName("Fishing Poles");
		prod2.setInventory(25);
		prod2.setPrice(25);
		
		WormsGUI newGUI;
		newGUI = new WormsGUI("I've Got Worms", store);
		
		
		
		
		
		
		
		
		
	}
}
