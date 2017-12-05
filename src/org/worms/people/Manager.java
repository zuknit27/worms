package org.worms.people;

import java.util.ArrayList;


import org.worms.hardware.*;
public class Manager extends Employee {
    
   // private ArrayList<SalesEmployee> employeeList;
    private ArrayList<Product> product;
    private Department department;
    private int i;
    private int j;
    
    public Manager() {
        
        i = 0;
        j = 0;
        department = new Department();
        //employeeList = new ArrayList<SalesEmployee>();
        product = new ArrayList<Product>();
        
        
    }
    
    public void setStocks(Product someS) {
        
        this.product.add(someS);
        
    }
    public ArrayList<Product> getStocks() {
        return product;
    }
    
    
    public ArrayList<SalesEmployee> getEmployeeList() {
        
        return department.getSalesEmployeeList();
    	//return this.employeeList;
        
    }
    
    public void setEmployeeList(SalesEmployee someEmployee) {
        
        
        for(int i = 0; i < department.getSalesEmployeeList().size(); i++) {
            if (department.getSalesEmployeeList().get(i) == someEmployee) {
                return;
            }
        }
        department.getSalesEmployeeList().add(someEmployee);
        someEmployee.setManager(this);
        
    }
    public String checkTeamSchedule() {
        
        String AllSchedules = "";
        
        for (i = 0; i < department.getSalesEmployeeList().size(); i++) {
            AllSchedules += "Name: " + department.getSalesEmployeeList().get(i).getName()
            + "\n\t";
            for (j=0; j < department.getSalesEmployeeList().get(i).getWorkSchedule().size(); j++) {
                AllSchedules += super.convertTime(department.getSalesEmployeeList().get(i).getWorkSchedule().get(j))
                + "\n\t";
            }
            
        }
        
        return AllSchedules;
    }
    
    public String checkLate() {
        
        String check = "";
        for (int i = 0; i < department.getSalesEmployeeList().size(); i++){
            int punchTime = department.getSalesEmployeeList().get(i).getPunch();
            if (punchTime == -1) {//if the punchTime is initialized value
                check += "Employee ";
                check += department.getSalesEmployeeList().get(i).getName().toString();
                check += " did not arrive.\n";
            }
            
            else {
                
                for(int j = 0; j < department.getSalesEmployeeList().get(i).getWorkSchedule().size(); j++) {
                    int day = department.getSalesEmployeeList().get(i).getWorkSchedule().get(j)/100;
                    int punchday = punchTime/100;
                    if(day == punchday) {
                        if(punchTime == department.getSalesEmployeeList().get(i).getWorkSchedule().get(j)) {
                            check += "Employee ";
                            check += department.getSalesEmployeeList().get(i).getName().toString();
                            check += " arrived on time at ";
                            check += super.convertTime(department.getSalesEmployeeList().get(i).getWorkSchedule().get(j)) + "\n";
                        }
                        else if (punchTime < department.getSalesEmployeeList().get(i).getWorkSchedule().get(j)) {
                            check += "Employee ";
                            check += department.getSalesEmployeeList().get(i).getName().toString();
                            check += " arrived early at ";
                            check += super.convertTime(punchTime);
                            check += ". schedule time is at ";
                            check += super.convertTime(department.getSalesEmployeeList().get(i).getWorkSchedule().get(j)) + "\n";
                        }
                        else if (punchTime > department.getSalesEmployeeList().get(i).getWorkSchedule().get(j)) {
                            check += "Employee ";
                            check += department.getSalesEmployeeList().get(i).getName().toString();
                            check += " arrived late at ";
                            check += super.convertTime(punchTime);
                            check += ". schedule time is at ";
                            check += super.convertTime(department.getSalesEmployeeList().get(i).getWorkSchedule().get(j)) + "\n";
                        }
                        
                    }
                }
            }
        }
        return check;
    }
    
    
    public String checkOperationsCompleted() {
        
        String operations = "";
        
        for(i = 0; i < department.getSalesEmployeeList().size(); i++) {
            //System.out.println(this.employeeList.get(i).getName());
            operations += "Name: " + department.getSalesEmployeeList().get(i).getName().toString() + "\n\t";
            
            //System.out.println(this.employeeList.get(i).getToDoList().size());
            for(j = 0; j < department.getSalesEmployeeList().get(i).getTaskList().size(); j++)
            {
                operations += "task: "
                + department.getSalesEmployeeList().get(i).getTaskList().get(j).getName()
                + "\t\t";
                if (department.getSalesEmployeeList().get(i).getTaskList().get(j).getCompleted() == true) {
                    
                    operations += "Finished";
                    
                }
                else {
                    operations += "Not Complete";
                }
                operations += "\n";
            }
        }
        
        return operations;
    }
    
    public String checkStocks() {//ArrayList<Product> products) {
        
        String AllStocks = "";
        
        for (i = 0; i < this.product.size(); i ++) {
            AllStocks += "Product: \t" + this.product.get(i).getName().toString() + "\n\t\t";
            AllStocks += "Amount: " + Integer.toString(this.product.get(i).getInventory()) + "\n\t\t";
            AllStocks += "Price: " + Double.toString(this.product.get(i).getPrice()) + "\n";
        }
        
        return AllStocks;
        
    }
    
    public void raisePriceStock(double amount, Product someItem) {
        someItem.setPrice(amount + someItem.getPrice());
        
    }
    
    public void restockItem(int amount, Product someItem) {
        
        for (i = 0; i < this.product.size(); i++) {
            if(someItem.getName() == this.product.get(i).getName()) {
                this.product.get(i).increaseInventory(amount);
            }
        }
    }
    
    public void setDepartment(Department someD) {
        
    	
        this.department = someD;
        someD.setManagerList(this);
        
    }
    
    public Department getDepartment() {
        return this.department;
    }
}

