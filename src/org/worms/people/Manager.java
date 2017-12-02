package org.worms.people;

import java.util.ArrayList;

import org.worms.hardware.*;
public class Manager extends Employee {
	
	private ArrayList<Employee> employeeList;
	private ArrayList<Product> product;
	private Department department;
	private int i;
	private int j;
	
	public Manager() {
		
		i = 0;
		j = 0;
		department = new Department();
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
			for (j=0; j < this.employeeList.get(i).getWorkSchedule().size(); j++) {
				AllSchedules += this.employeeList.get(i).getWorkSchedule().get(j).toString()
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
		for (i = 0; i < someEmployee.getWorkSchedule().size(); i++) {//iterates through employee schedule
		
			if(someEmployee.getWorkSchedule().get(i) < punchTime) {//checks schedule against punchin Time
				
				return true;// if punch Time is greater than desired schedule true "employee is late"
			}
		
		}
		return false;//employee was not late
		}	
	}


	public String checkOperationsCompleted() {
		
		String operations = "";
		
		for(i = 0; i < this.employeeList.size(); i++) {
			//System.out.println(this.employeeList.get(i).getName());
			operations += "Name: " + this.employeeList.get(i).getName().toString() + "\n\t";	

	//System.out.println(this.employeeList.get(i).getToDoList().size());
				for(j = 0; j < this.employeeList.get(i).getTaskList().size(); j++)
				{
					operations += "task: "
							+ this.employeeList.get(i).getTaskList().get(j)
							+ "\t";
					if (this.employeeList.get(i).getTaskList().get(j).getCompleted() == true) {
						
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
	
	public String checkStocks() {//ArrayList<Product> products) {
		
		String AllStocks = "";
		
		for (i = 0; i < this.product.size(); i ++) {
			AllStocks += "Product " + this.product.get(i).getName().toString() + "\n\t";
			AllStocks += "Amount: " + Integer.toString(this.product.get(i).getInventory()) + "\n";
		}
		
		return AllStocks;
		
	}
	
	public void restockItem(int amount, Product someItem) {
		
		for (i = 0; i < this.product.size(); i++) {
			if(someItem.getName() == this.product.get(i).getName()) {
				this.product.get(i).increaseInventory(amount);
			}
		}
	}
	
	public void setDepartment(Department someD) {
		
		this.department = someD;
		someD.setEmployeeList(this);
		
	}
	
	public Department getDepartment() {
		return this.department;
	}
}
