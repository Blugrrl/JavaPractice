

public class Development extends Employee{



	int numberOfapplications;

	

	public Development (String name, double Salary, String department, int idNumber, Gender gender) {  //constructor i subklassen //konstruktorn har alltid klassnamn. konstuktorn har aldrig returtyp, men det har alltid metoden

	super(name, Salary);                              //call to constructor in superclass 



	}

	

	public double bonus() {             //method med returtyp double 

	double bonus = employeeBonusBase * numberOfapplications; 

	return bonus; 

	

	}

	

	public void anOtherApplication() {   //method med returtyp void

	numberOfapplications +=1;

	}



}