public abstract class Employee {  
	
	private String name;
	private double salary;
	protected final double employeeBonusBase; 
	abstract public double bonus(); 
	private static Gender gender; 
	

	public Employee (String a, double c) {
	employeeBonusBase = 3000;  
	name = a;
	salary = c;
	}

	

	public String getName(){ 
		return name;

	}


	public void setSalary(double salary){ 
	this.salary=salary;
	
	}


	public double getSalary() {  
	return salary;

	}
	
	public static enum Gender {
		FEMALE,
		MALE;
	}
	

}