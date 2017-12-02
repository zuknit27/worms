package org.worms.hardware;

import java.util.ArrayList;

import org.worms.people.Employee;
import org.worms.people.Manager;

public class Store {
    
    private String name;
    private ArrayList<Employee> employeeList;
    private ArrayList<Manager> managerList;
    private ArrayList<Department> departmentList;
    private ArrayList<Product> productList;
    private ArrayList<Task> taskList;
    //    private ArrayList<Integer> hours;
    
    public Store() {
        name = "unknown";
        employeeList = new ArrayList<Employee>();
        departmentList = new ArrayList<Department>();
        productList = new ArrayList<Product>();
        taskList = new ArrayList<Task>();
        managerList = new ArrayList<Manager>();
        //    hours = new ArrayList<Integer>();
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String someN) {
        this.name = someN;
    }
    
    public ArrayList<Employee> getAllEmployees(){
        return this.employeeList;
    }
    
    public void setEmployeeSet(Employee someE) {
        this.employeeList.add(someE);
    }
    
    public ArrayList<Department> getDepartmentList(){
        return this.departmentList;
    }
    
    public void setDepartment(Department someD) {
        this.departmentList.add(someD);
    }
    
    public ArrayList<Product> getAllProducts(){
        return this.productList;
    }
    
    public void setProducts(Product someP) {
        this.productList.add(someP);
    }
    
    public ArrayList<Task> getAllTasks(){
        return this.taskList;
    }
    
    public void setTasks(Task someT) {
        this.taskList.add(someT);
    }
    public void setManagerList(Manager manager)
    {
        managerList.add(manager);
    }
    public ArrayList<Manager> getManagerList()
    {
        return managerList;
    }
    public static String scheduleToString(int schedule)
    {
        return "fix this";
    }
    
}

