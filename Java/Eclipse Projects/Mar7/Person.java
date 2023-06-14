
public class Person {

	  private int age;
	  private String name;
	  private Person spouse;
	  
	  public Person() {
		  name = "Untel";
		  age = 20;
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
		  System.out.println("My name is " +name);
		  System.out.println("I am " + age + " years old.");
		  if (spouse == null) {
			  System.out.println("And I am single and ready to mingle. ");
		  } else {
			  System.out.println("I am married to " + spouse.name + ".");
		  }
	  }
	  
	  public void setSpouse(Person p) {
		  spouse = p;
		  p.spouse = this;
	  }
}

