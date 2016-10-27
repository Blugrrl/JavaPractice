
public class Exercise2 {
	
	int number1; //these are class variables, dont have to have values,will compile
	double number2;
	String aWord;
	float number3;
	boolean c;

	public static void main(String[] args) {
		
//		int number1;       // LOCAL variables, will give error if not initialised!
//		double number2;		// declared inside a method
//		String aWord;		//WILL NOT COMPILE unless they have value
//		float number3;
//		boolean c;
		
		Exercise2 b = new Exercise2();
//		Exercise2Class2 a = new Exercise2Class2();
		System.out.println(b.number1);
		System.out.println(b.number2);
		System.out.println(b.number3);
		System.out.println(b.aWord);
		System.out.println(b.c);
	}

}
