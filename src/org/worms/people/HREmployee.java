package org.worms.people;

import java.util.ArrayList;

import org.worms.hardware.*;

public class HREmployee  extends Employee{
    //private ArrayList<Employee> employeeList;
    private ArrayList<Integer> appointments;
    private Department department;
    private int i;
    
    public HREmployee() {
        //employeeList = new ArrayList<Employee>();
        appointments = new ArrayList<Integer>();
        department = new Department();
        i = 0;
    }
    
    public void setDepartment(Department someD) {
        this.department = someD;
        someD.setHREmployeeList(this);
        
    }
    
    public Department getDepartment() {
        
        return this.department;
    }
    public ArrayList<Integer> getAppointments(){
        return this.appointments;
    }
    
    public void setAppointments(int someA) {
        this.appointments.add(someA);
    }
    
    public void hire(SalesEmployee e, Department department, double salary){
        e.setSalary(salary);
        //e.setDepartment(department);
        department.setSalesEmployeeList(e);
    	
        
    }
    public boolean fire(SalesEmployee e, Department someD) {
        
        for(int i = 0; i < someD.getSalesEmployeeList().size(); i++){
            //    System.out.println(someD.getEmployeeList().get(i).getName());
            if(someD.getSalesEmployeeList().get(i).equals(e)){
            	
                someD.getSalesEmployeeList().get(i).getDepartment().removeFromDept(e);
                return true;
                
            }
        }
        return false;
    }
    public boolean fire(Manager manager, Department department)
    {
    	for(int i = 0; i < department.getManagerList().size(); i++)
    	{
    		if(department.getManagerList().get(i).equals(manager))
    		{
    			department.getManagerList().remove(manager);
    			return true;
    		}
    	}
    	return false;
    }
    
    public boolean checkConflict(Integer time) {
        
        for(i = 0; i < this.appointments.size(); i++) {
            if (this.appointments.get(i) == time) {
                return true;
            }
            
        }
        return false;
    }
    
    
    public void scheduleAppointment(Employee someE, int time){
        //military time EX. 113 is monday at 1PM, 309 = Wendnesday at 9AM
        int hours = (time%100);
        for (int i = 0; i < someE.getWorkSchedule().size(); i++) 
        {
            if(time >= someE.getWorkSchedule().get(i));
            if(hours > 72 || (time/100) > 5) {
                System.out.println("Appointments can only be scheduled during store operation hours");
                return;
            }
            else if(checkConflict(time)) {
                System.out.println("Appointment already scheduled at " + super.convertTime(time));
                return;
            }
            else {
                this.appointments.add(time);
                System.out.println("Appointment scheduled at " + super.convertTime(time));
                return;
            }
            
        }
    }
    
}
