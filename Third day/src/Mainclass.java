class Person {
	private String name;
	
	public Person() {
	}
	
	public Person(String name) {
		this.name = name;
	}
	public void writeName() {
		System.out.println("My name is " + name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class Mainclass {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Person person = new Person("Bruna");
		String name = person.getName();
		name = name + " Labinjan";
		person.setName(name);
		person.writeName();
		
	}

}
