
public class Main {

	public static void main(String[] args) {
		
		String myName = "Bruna Labinjan";
		
		System.out.println(myName.startsWith("Bruna"));
		
		int spacePosition = myName.indexOf(" ");
		String myFirstName = myName.substring(0, spacePosition);
		System.out.println(myFirstName);

	}

}
