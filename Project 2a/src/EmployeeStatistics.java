
public class EmployeeStatistics extends Employee {
	
	public EmployeeStatistics(String name, double salary, int idNumber, String department, Gender gender) {
		super(name, salary, idNumber, department, gender);
		this.gender = gender;
	}
	
	@Override
	public double bonus() {
		return 0;
	}
	
	public void femaleCount() {
		int femaleCount = 0;
		for(Employee e : myEmployees) {
			if (e.gender.FEMALE) {
				femaleCount++;
			}
			System.out.println("The % of women in the company is: " + 100.00 * femaleCount/myEmployees.size());
		}
	}

}
