package org.worms.people;


import java.util.ArrayList;

import org.worms.hardware.*;

public abstract class Employee
{
    private String name;
    private double salary;
    private ArrayList<Integer> workSchedule = new ArrayList<Integer>();
    private ArrayList<Integer> appointmentSchedule = new ArrayList<Integer>();
    private ArrayList<Task> taskList;
    //private Department department;
    private String[] Week;
    
    public Employee()
    {
        this.name = "unknown";
        this.salary = 0.0;
        taskList = new ArrayList<Task>();
        Week = new String[]{"Mon","Tue","Wed","Thu","Fri"};
        
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public void setWorkSchedule(int schedule)
    {
        workSchedule.add(schedule);
    }
    public ArrayList<Integer> getWorkSchedule()
    {
        return workSchedule;
    }
    public void setAppointmentSchedule(int schedule)
    {
        appointmentSchedule.add(schedule);
    }
    public ArrayList<Integer> getAppointmentSchedule()
    {
        return appointmentSchedule;
    }
    //public void setDepartment(Department department)
    //{
      //  department.setEmployeeList(this);
      //  this.department = department;
   // }
  // public Department getDepartment()
    //{
     //   return department;
   // }
    public void addTask(Task taskItem)
    {
        taskList.add(taskItem);
    }
    public void removeTask(Task taskItem)
    {
        taskList.remove(taskItem);
    }
    
    public ArrayList<Task> getTaskList()
    {
        return taskList;
    }
    
    public int getPunch() {
        return this.getPunch();
    }
    
    public String convertTime(int slot) {
        System.out.println(slot);
        String convert = "";
        int day = slot/100;
        int hour = (slot - (day * 100))/12;
        int mins = (slot - (day * 100))%12;
        convert += Week[day-1] + " ";
        if (hour >= 3) {
            convert += hour-2  + ":" + (mins < 2 ? "0" : "") + mins*5 + "pm";
        }
        else {
            convert += hour+10 + ":" + (mins < 2 ? "0" : "") + mins*5 + "am";
        }
        return convert;
    }
    public boolean getFinished() {
        
        
        return false;
    }
    public void setRaise(double somePercent) {
        
        this.setSalary(((somePercent/100) * this.getSalary()) + this.getSalary());
        
    }
}

