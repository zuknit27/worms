package org.worms.people;

import java.util.ArrayList;


import org.worms.hardware.*;
public class Manager extends Employee {
    
    private ArrayList<Employee> employeeList;
    private ArrayList<Product> product;
    private Department department;
    private int i;
    private int j;
    
    public Manager() {
        
        i = 0;
        j = 0;
        department = new Department();
        employeeList = new ArrayList<Employee>();
        product = new ArrayList<Product>();
        
        
    }
    
    public void setStocks(Product someS) {
        
        this.product.add(someS);
        
    }
    public ArrayList<Product> getStocks() {
        return product;
    }
    
    
    public ArrayList<Employee> getEmployeeList() {
        
        return this.employeeList;
        
    }
    
    public void setEmployeeList(SalesEmployee someEmployee) {
        
        
        for(int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i) == someEmployee) {
                return;
            }
        }
        this.employeeList.add(someEmployee);
        someEmployee.setManager(this);
        
    }
    public String checkTeamSchedule() {
        
        String AllSchedules = "";
        
        for (i = 0; i < this.employeeList.size(); i++) {
            AllSchedules += "Name: " + this.employeeList.get(i).getName()
            + "\n\t";
            for (j=0; j < this.employeeList.get(i).getWorkSchedule().size(); j++) {
                AllSchedules += super.convertTime(this.employeeList.get(i).getWorkSchedule().get(j))
                + "\n\t";
            }
            
        }
        
        return AllSchedules;
    }
    
    public String checkLate() {
        
        String check = "";
        for (int i = 0; i < this.employeeList.size(); i++){
            int punchTime = this.employeeList.get(i).getPunch();
            if (punchTime == -1) {//if the punchTime is initialized value
                check += "Employee ";
                check += this.employeeList.get(i).getName().toString();
                check += " did not arrive.\n";
            }
            
            else {
                
                for(int j = 0; j < this.employeeList.get(i).getWorkSchedule().size(); j++) {
                    int day = this.employeeList.get(i).getWorkSchedule().get(j)/100;
                    int punchday = punchTime/100;
                    if(day == punchday) {
                        if(punchTime == this.employeeList.get(i).getWorkSchedule().get(j)) {
                            check += "Employee ";
                            check += this.employeeList.get(i).getName().toString();
                            check += " arrived on time at ";
                            check += super.convertTime(this.employeeList.get(i).getWorkSchedule().get(j)) + "\n";
                        }
                        else if (punchTime < this.employeeList.get(i).getWorkSchedule().get(j)) {
                            check += "Employee ";
                            check += this.employeeList.get(i).getName().toString();
                            check += " arrived early at ";
                            check += super.convertTime(punchTime);
                            check += ". schedule time is at ";
                            check += super.convertTime(this.employeeList.get(i).getWorkSchedule().get(j)) + "\n";
                        }
                        else if (punchTime > this.employeeList.get(i).getWorkSchedule().get(j)) {
                            check += "Employee ";
                            check += this.employeeList.get(i).getName().toString();
                            check += " arrived late at ";
                            check += super.convertTime(punchTime);
                            check += ". schedule time is at ";
                            check += super.convertTime(this.employeeList.get(i).getWorkSchedule().get(j)) + "\n";
                        }
                        
                    }
                }
            }
        }
        return check;
    }
    
    
    public String checkOperationsCompleted() {
        
        String operations = "";
        
        for(i = 0; i < this.employeeList.size(); i++) {
            //System.out.println(this.employeeList.get(i).getName());
            operations += "Name: " + this.employeeList.get(i).getName().toString() + "\n\t";
            
            //System.out.println(this.employeeList.get(i).getToDoList().size());
            for(j = 0; j < this.employeeList.get(i).getTaskList().size(); j++)
            {
                operations += "task: "
                + this.employeeList.get(i).getTaskList().get(j).getName()
                + "\t\t";
                if (this.employeeList.get(i).getTaskList().get(j).getCompleted() == true) {
                    
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

