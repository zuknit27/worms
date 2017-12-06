package org.worms.hardware;

import java.util.ArrayList;

//import org.worms.people.SalesEmployee;
//import org.worms.people.Manager;
import org.worms.people.HREmployee;

public class Store {
    
    private String name;
    private ArrayList<Department> departmentList;
    //private ArrayList<HREmployee> hrEmployeeList;
    
    public Store() {
        name = "unknown";
        departmentList = new ArrayList<Department>();
        
       // hrEmployeeList = new ArrayList<HREmployee>();
        
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String someN) {
        this.name = someN;
    }

    
    public ArrayList<Department> getDepartmentList(){
        return this.departmentList;
    }
    
    public void setDepartment(Department someD) {
        this.departmentList.add(someD);
    }
    

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

			
		default:
			str = "invalid Schedule";
			break;
		}
		return str;
		
	}
        
    
//    public void setHREmployeeList(HREmployee e)
//    {
//    	hrEmployeeList.add(e);
//    }
//    public ArrayList<HREmployee> getHREmployeeList()
//    {
//    	return hrEmployeeList;
//    }
  
}

