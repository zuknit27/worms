package org.worms.software;

import java.io.IOException;

import org.worms.hardware.*;
import org.worms.people.*;


public class Driver
{
    public static void main(String[] args) throws IOException
    {
        
        
        Department dept1 = new Department();
        
        Manager mang1 = new Manager();
        HREmployee hr1 = new HREmployee();
        Store store = new Store();
        SalesEmployee sales1 = new SalesEmployee();
        SalesEmployee sales2 = new SalesEmployee();
        SalesEmployee sales3 = new SalesEmployee();
        
        Product prod1 = new Product();
        Product prod2 = new Product();
        
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();
        
        store.setName("The Worm Store");
        
        
        //Set names
        dept1.setName("Worm Sales");
        
        //add department to store
        store.setDepartment(dept1);
        
        mang1.setName("Mike");
        hr1.setName("Henry");
        sales1.setName("Steve");
        sales2.setName("Jim");
        sales3.setName("Bill");
        
        prod1.setName("Earthworms");
        prod1.setInventory(1500);
        prod1.setPrice(.05);
        prod2.setName("fishing poles");
        prod2.setInventory(25);
        prod2.setPrice(25);
        
        //List tasks
        task1.setName("Make a sale.");
        task2.setName("Report to Mike.");
        task3.setName("Go to appointment.");
        
        //Set store name
        store.setName("I GOT WORMS");
        
        //Add to department
        mang1.setDepartment(dept1);
        
        //add manager to manager list of the store
       // store.setManagerList(mang1);
        
        
        hr1.setDepartment(dept1);
        
        //add hr employee to hr employee list of the store
       // store.setHREmployeeList(hr1);
        
        
        //add sales employee to sales employee list of the store
//        store.setSalesEmployee(sales1);
//        store.setSalesEmployee(sales2);
//        store.setSalesEmployee(sales3);
        
        
        //sales1.setDepartment(dept1);
        //sales2.setDepartment(dept1);
        //sales3.setDepartment(dept1);
        
        //System.out.println(dept1.getSalesEmployeeList().get(0).getName());
        //System.out.println(dept1.getSalesEmployeeList().get(1).getName());
        //System.out.println(dept1.getSalesEmployeeList().get(2).getName());
        //System.out.println(dept1.getSalesEmployeeList().get(3).getName());
        //System.out.println(dept1.getSalesEmployeeList().get(4).getName());
        
        //Add employees to employee lists
        hr1.hire(sales1, dept1, 100);
        hr1.hire(sales2, dept1, 100);
        hr1.hire(sales3, dept1, 100);
        
        mang1.setEmployeeList(sales1);
        mang1.setEmployeeList(sales2);
        mang1.setEmployeeList(sales3);
        //sales1.setManager(mang1);
        System.out.println("here");
        mang1.setStocks(prod1);
        System.out.println("HERE");
        mang1.setStocks(prod2);
        
        System.out.println("Manager " + sales3.getManager().getName());
        for(int i = 0; i < mang1.getEmployeeList().size(); i++) {
            
            System.out.println("Team Memeber "+ i + " "+ mang1.getEmployeeList().get(i).getName());
            
        }
        
        //Set manager for employees
        sales1.setManager(mang1);
        sales2.setManager(mang1);
        sales3.setManager(mang1);
        
        
        
        //Set positions
        sales1.setPosition("Cashier");
        sales2.setPosition("Greeter");
        sales3.setPosition("Cashier");
        
        //Set schedules
        sales1.setWorkSchedule(100);
        sales1.setWorkSchedule(200);
        sales1.setWorkSchedule(300);
        sales1.setWorkSchedule(400);
        sales1.setWorkSchedule(500);
        
        sales2.setWorkSchedule(124);
        sales2.setWorkSchedule(324);
        sales2.setWorkSchedule(524);
        
        sales3.setWorkSchedule(148);
        sales3.setWorkSchedule(248);
        sales3.setWorkSchedule(448);
        sales3.setWorkSchedule(548);
        
        //setting punch times for monday
        sales1.setPunch(101);
        sales2.setPunch(123);
        sales3.setPunch(148);
        
        //checking who is late
        
        System.out.println(mang1.checkLate());
        
        //Assign tasks
        sales1.addTask(task1);
        sales2.addTask(task2);
        sales3.addTask(task3);
        
        //Assign salaries
        mang1.setSalary(400);
        hr1.setSalary(300);
        sales1.setSalary(200);
        sales2.setSalary(200);
        sales3.setSalary(200);
        
        
        
        
        
        
        //Test 1: Department functions
        System.out.println("Test 1:");
        System.out.println("This department is named " + dept1.getName());
        System.out.println("Employees in this department: ");
        for(int i = 0; i < dept1.getSalesEmployeeList().size(); i++) {
            System.out.println("\t" + dept1.getSalesEmployeeList().get(i).getName());
        }
        
        //Test 2: Manager Team Schedule check
        System.out.println("\n\nTest 2:");
        System.out.print(mang1.checkTeamSchedule());
        
        
        //Test 3: Task assignment
        System.out.println("\n\nTest 3:");
        System.out.println(sales1.getName() + "'s task is " + sales1.getTaskList().get(0).getName());
        System.out.println(sales2.getName() + "'s task is " + sales2.getTaskList().get(0).getName());
        System.out.println(sales3.getName() + "'s task is " + sales3.getTaskList().get(0).getName());
        
        
        //Test 4: Salaries
        System.out.println("\n\nTest 4:");
        System.out.println(mang1.getName() + "'s salary is $" + mang1.getSalary());
        System.out.println(hr1.getName() + "'s salary is $" + hr1.getSalary());
        System.out.println(sales1.getName() + "'s salary is $" + sales1.getSalary());
        System.out.println(sales2.getName() + "'s salary is $" + sales2.getSalary());
        System.out.println(sales3.getName() + "'s salary is $" + sales3.getSalary() + "\n");
        
        sales1.setRaise(100);
        mang1.setRaise(50);
        hr1.setRaise(5);
        
        System.out.println(mang1.getName() + "'s salary is $" + mang1.getSalary());
        System.out.println(hr1.getName() + "'s salary is $" + hr1.getSalary());
        System.out.println(sales1.getName() + "'s salary is $" + sales1.getSalary());
        System.out.println(sales2.getName() + "'s salary is $" + sales2.getSalary());
        System.out.println(sales3.getName() + "'s salary is $" + sales3.getSalary());
        
        
        //Test 5: Check that task is removed
        System.out.println("\n\nTest 5:");
        //sales1.removeTask(task1);
        sales1.taskCompleted(task1, true);
        System.out.println(mang1.checkOperationsCompleted());
        
        //Test 6: Check appointment is made
        //        System.out.println("\n\nTest 6:");
        //        hr1.scheduleAppointment(sales3, 101);
        //        System.out.println(sales3.getName() + " has an appointment at " + sales3.getAppointmentSchedule().get(0));
        
        //Test 7: Check firing employee removes from lists
        System.out.println("\n\nTest 7:");
        hr1.fire(sales3, dept1);
        hr1.fire(mang1, dept1);
        hr1.hire(sales3, dept1, 100);
        sales3.setDepartment(dept1);
        System.out.println(mang1.getName() + " has been fired. Employees still in department: ");
        for(int i = 0; i < dept1.getSalesEmployeeList().size(); i++) {
            System.out.println(dept1.getSalesEmployeeList().get(i).getName() + "\n\t");
        }
        
        //Test 8: check inventory
        System.out.println("\n\nTest 8:");
        System.out.println(mang1.checkStocks());
        
        mang1.restockItem(1000, prod1);
        mang1.restockItem(35, prod2);
        
        System.out.println(mang1.checkStocks());
        
        mang1.raisePriceStock(.25, prod1);
        
        System.out.println(mang1.checkStocks());
        
        //Test 9: HR scheduling appointments
        hr1.scheduleAppointment(sales1, 600);
        hr1.scheduleAppointment(sales2, 372);
        hr1.scheduleAppointment(sales2, 100);
        for (int i = 0; i < hr1.getAppointments().size(); i++) {
            System.out.println(hr1.getAppointments().get(i));
        }
       
        System.out.println("the department size is " + store.getDepartmentList().size());
        //System.out.println(store.getDepartmentList().get(0).getHREmployeeList().size());
        WormsGUI newGUI;
        newGUI = new WormsGUI("I've Got Worms", store);
    }
}

