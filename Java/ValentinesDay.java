import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class ValentinesDay extends JPanel {
	
	public ValentinesDay() {
		//Your custom initialization code here
		double marco = getTriangleArea(20,40);
		System.out.println("Keti's triangle has an area of " + marco);
		double tim = getSphereVolume(35);
		System.out.println("Tim's imaginary sphere has a volume of " + tim);
		double ofa = countTheIs("Mississippi");
		System.out.println("Ofa found " +ofa+ " i's in that string.");
	}
	
	//OVERLOADING is when you have >1 method in a class with the same name
	//but different parameter types.
	public void drawSquare(int x, int y, int side, Graphics don) {
		don.setColor(Color.BLACK);
		don.drawRect(x,y,side,side);
	}
	
	public void drawSquare(int x, int y, int side, Graphics don, Color keti) {
		don.setColor(keti);
		don.drawRect(x,y,side,side);
	}
	
	public double getTriangleArea(double base, double height) {
		double area = 0.5 * base * height;
		return area;
	}
	
	public double getSphereVolume(double radius) {
		double area = (4.0/3.0) * Math.PI * radius * radius * radius;
		return area;
	}
	
	
	public int countTheIs(String jade) {
		int count = 0;
		for (int i=0; i<jade.length(); i++){
			char letter = jade.charAt(i);
			if (letter == 'i'){
				count++;
			}
		}
	}
	
	//
	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
		drawSquare(20,40, 90, g);
		drawSquare(20,150, 20, g, new Color(100,255,200));
		drawSquare(130,40, 80, g);
		int viriya = 150;		
		drawSquare(viriya,160, 30, g, Color.BLUE);
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200,200);
		window.setContentPane(new ValentinesDay());
		window.setVisible(true);
	}
	
	
}
