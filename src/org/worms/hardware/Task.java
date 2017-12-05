package org.worms.hardware;
//import java.util.ArrayList;

//import org.worms.people.Employee;


public class Task {
    
    private boolean completed;
    private String name;
    //private ArrayList<Employee> employeeList;
    
    public Task () {
        
        completed = false;
        name = "unknown";
        //employeeList = new ArrayList<Employee>();
        
    }
    
    public boolean getCompleted() {
        return this.completed;
    }
    
    public void setCompleted(boolean someB) {
        this.completed = someB;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName (String someName) {
        this.name = someName;
    }
    
//    public ArrayList<Employee> getEmployeeList(){
//        return this.employeeList;
//    }
//    
//    public void setEmployeeList(Employee someE) {
//        
//        this.employeeList.add(someE);
//        
//    }
    
}

