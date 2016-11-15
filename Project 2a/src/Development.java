

public class Development extends Employee{
	

	public Development (String name, double salary, String department, int idNumber, Gender gender) {  
	super(name, salary, idNumber, department, gender); 

	}


	public double bonus() {
	double bonus = employeeBonusBase * getAge();
	return bonus; 

	

	}

}