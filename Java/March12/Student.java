public class Student extends Person{
	
	private double gpa;
	//private ArrayList<String> courses;
	
	//This floating block of code is called an initialization block. The compiler automatically
	//Inserts all code in the initialization block in EVERY constructor. 
	
	{
		gpa = 4.0;
		/*courses = new ArrayList<>();
		courses.add("CIS 202");
		courses.add("CIS 203");
		courses.add("IS 350");*/
	}
	
	public Student() {
		super();
	}
	
	public Student(String n) {
		super(n);
	}
	
	public Student(String n, int a) {
		super(n,a);
	}
	
	@Override
	public void talk() {
		super.talk();
		System.out.println("And my GPA is " + gpa + ".");
	}
	
}