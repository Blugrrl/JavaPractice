

public class EmployeeStatistics extends Employee {

	
	public EmployeeStatistics(String name, double salary, int idNumber, String department, Gender gender) {
		super(name, salary, idNumber, department, gender);
	}
	
	private static void employeeStatisticMenu() {
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
		
		}

	
	@Override
	public double bonus() {
		return 0;
	}
	
	
	
	public void averageSalary() {
		int totalSalary = 0;
		for (Employee e: EmployeeMain.myEmployees) {
			totalSalary += e.getSalary();
		}
		System.out.println("The average salary is: " + totalSalary/EmployeeMain.myEmployees.size());
	}
	
	
	public void highestSalary() {
		double highestSalary = 0;
		for (Employee e: EmployeeMain.myEmployees) {
			if(highestSalary < e.getSalary()) {
				
			}
		}
	}
	
	public void lowestSalary() {
		double lowestSalary = 0;
		for (Employee e : EmployeeMain.myEmployees) {
			if(lowestSalary > e.getSalary()) {
				
			}
		}
	}
	
	
	public void womenPercentage() {
		int womenCount = 0;
		for(Employee e: EmployeeMain.myEmployees) {
			if (e.equals(gender.FEMALE)) {
				womenCount++;
			}
			System.out.println("The % of women in the company is: " + 100.00 * womenCount/EmployeeMain.myEmployees.size() + "%");
		}
	}

}
