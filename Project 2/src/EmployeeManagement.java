
public class EmployeeManagement {

	public static void registerEmployee() {
		
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
		EmployeeMain.sc.nextLine();

		Gender gen = Gender.FEMALE;

		switch (gender) {
		case 1:
			gen = Gender.FEMALE;
			break;

		case 2:
			gen = Gender.MALE;
			break;
		}

		switch (dep) {
		case 1:
			EmployeeMain.myEmployees.add(new Development(name, sal, "Development", id, gen));
			break;
		case 2:
			EmployeeMain.myEmployees.add(new Admin(name, sal, "Admin", id, gen));
			break;
		case 3:
			EmployeeMain.myEmployees.add(new Support(name, sal, "Support", id, gen));
			break;
		default:
			System.out.println("doesnt work");
		}

		System.out.println("The employee named " + name + " is now registered");

		for (Employee e : EmployeeMain.myEmployees) {
			System.out.println(e.toString());
		}
		

	}

	public static void updateEmployee() { // choice: name, salary, department

		int staffNumber = -1;
		for (Employee e : EmployeeMain.myEmployees) {
			System.out.println(e.toString());
		}

			System.out.println("\nSelect which employee to update: ");

			staffNumber = EmployeeMain.sc.nextInt();

			if (staffNumber  != -1) {
				for (Employee e : EmployeeMain.myEmployees) {

					if (e.getStaffNumber() == staffNumber) {

						System.out.println("\nWhat do you want to update? 1:Name, 2:Salary. 3:Department: ");
						int x = EmployeeMain.sc.nextInt();
						EmployeeMain.sc.nextLine();

						switch (x) {
						case 1: {
							System.out.println("\nPlease enter a name");
							String name = EmployeeMain.sc.nextLine();
							e.setName(name);
							System.out.println("\nThe employee nr " + e.getStaffNumber() + " " + e.getName() + " is updated");
							
						break;
						}
						case 2: {
							System.out.println("Please enter salary");
							int salary = EmployeeMain.sc.nextInt();
							EmployeeMain.sc.nextLine();
							e.setSalary(salary);
							System.out.println("\nThe employee nr " + e.getStaffNumber() + " " + e.getName() + " is updated");
						break;
						}
						
						case 3: {
							System.out.println("Please enter a department, 1:Development, 2:Admin, 3:Support");
							String department = EmployeeMain.sc.nextLine();
							e.setDepartment(department);
							System.out.println("\nThe employee nr " + e.getStaffNumber() + " " + e.getName() + " is updated");
						break;
						}
						
						default:
							System.out.println("Incorrect input");
							staffNumber = 0;

						}

					}

				}

			} else {
				System.out.println("Illegal choice");
				EmployeeMain.sc.nextLine();
			}
	}

	public static void searchEmployee() { // choice: name, salary, department

		int searchEmployee = -1;
		String str = "";

		System.out.println("\nSelect search method for employee, 1:Name, 2:Staff number, 3:Department ");
		searchEmployee = EmployeeMain.sc.nextInt();

		// (Employee e : EmployeeMain.myEmployees)
		boolean found = false; //if found, dont print incorrect answer

		switch (searchEmployee) {
		case 1: {
			EmployeeMain.sc.nextLine(); // clear buffer
			System.out.println("\nPlease enter name");
			String name = EmployeeMain.sc.nextLine();
//			System.out.println("name: " + name);

			for (Employee e : EmployeeMain.myEmployees) {
				if (e.getName().substring(0, e.getName().indexOf(" ")).equals(name) || 
						(e.getName().substring((e.getName().indexOf(" ")+1), (e.getName().length())).equals(name))){
					
					
				//if (e.getName().substring(0, ).equals(name)) {
			//	if (e.getName().substring(0, e.getName().length()).equals(name)) {

					found = true;
					System.out.println("\nThe employee with name " + e.getName() + " has been found");
				}
			}
			break; 
		}

		case 2: {
			System.out.println("\nPlease enter staff number");
			int snumber = EmployeeMain.sc.nextInt();
			for (Employee e : EmployeeMain.myEmployees) {
				if (e.getStaffNumber() == snumber) {
					System.out.println("\nThe employee with staff number " + e.getStaffNumber() + " " + e.getName() + " has been found");
					found = true;
				}

			}
			break;
		}
		case 3: {
			System.out.println("\nPlease enter department, 1:Development, 2:Admin, 3:Support");
			int depname = EmployeeMain.sc.nextInt();
			if (depname == 1)
				str = "Development";
			if (depname == 2)
				str = "Admin";
			if (depname == 3)
				str = "Support";
			
			System.out.println("\n " + str + ":");
			for (Employee e : EmployeeMain.myEmployees) {
				if (e.getDepartment() == str) {
					System.out.println(e.toString());
					found = true;

				}
			}
			break;

		}

		}
		if (!found)
			System.out.println("Incorrect input, no such employee found");
	}
	
	
	public static void removeEmployee() {

		int staffNumber = -1;

		while (staffNumber != 0) {
			Employee removed = null;
			for (Employee e : EmployeeMain.myEmployees) {
				System.out.println(e.toString());
			}
			System.out.println("\nSelect which employee to remove (id nr): ");

			try {
				staffNumber = EmployeeMain.sc.nextInt();
			} catch (Exception exception) {
				staffNumber = -1;
			}

			if (staffNumber != -1) {
				int counter = 0;

				for (Employee e : EmployeeMain.myEmployees) {

					if (e.getStaffNumber() == staffNumber) {
						removed = e;

						System.out.println(
								"\nThe employee nr " + e.getStaffNumber() + " " + e.getName() + " has been removed");
						staffNumber = 0;
						break;
					} else {
						counter++;
					}
					if (counter == EmployeeMain.myEmployees.size()) {
						System.out.println("Staffnumber does not exist, please try again");
					}
				}
				formerEmployees(removed);
			} else {
				System.out.println("Illegal choice");
				EmployeeMain.sc.nextLine();
			}
		}
	}

	public static void employeeMenu() {

		int choice = -1; // choice kan inte vara 0, 0=exit, då kommer vi aldrig
		// in i loopen --> sätt denna till något annat

		while (choice != 0) {
			System.out.println("\n ***************************************");
			System.out.println(" **                                   ** ");
			System.out.println(" **    Employee Management Menu       ** ");
			System.out.println(" **                                   ** ");
			System.out.println(" *************************************** ");
			System.out.println("1. Register employee");
			System.out.println("2. Update employee");
			System.out.println("3. Search employee");
			System.out.println("4. Remove employee");
			System.out.println("5. Back to main menu");
			System.out.println("0. Exit");
			System.out.println("Choose: ");

			try {
				choice = EmployeeMain.sc.nextInt();
			} catch (Exception exception) {
				choice = -1;
			}

			if (choice == 1) {
				EmployeeMain.sc.nextLine();
				registerEmployee();
			} else if (choice == 2) {
				updateEmployee();
			} else if (choice == 3) {
				searchEmployee();
			} else if (choice == 4) {
				removeEmployee();
			} else if (choice == 5) {
				EmployeeMain.main(null);
			} else if (choice == 0) {
				System.out.println("\nGoodbye! Thank you for using our software");
				break;
			} else {
				System.out.print("Illegal choice!\n\n");
				EmployeeMain.sc.nextLine(); // clear buffer
			}

		}

	}

	public static void formerEmployees(Employee removed) {

		EmployeeMain.formerEmployees.add(removed);
		EmployeeMain.myEmployees.remove(removed);

	}

}
