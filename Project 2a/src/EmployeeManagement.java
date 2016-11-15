import java.util.Scanner;



public class EmployeeManagement {

	public static void RegisterEmployee() {

		System.out.println("Enter name");
		String name = EmployeeMain.sc.nextLine(); // empty cash									 
		System.out.println("Enter salary");
		double sal = EmployeeMain.sc.nextDouble(); // returns the value to sal 
		System.out.println("Enter id number (YYYYMMDDNN)");
		int id = EmployeeMain.sc.nextInt();

		System.out.println("Enter department, 1:Development, 2:Admin, 3:Support");
		int dep = EmployeeMain.sc.nextInt();

		System.out.println("Enter gender: 1:Female, 2:Male");
		int gender = EmployeeMain.sc.nextInt();

		Gender gen = Gender.FEMALE;

		switch (gender) {
		case 1:
			gen = Gender.FEMALE;

		case 2:
			gen = Gender.MALE;

		}


		switch (dep) {
		case 1:   
			EmployeeMain.myEmployees.add (new Development(name, sal, "Developer", id, gen));
			break;
		case 2:	  
			EmployeeMain.myEmployees.add (new Admin(name, sal, "Admin", id, gen));
			break;
		case 3:	  
			EmployeeMain.myEmployees.add (new Support(name, sal, "Support", id, gen));
			break;
		default: 

		}



		System.out.println("The employee named " + name +" is now registered");

				for (Employee e : EmployeeMain.myEmployees) {
				//System.out.println(e.getStaffNumber() + " " + e.getName());
				System.out.println(e.toString());
				}


	}

	public static void UpdateEmployee() {

	}

	public static void RemoveEmployee() {

		int staffNumber = -1;

		while (staffNumber != 0) {
			Employee bardia = null;
			for (Employee e : EmployeeMain.myEmployees) {
				System.out.println(e.toString());
			}
			System.out.println("Select who to remove (id nr): ");

			try {
				staffNumber = EmployeeMain.sc.nextInt();
			}
			catch (Exception exception) {
				staffNumber = -1;
			}

			if (staffNumber != -1) {
				int counter = 0;
				
				for (Employee e : EmployeeMain.myEmployees) {
					//om rätt idNumber
					if (e.getStaffNumber() == staffNumber) {
					bardia = e;
						
						//	formerEmployees(counter);
						System.out.println("idNumber: " + staffNumber + " is removed");
						staffNumber = 0;
						break;
					}
					//räkna upp antal loopar, kollar om inget personnummer stämmer
					else {
						counter++;
					}
					//om idNumber doesn't exist
					if (counter == EmployeeMain.myEmployees.size()) {
						System.out.println("staffNumber doesn't exist");
					}
				}
				formerEmployees(bardia);
			}
			else {
				System.out.println("Illegal choice");
				EmployeeMain.sc.nextLine(); //clear buffer
			}
		}
	}	


	public static void employeeMenu() {

		int choice = -1; // choice kan inte vara 0, 0=exit, då kommer vi aldrig
		// in i loopen --> sätt denna till något annat

		while (choice != 0) {
			System.out.println("--------------------------------------------------------");
			System.out.println("Welcome to employee management");
			System.out.println("--------------------------------------------------------");
			System.out.println("1. Register employee");
			System.out.println("2. Update employee");
			System.out.println("3. Remove employee");
			System.out.println("0. Exit");
			System.out.println("Choose: ");

			try {
				choice = EmployeeMain.sc.nextInt();
			} catch (Exception exception) {
				choice = -1;
			}

			if (choice == 1) {
				EmployeeMain.sc.nextLine();
				RegisterEmployee();
			} else if (choice == 2) {
				UpdateEmployee();
			}

			else if (choice == 3) {
				RemoveEmployee();

			} else {
				System.out.print("Illegal choice!\n\n");
				EmployeeMain.sc.nextLine(); // clear buffer
			}

		}

	}
	
	public static void formerEmployees(Employee bardia) {
		
	     EmployeeMain.formerEmployees.add(bardia);

			//if (EmployeeMain.myEmployees.contains()) EmployeeMain.formerEmployees.add();
		     EmployeeMain.myEmployees.remove(bardia);
		     System.out.println(EmployeeMain.formerEmployees);

	}
	
}
