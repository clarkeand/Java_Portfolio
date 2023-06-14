
public class Person {

	private int age;
	private String name;
	private Person spouse;
	private String homeland;
	
	public Person() {
		name = "Untel";
		age = 20;
		spouse = null;
		homeland = "Tonga";
	}
	
	public Person(String n) {
		this();
		name = n;
	}	
	
	public Person(String n, int a) {
		this(n);
		age = a;
	}
	
	public void talk() {
		System.out.println("My name is " + name + ".");
		System.out.println("And I am " + age + " years old.");
		System.out.println("And I am from " + homeland + ".");
		if (spouse == null) {
			System.out.println("And I am still looking for that special someone.");
		} else {
			System.out.println("And I am married to " + spouse.name + ".");
		}
	}
	
	public void setSpouse(Person p) {
		this.spouse = p;
		p.spouse = this;
	}
	
	public void setHome(String h) {
		this.homeland = h;
	}
}
