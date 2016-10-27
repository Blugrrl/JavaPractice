
public class Comparing2 {

	public static void main(String[] args) {
		
		String myName = "Bruna Labinjan";
		String yourName = "Rok Tomelj";
		
		String myFirstName = myName.substring(0, 5);
		String yourFirstName = yourName.substring(0, 3);

		System.out.println(myFirstName);
		System.out.println(yourFirstName);
		
		if (myFirstName.equals(yourFirstName)) {
			System.out.println("We have the same first name.");
		}
		else 
		{
			System.out.println("We have a different first name");
		}
		
	}

}