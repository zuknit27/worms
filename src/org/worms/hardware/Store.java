package org.worms.hardware;

import java.util.ArrayList;

//import org.worms.people.SalesEmployee;
//import org.worms.people.Manager;
import org.worms.people.HREmployee;

public class Store {
    
    private String name;
    //private ArrayList<SalesEmployee> salesEmployeeList;
    //private ArrayList<Manager> managerList;
    private ArrayList<Department> departmentList;
    //private ArrayList<Product> productList;
    //private ArrayList<Task> taskList;
    private ArrayList<HREmployee> hrEmployeeList;
    //    private ArrayList<Integer> hours;
    
    public Store() {
        name = "unknown";
       // salesEmployeeList = new ArrayList<SalesEmployee>();
        departmentList = new ArrayList<Department>();
        //productList = new ArrayList<Product>();
        //taskList = new ArrayList<Task>();
        //managerList = new ArrayList<Manager>();
        hrEmployeeList = new ArrayList<HREmployee>();
        //    hours = new ArrayList<Integer>();
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String someN) {
        this.name = someN;
    }
    
//    public ArrayList<SalesEmployee> getSalesEmployeeList(){
//        return this.salesEmployeeList;
//    }
//    
//    public void setSalesEmployee(SalesEmployee someE) {
//        this.salesEmployeeList.add(someE);
//    }
    
    public ArrayList<Department> getDepartmentList(){
        return this.departmentList;
    }
    
    public void setDepartment(Department someD) {
        this.departmentList.add(someD);
    }
    
//    public ArrayList<Product> getAllProducts(){
//        return this.productList;
//    }
//    
//    public void setProducts(Product someP) {
//        this.productList.add(someP);
//    }
//    
//    public ArrayList<Task> getAllTasks(){
//        return this.taskList;
//    }
//    
//    public void setTasks(Task someT) {
//        this.taskList.add(someT);
//    }
//    public void setManagerList(Manager manager)
//    {
//        managerList.add(manager);
//    }
//    public ArrayList<Manager> getManagerList()
//    {
//        return managerList;
//    }
    public static String scheduleToString(int schedule)
    {
        return "fix this";
    }
    public void setHREmployeeList(HREmployee e)
    {
    	hrEmployeeList.add(e);
    }
    public ArrayList<HREmployee> getHREmployeeList()
    {
    	return hrEmployeeList;
    }
//    public void fireEmployee(SalesEmployee e)
//    {
//    	salesEmployeeList.remove(e);
//    }
//    public void hireEmployee(SalesEmployee e)
//    {
//    	salesEmployeeList.add(e);
//    }
//    
}

