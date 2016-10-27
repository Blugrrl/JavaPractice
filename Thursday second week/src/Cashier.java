
public class Cashier {

	public static void main(String[] args) {
		makeChange(22.5,30.75);
		double returnedChange = makeChange(17.65,30.70);
		System.out.println("Your change is: " + returnedChange);

	}
	public static double makeChange(double itemCost, double moneyGiven) {
		double giveChange = moneyGiven - itemCost;
		return giveChange;
	}
}
