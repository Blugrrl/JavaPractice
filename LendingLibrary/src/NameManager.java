
public class NameManager {

	String myName;
	
	public String getFirstName() {
		int spacePosition = myName.indexOf(" ");
		return myName.substring(0, spacePosition);
		
		
	}
	public String getSurname() {
		int spacePosition = myName.indexOf(" ");
		return myName.substring(spacePosition+1);
	}
	
	public void setName(String newName) {
		myName = newName;
		
	}
}
