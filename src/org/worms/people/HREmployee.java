package org.worms.people;

import java.util.ArrayList;
import org.worms.people.Employee;

public class HREmployee  extends Employee{
  private ArrayList<Employee> employeeList;
  
  public HREmployee() {
    employeeList = new ArrayList<Employee>();
  }
  
  public void hire(Employee e){
    employeeList.add(e);
  }
  public void fire(Employee e){
    int i = 0;
    for(i = 0; i < employeeList.size(); i++){
      if(e == employeeList.get(i)){
        employeeList.remove(i);
      }
    }
  }
  public void scheduleAppointment(Employee e){
    int t = 0;    
    e.addToAppointmentSchedule(t); //Unsure what we want to add here, so just added a 0
  }
  

}
