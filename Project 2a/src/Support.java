

public class Support extends Employee {



int numbersOfServerCrasches=0;



	public Support(String name, double salary, String department, int idNumber, Gender gender) { 

	super(name, salary, idNumber, department, gender);

	}

	

	public double bonus(){ 

		double bonus = employeeBonusBase-numbersOfServerCrasches;
		return bonus;           

	}



    public void anotherServerCrash(){ 

	numbersOfServerCrasches=+1;

}

	

}