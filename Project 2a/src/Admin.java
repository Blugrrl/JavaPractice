

public class Admin extends Employee {

	int age;
	double bonus;


	public Admin (int employeeNumber, String name, double salary, String department, int idNumber, Gender gender) {  
	super(name, salary, idNumber, department, gender);

	}

	
	public double bonus() {
	bonus = employeeBonusBase + age*30;
	return bonus; 



	}

}