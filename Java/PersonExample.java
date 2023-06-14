
public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("Linda");
		p1.setHome("Taiwan");
		Person p2 = new Person("Kenny");
		p2.setHome("Taiwan");
		p1.setSpouse(p2);
		Person p3 = new Person("Leti");
		p3.setHome("Kahuku");
		p1.talk();
		p2.talk();
		p3.talk();
		Student p4 = new Student("Rex");
		p4.setHome("Japan");
		p4.talk();
	}

}
