package org.worms.people;

import java.util.ArrayList;

import org.worms.hardware.Product;
public class Manager extends Employee {
	
	private ArrayList<Employee> employeeList;
	private Product product;
	private int i;
	private int j;
	
	public Manager() {
		
		i = 0;
		j = 0;
		employeeList = new ArrayList<Employee>();
		
	}
	
	public ArrayList<Employee> getEmployeeList() {
	
		return this.employeeList;
		
	}
	
	public void setEmployeeList(Employee someEmployee) {
		
		this.employeeList.add(someEmployee);
		
	}
		public String checkTeamSchedule() {
		
		String AllSchedules = "";
		
		for (i = 0; i < this.employeeList.size(); i++) {
			AllSchedules += "Name: " + this.employeeList.get(i).getName().toString() 
					+ "\n\t";
			for (j=0; j < this.employeeList.get(i).getSchedule().size(); j++) {
				AllSchedules += this.employeeList.get(i).getSchedule().get(j).toString()
						+ "\n\t";				
			}
			
		}
		
		return AllSchedules;
	}
	
	public boolean checkLate(Employee someEmployee, int punchTime) {
		
		if (punchTime == -1) {//if the punchTime is initialized value
			System.out.println("Employee " + someEmployee.getName() + " did not arrive.");
			return true;
		}
		else {
		for (i = 0; i < someEmployee.getSchedule().size(); i++) {//iterates through employee schedule
		
			if(someEmployee.getSchedule().get(i) < punchTime) {//checks schedule against punchin Time
				
				return true;// if punch Time is greater than desired schedule true "employee is late"
			}
		
		}
		return false;//employee was not late
		}	
	}


	public String checkOperationsCompleted() {

		String operations = "";
		
		for(i = 0; i < this.employeeList.size(); i++) {
			operations += "Name: " + this.employeeList.get(i).getName().toString() + "\n\t";	
				for(j = 0; j < this.employeeList.getName().get(i).getOperations().size(); j++) {
					operations += "task: " 
							+ this.employeeList.getName().get(i).getOperations().getOperationName().toString()
							+ "\t";
					if (this.employeeList.getName().get(i).getOperations().getFinished() == true) {
						
						operations += "Finished";
						
					}
					else {
						operations += "Not Complete";
					}
					operations += "\n";
				}
		}
		
		
		return operations;
	}
	
	public String checkStocks(ArrayList<Product> products) {
		
		String AllStocks = "";
		
		for (i = 0; i < products.size(); i ++) {
			AllStocks += "Product " + products.getName() + "\n\t";
			AllStocks += "Amount: " + products.getName().get(i).getInventory().toString() + "\n";

		}
		
		return AllStocks;
		
	}
	
	public void restockItem(int amount) {
		
		this.product.increaseInventory(amount);
		
	}
}