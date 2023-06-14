
public class Zoo {

	public static void main(String[] args) {
		new Zoo();
	}
	
	public Zoo() {
		var a1 = new Cat();
		var a2 = new Dog();
		var a3 = new Monkey();
		var a4 = new Goat();
		feed(a3);
		feed(a4);
		feed(a2);
		feed(a1);
	}
	
	public void feed(Animal a) {
		a.eat();
		a.makeNoise();
	}


}
