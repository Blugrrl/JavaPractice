import java.util.Scanner;

public class EmployeeStatistics extends Employee {

	static Scanner sc = new Scanner(System.in);
	
	public EmployeeStatistics(String name, double salary, int idNumber, String department, Gender gender) {
		super(name, salary, idNumber, department, gender);
	}
	
	public static void employeeStatisticsMenu() {
		System.out.println("\nChoose from Menu");
		System.out.println("------------------------------------------------------");
		System.out.println("1. Average salary in company");
		System.out.println("2. Highest salary in company");
		System.out.println("3. Lowest salary in company");
		System.out.println("4. Total bonus in company");
		System.out.println("5. Percentage of women in company");
//		System.out.println("6. Män i procent i de olika arbetsrollerna");
		System.out.println("7. Return to main menu");
		System.out.println("0. Exit");
		System.out.println("Choose: ");
		
		int x = sc.nextInt();
		
		switch (x) {
		case 1: averageSalary();
			break;
		case 2: highestSalary();
			break;
		case 3: lowestSalary();
			break;
		case 4: System.out.println("There is no bonus");
			break;
		case 5: womenPercentage();
			break;
		case 6:
			break;
		case 7:
			break;
		case 0:
			break;
		default: System.out.println("Sorry, wrong input");
			}
		
		}

	
	@Override
	public double bonus() {
		return 0;
	}
	
	
	
	public static void averageSalary() {
		int totalSalary = 0;
		for (Employee e: EmployeeMain.myEmployees) {
			totalSalary += e.getSalary();
		}
		System.out.println("The average salary is: " + totalSalary/EmployeeMain.myEmployees.size());
	}
	
	
	public static void highestSalary() {
		double highestSalary = 0;
		for (Employee e: EmployeeMain.myEmployees) {
			if(e.getSalary() > highestSalary) {
				highestSalary = e.getSalary();
			}
		}
		System.out.println("The highest salary is: " + highestSalary);
	}
	
	public static void lowestSalary() {
		double lowestSalary = 25000;
		for (Employee e : EmployeeMain.myEmployees) {
			if(lowestSalary > e.getSalary()) {
				lowestSalary = e.getSalary();
			}
		}
		System.out.println("The lowest salary is: " + lowestSalary);
	}
	
	
	public static void womenPercentage() {
		int womenCount = 0;
		for(Employee e: EmployeeMain.myEmployees) {
			if (e.gender == Gender.FEMALE) {
				womenCount++;
			}
		}
		System.out.println("The % of women in the company is: " + 100.00 * womenCount/EmployeeMain.myEmployees.size() + "%");
	}

}
