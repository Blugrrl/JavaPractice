import java.util.Random;

public class Game {

    private int randomNumber;
    private int tries = 0;
    private int range;

    public Game(int range) {
        this.range = range;
        generateRandomNumber();
    }

    private void generateRandomNumber() {
        Random rand = new Random();
        this.randomNumber = rand.nextInt(range) + 1;
    }

    public boolean guess(int guess) {
        tries++;
        if (guess == randomNumber) {
        	if (tries > 1) {
        	    System.out.println("You got the number in " + tries + " tries.");            
        	} else {
        	    System.out.println("You got the number in " + tries + " try.");
        	}
        	return true;
        } else if (guess > randomNumber) {
            System.out.println("Too high try again");
            return false;
        } else if (guess < randomNumber) {
            System.out.println("Too low try again ");
            return false;
        }
        return false;

    }

    public void reset() {
        this.tries = 0;
        generateRandomNumber();

    }

}