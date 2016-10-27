
public class Methods {
	
	public static void main(String[] args) {
		sayHello(); //Calls upon method without us sending something 
		sayHelloTo("Ulf"); // thing you send, is a value - which is a parameter
		
		int dice = throwDice(); // returns int from throwDice method
		System.out.println(dice); // different way : System.out.println(throwDice());
		
		int square19 = square(19);
		System.out.println(square19);
		
	}


	public static void sayHello() {
	System.out.println("Hello!");
	
	}

	public static void sayHelloTo(String s) {
	System.out.println("Hello " + s + "!");
	}

	public static int throwDice() {
		int number = (int) (Math.random() * 6 + 1);
		return number;
	}
	
	public static int square(int n) {
		return n * n;
	}
}