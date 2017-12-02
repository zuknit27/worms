package org.worms.people;

import java.util.ArrayList;

import org.worms.hardware.*;

public class HREmployee  extends Employee{
  private ArrayList<Employee> employeeList;
  private ArrayList<Integer> appointments;
  private Department department;
  private int i;
  
  public HREmployee() {
    employeeList = new ArrayList<Employee>();
    appointments = new ArrayList<Integer>();
    department = new Department();
    i = 0;
  }
  
  public void setDepartment(Department someD) {
	  this.department = someD;
	  someD.setEmployeeList(this);
	  
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
  
  public void hire(Employee e){
    employeeList.add(e);
  }
  public void fire(Employee e, Department someD){
    int i = 0;
    
    for(i = 0; i < someD.getEmployeeList().size(); i++){
    //	System.out.println(someD.getEmployeeList().get(i).getName());
      if(e == someD.getEmployeeList().get(i)){
    	  	someD.getEmployeeList().get(i).getDepartment().removeDept(e);
        
      }
    }
  } 
  
  public boolean checkConflict(Integer time) {
	  
	  for(i = 0; i < this.appointments.size(); i++) {
		  if (this.appointments.get(i) == time) {
			  return true;
		  } 
		 
	  }
	  return false;
  }
  
  public boolean addAppointment(Integer time) {
	 
	  if (this.checkConflict(time) == false) {
	  this.appointments.add(time);
	  return true;
	  }
	  return false;
  }
  
  public void scheduleAppointment(Employee someE, int time){
    //military time EX. 113 is monday at 1PM, 309 = Wendnesday at 9AM 
	  for(i = 0; i < this.employeeList.size(); i++) {
		  System.out.println(this.employeeList.get(i).getName());
	  }
	  if(this.addAppointment(time) == true) {
	  someE.addToAppointmentSchedule(time); //Unsure what we want to add here, so just added a 0
	  }
	  else {
	  System.out.println("Conflict detected");
	  }
  }

}
