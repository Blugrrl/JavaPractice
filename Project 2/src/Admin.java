

public class Admin extends Employee {



	int age;

	double bonus;

	

	public Admin (String name, double Salary, String department, int idNumber, Gender gender) {  //constructor i subklassen //konstruktorn har alltid klassnamn. konstuktorn har aldrig returtyp, men det har alltid metoden

	super(name, Salary);    //call to constructor in superclass 


	}

	

	public double bonus() {             //method med returtyp double

	bonus = employeeBonusBase + age*30;

	return bonus; 



	}



}