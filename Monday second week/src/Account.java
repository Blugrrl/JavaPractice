
public class Account {
	
	private int balance; //hiding them for security, internal data
	private String owner;
	private int accountNumber;
	
	private static int nAccounts = 0; // each object does not have this, its shared by all objects
	
	public Account(String name) { //the constructor, same name as class, initialises all fields with values
		owner = name; // will remember the name as owner
		balance = 0;
		nAccounts++;
		accountNumber = nAccounts; //this will happen every time we create a new account via Account x = new Account()
		
	}
}
