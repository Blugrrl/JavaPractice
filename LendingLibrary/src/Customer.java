
public class Customer {

	private String title;
	private String firstName;
	private String surname;
	
	public String getFirstName() {
		
		return firstName;
		
	}
	
	public String getSurname() {
		return surname;
		
	}

	public void setName(String title, String firstName, String surname) {
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
	}
	
	public String getMailingName() {
		String mailingName;
		mailingName = title + "." + " " + firstName.substring(0, 1) + "." + " " + surname;
		return mailingName;
			
		}
	public Customer(String title, String firstName, String surname) {
		System.out.println("New customer created");
		setName(title,firstName,surname);
		
	}
	}
	
