
public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("Linda");
		Person p2 = new Person("Kenny");
		p1.setSpouse(p2);
		p2.setSpouse(p1);
		Person p3 = new Person("Leti");
		p1.talk();
		p2.talk();
		p3.talk();
	}
}
