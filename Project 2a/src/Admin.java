

public class Admin extends Employee {

	int employeeBonusBase = 3000;
	double bonus;


	public Admin (String name, double salary, String department, int idNumber, Gender gender) {  
	super(name, salary, idNumber, department, gender);

	}

	
	public double bonus() {
	bonus = employeeBonusBase + getAge()*30;
	return bonus; 
	}
	
	

}