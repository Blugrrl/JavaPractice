
public class RandomNumber {

	public static void main(String[] args) {
		
		double randomNumber = Math.random(); //Math.random is a method that returns a random number from 0.1 to 0.9
		randomNumber = randomNumber * 10; //we multiply it here 
		int randomInt = (int)randomNumber + 1; //we create an int, that will store the int value of our randomNumber, so we wont have 7.6 or 8.9 etc.
		System.out.println(randomInt); //print out the int we got

	}

}
