
public class T1 {

	public static void main(String[] args) {
		
		double d = 4.56;
		int i = (int) d;
		
		String s = "123";
		int n = Integer.parseInt(s);  //Only way of converting String to int, doesnt work with brackets like (int) d
		
		System.out.println(i + n);
		//int n = (int) s;  Doesnt work

	}

}
