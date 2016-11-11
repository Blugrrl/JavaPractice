import java.util.ArrayList;
import java.lang.Enum;

public class EmployeeMain { 
	
	
	public static void main(String[] args) { 

		ArrayList <Employee> myEmployees = new ArrayList <>();
		Admin a1 = new Admin ("Lars Jansson", 25000, "Administrator", 1964010111, MALE);
		Support s1 = new Support ("Sara Issacs", 22000, "Support", 1995020222, FEMALE);
		Development d1 = new Development ("Johann Strauss", 34000, "Development", 1985030333, MALE);
		Admin a2 = new Admin ("Anna Idunno", 25000, "Administrator", 1986040444, FEMALE);
		Support s2 = new Support ("John Doe", 22000, "Support", 1977050555, MALE);
		Development d2 = new Development ("Clara Croft", 35000, "Development", 1985030333, FEMALE);
		Admin a3 = new Admin ("Joakim Lilsson", 26000, "Administrator", 1964010111, MALE);
		Support s3 = new Support ("James Spader", 22000, "Support", 1995020222, MALE);
		Development d3 = new Development ("Alice Johansson", 30000, "Development", 1985030333, FEMALE);
		Admin a4 = new Admin ("Michael Berglund", 28000, "Administrator", 1964010111, MALE);
		Support s4 = new Support ("Isabelle Clarke", 22000, "Support", 1995020222, FEMALE);
		Development d4 = new Development ("Elsa Lind", 33000, "Development", 1985030333, FEMALE);
		Admin a5 = new Admin ("Karl Wallin", 21000, "Admin", 1966060666, MALE);
		Support s5 = new Support ("Lucas Jonsson", 23000, "Support", 1977070777, MALE);
		Development d5 = new Development("Ludvig Norin", 35000, "Development", 1976060767, MALE);
		Admin a6 = new Admin ("Stella Holm", 26000, "Admin", 1999090999, FEMALE);
		Support s6 = new Support ("Charlie Ek", 23000, "Support", 1985050858, MALE);
		Development d6 = new Development("Erik Lundgren", 32000, "Development", 1955050555, MALE);
		Support s7 = new Support ("Ella Berg", 21000, "Support", 1987070887, FEMALE);
		Development d7 = new Development("Oscar Blom", 38000, "Development", 1962060226, MALE);
		

		myEmployees.add(a1); myEmployees.add(s1); myEmployees.add(d1); myEmployees.add(a2); 
		myEmployees.add(s2); myEmployees.add(d2); myEmployees.add(a3); myEmployees.add(s3); 
		myEmployees.add(d3); myEmployees.add(a4); myEmployees.add(s4); myEmployees.add(d4); 
		myEmployees.add(a5); myEmployees.add(s5); myEmployees.add(d5); myEmployees.add(a6); 
		myEmployees.add(s6); myEmployees.add(d6); myEmployees.add(s7); myEmployees.add(d7); 
		
		
	
		double totalBonus = EmployeeMain.sumBonus(myEmployees); 

		System.out.println(totalBonus);

	}

		public static double sumBonus(ArrayList<Employee> emp){   
		double totalBonus = 0;  
		for (Employee currentEmployee : emp){ 
		totalBonus+=currentEmployee.bonus();  
		
			}

		return totalBonus;

		}
		
}



