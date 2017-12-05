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
    public static String scheduleToString(int value)
    {
    	String str;
		if(value > 100 && value < 200)
		{
			str = "Mon ";
			value = value - 100;
		}
		else if(value > 200 && value < 300)
		{
			str = "Tue ";
			value = value - 200;
		}
		else if(value > 300 && value < 400)
		{
			str = "Wed ";
			value = value - 300;
		}
		else if(value > 400 && value < 500)
		{
			str = "Thu ";
			value = value - 400;
		}
		else if(value > 500 && value < 600)
		{
			str = "Fri ";
			value = value - 500;
		}
		else if(value > 600 && value < 700)
		{
			str = "Sat ";
			value = value - 600;
		}
		else
		{
			str = "Sun ";
			value = value - 700;
		}
		switch(value)
		{
		case 1:
			str = str + "";
			str = str + "8:00am to 11:00am";
			break;
		case 2:
			str = str + "11:00am to 3:00pm";
			break;
		case 3:
			str = str + "3:00pm to 7:00pm";
			break;
//		case 4:
//			str = str + "12:30pm to 1:45pm";
//			break;
//		case 5:
//			str = str + "2:00pm to 3:15pm";
//			break;
//		case 6:
//			str = str + "3:30pm to 4:45pm";
//			break;
			
		default:
			str = "invalid Schedule";
			break;
		}
		return str;
		
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

