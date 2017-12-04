package org.worms.hardware;
import java.util.ArrayList;

import org.worms.people.Employee;
import org.worms.people.HREmployee;
import org.worms.people.Manager;
import org.worms.people.SalesEmployee;

public class Department {
    
    private String name;
    private ArrayList<Product> product;
    private ArrayList<SalesEmployee> salesEmployeeList;
    private ArrayList<Manager> managerList;
    private ArrayList<HREmployee> hrEmployeeList;
    
    public Department() {
        
        name = "unknown";
        product = new ArrayList<Product>();
        salesEmployeeList = new ArrayList<SalesEmployee>();
        managerList = new ArrayList<Manager>();
        hrEmployeeList = new ArrayList<HREmployee>();
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public void removeFromDept(Employee someE) {
        salesEmployeeList.remove(someE);
        
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
    
    public ArrayList<SalesEmployee> getSalesEmployeeList() {
        return this.salesEmployeeList;
    }
    
    public void setSalesEmployeeList(SalesEmployee someE) {
        this.salesEmployeeList.add(someE);
    }
    public void setHREmployeeList(HREmployee hrEmployee)
    {
    	hrEmployeeList.add(hrEmployee);
    }
    public ArrayList<HREmployee> getHREmployeeList()
    {
    	return hrEmployeeList;
    }
    public void setManagerList(Manager manager)
    {
    	managerList.add(manager);
    }
    public ArrayList<Manager> getManagerList()
    {
    	return managerList;
    }
    
    
}

