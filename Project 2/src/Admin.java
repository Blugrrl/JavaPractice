

public class Admin extends Employee {

	int age;
	double bonus;

	

	public Admin (String name, double salary, String department, int idNumber, Gender gender) {  
	super(name, salary, idNumber, department, gender);    //call to constructor in superclass 

	}

	
	public double bonus() {             //method med returtyp double

	bonus = employeeBonusBase + age*30;

	return bonus; 



	}



}