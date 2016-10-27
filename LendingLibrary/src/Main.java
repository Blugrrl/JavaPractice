
public class Main {

	public static void main(String[] args) {
		
		String myName = getMyName();
		displayMyName(getFirstName(myName));
		displayMyName(getSurname(myName));

	}
	
	public static String getMyName() {
		return "Jack Sparrow";
	}

	public static void displayMyName(String myName) {
		System.out.println(myName);
	}
	
	public static String getFirstName(String fullName) {
		int spacePosition = fullName.indexOf(" ");
		return fullName.substring(0, spacePosition);
		
		
	}
	public static String getSurname(String fullName) {
		int spacePosition = fullName.indexOf(" ");
		return fullName.substring(spacePosition+1);
	}
}
