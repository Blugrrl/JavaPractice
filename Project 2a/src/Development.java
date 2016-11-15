

public class Development extends Employee{



	int numberOfapplications;

	

	public Development (String name, double salary, String department, int idNumber, Gender gender) {  
	super(name, salary, idNumber, department, gender); 



	}

	

	public double bonus() {
	double bonus = employeeBonusBase * numberOfapplications; 
	return bonus; 

	

	}

	

	public void anOtherApplication() {  

	numberOfapplications +=1;

	}



}