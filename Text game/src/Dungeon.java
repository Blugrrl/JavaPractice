import java.util.Random;
import java.util.Scanner;

public class Dungeon {

	public static void main(String[] args) {
		
		// System objects 
		
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		// Game variables 
		
		String [] enemies = {"Troll", "Zombie", "Skeleton", "Dragon"};
		int maxEnemyHealth = 75; 
		int enemyAttackDamage = 25;
		
		// Player variables
		
		int health = 100;
		int attackDamage = 35;
		int numHealthPotions = 3;
		int healthPotionHeal = 30;
		int healthPotionDropChance = 35; // percent 
		
		
		boolean running = true;
		
		System.out.println("Welcome to the dungeon");
		
		GAME:              //name of the while loop
		while(running) {
			System.out.println("------------------------------------------------------");
			
			int enemyHealth = rand.nextInt(maxEnemyHealth);
			String enemy = enemies[rand.nextInt(enemies.length)];
			System.out.println("\t# " + enemy + " has appeared! #\n");
			
			while (enemyHealth > 0) {
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				
			}
			
			
		}
		
	}

}
