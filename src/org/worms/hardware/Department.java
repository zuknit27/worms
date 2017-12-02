package org.worms.hardware;
import java.util.ArrayList;

import org.worms.people.Employee;

public class Department {

	private String name;
	private ArrayList<Product> product;
	private ArrayList<Employee> employeeList;
	
	public Department() {
		
		name = "unknown";
		product = new ArrayList<Product>();
		employeeList = new ArrayList<Employee>();
				
	}
	
	public String getName() {
		return this.name;
	}
	
	public void removeDept(Employee someE) {
		//System.out.println("In remove department " + someE.getName());
		for(int i = 0; i < this.employeeList.size();i++) {
			if (this.employeeList.get(i) == someE) {
				this.employeeList.remove(i);
			}
		}
		
	}
	public void setName(String someName) {
		this.name = someName;
	}
	
	public ArrayList<Product> getProductList() {
		return this.product;
	}
	
	public void setProductList(Product someP) {
		this.product.add(someP);
	}
	
	public ArrayList<Employee> getEmployeeList() {
		return this.employeeList;
	}
	
	public void setEmployeeList(Employee someE) {
		this.employeeList.add(someE);
	}	
	
}

