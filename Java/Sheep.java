import java.awt.*;

public class Sheep {

	int weight;
	int height;
	Color woolColor;
	char gender;
	int age;
	Vertex position;
	
	public Sheep() {
		weight = 27;
		height = 60;
		woolColor = Color.WHITE;
		gender = 'u';
		age = 1;
		position = new Vertex();
	}
	
	public void makeNoise() {
		System.out.println("BAAAAA!!!!");
	}
	
	public void sleep() {
		System.out.println("ZZZZzzzzz....");
	}
	
	public void eat() {
		weight++;
	}
	
	public void move(int dx, int dy) {
		position.translate(dx,dy);
	}
	
	
	public void draw(Graphics g) {
		g.setColor(woolColor);		
		g.fillOval(position.x+75,position.y+200,225,100);
		g.fillOval(position.x+50,position.y+150,75,75);	
		g.fillRect(position.x+100,position.y+250,25,100);
		g.fillRect(position.x+150,position.y+250,25,100);
		g.fillRect(position.x+200,position.y+250,25,100);
		g.fillRect(position.x+250,position.y+250,25,100);	
	}

}