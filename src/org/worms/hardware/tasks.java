

public class tasks {
	
	private boolean completed;
	private String name;
	private ArrayList<Employee> employeeList;
	
	public tasks () {
		
		completed = false;
		name = "unknown";
		employeeList = new ArrayList<Employee>();
				
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
	
	public ArrayList<Employee> getEmployeeList(){
		return this.employeeList;
	}
	
	public void setEmployeeList(Employee someE) {
		
		this.employeeList.add(someE);
		
	}

}
