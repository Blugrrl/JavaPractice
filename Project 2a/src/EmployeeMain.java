/*
 * INHERITANCE, EMPLOYEE
 * Main class
 * Lexicon Liljeholmen, Java4Women, 2016-11-14
 * Group 2, Nina, Hanna, Bruna 
 */


import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeMain { 
	static Scanner sc = new Scanner (System.in);
	static int choice = -1;
	static ArrayList<Employee> myEmployees = new ArrayList<Employee>();

	
	public static void main(String[] args) {

		seedEmployees(); //seed the ArrayList with Employees
		

		while (choice != 0) {		
			EmployeeMain.mainMenu();

			try {
				choice = sc.nextInt();
			}
			catch (Exception exception) {
				choice = -1;
			}

			if (choice == 1) {
//				EmployeeManagement.employeeMenu();			
			}
			else if (choice == 2) {
				EmployeeStatistics.employeeStatisticsMenu();
				choice = 0;
			}
			else if (choice == 0) {
				sc.close();
			}
			else {
				System.out.print("Illegal choice!\n\n");
				sc.nextLine(); //clear buffer
			}
		}
	}	



	/*******************************      METHODS      ***************************************************/

	private static void mainMenu() {
		System.out.println("--------------------------------------------------------");
		System.out.println("Welcome to our company");
		System.out.println("--------------------------------------------------------");
		System.out.println("1. Employee management");
		System.out.println("2. Employee statistics");
		System.out.println("0. Exit");
		System.out.println("Choose: ");
	}


	private static void seedEmployees() {
		Admin a1 = new Admin ("Lars Jansson", 25000, "Admin", 1964010111, Employee.Gender.MALE);
		Support s1 = new Support ("Sara Issacs", 22000, "Support", 1995020222, Employee.Gender.FEMALE);
		Development d1 = new Development ("Johann Strauss", 34000, "Development", 1985030333, Employee.Gender.MALE);
		Admin a2 = new Admin ("Anna Idunno", 25000, "Admin", 1986040444, Employee.Gender.FEMALE);
		Support s2 = new Support ("John Doe", 22000, "Support", 1977050555, Employee.Gender.MALE);
		Development d2 = new Development ("Clara Croft", 35000, "Development", 1985030333, Employee.Gender.FEMALE);
		Admin a3 = new Admin ("Joakim Lilsson", 26000, "Admin", 1964010111, Employee.Gender.MALE);
		Support s3 = new Support ("James Spader", 22000, "Support", 1995020222, Employee.Gender.MALE);
		Development d3 = new Development ("Alice Johansson", 30000, "Development", 1985030333, Employee.Gender.FEMALE);
		Admin a4 = new Admin ("Michael Berglund", 28000, "Admin", 1964010111, Employee.Gender.MALE);
		Support s4 = new Support ("Isabelle Clarke", 22000, "Support", 1995020222, Employee.Gender.FEMALE);
		Development d4 = new Development ("Elsa Lind", 33000, "Development", 1985030333, Employee.Gender.FEMALE);
		Admin a5 = new Admin ("Karl Wallin", 21000, "Admin", 1966060666, Employee.Gender.MALE);
		Support s5 = new Support ("Lucas Jonsson", 23000, "Support", 1977070777, Employee.Gender.MALE);
		Development d5 = new Development("Ludvig Norin", 35000, "Development", 1976060767, Employee.Gender.MALE);
		Admin a6 = new Admin ("Stella Holm", 26000, "Admin", 1999090999, Employee.Gender.FEMALE);
		Support s6 = new Support ("Charlie Ek", 23000, "Support", 1985050858, Employee.Gender.MALE);
		Development d6 = new Development("Erik Lundgren", 32000, "Development", 1955050555, Employee.Gender.MALE);
		Support s7 = new Support ("Ella Berg", 21000, "Support", 1987070887, Employee.Gender.FEMALE);
		Development d7 = new Development("Oscar Blom", 38000, "Development", 1962060226, Employee.Gender.MALE);


		myEmployees.add(a1); myEmployees.add(s1); myEmployees.add(d1); myEmployees.add(a2); 
		myEmployees.add(s2); myEmployees.add(d2); myEmployees.add(a3); myEmployees.add(s3); 
		myEmployees.add(d3); myEmployees.add(a4); myEmployees.add(s4); myEmployees.add(d4); 
		myEmployees.add(a5); myEmployees.add(s5); myEmployees.add(d5); myEmployees.add(a6); 
		myEmployees.add(s6); myEmployees.add(d6); myEmployees.add(s7); myEmployees.add(d7); 
	}
	
//	public ArrayList <Employee> getMyEmployees() {
//	    return myEmployees;
//	}







	/************************     Hannas kod  b�rjar h�r    *******************************************************************/
	public static double sumBonus(ArrayList<Employee> emp){    //metod f�r att summera bonus, tar parametern arraylist 
		double totalBonus = 0;   //den totala bonusen f�r alla anst�llda b�rjar fr�n noll, inte fr�n bonusbas 3000
		for (Employee currentEmployee : emp){   //i array emp g� igenom varje employee. enhanced for loop: du beh�ver inte veta l�ngd p� array. smidigt. denna loop anv�nds f�r att g� igenom hela arraylist, ist�llet f�r att manuellt plussa ihop allas bonusar ett och ett
			totalBonus+=currentEmployee.bonus();  // : total bonus=total bonus+ currentEmployee.bonus  //Ett s�tt att skriva   X+=5 :  X=X+5
		}
		return totalBonus;
	}
	/************************     slut p� Hannas kod       *******************************************************************/
}



