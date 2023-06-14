import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class BestClassEver extends JPanel {
	int viriya;
	
	public BestClassEver() {
		viriya = 42;
	}
	
	//OVERLOADING is when you have >1 method in a class with the same name
	//but different parameter types.
	public void drawSquare(Vertex v, int side, Graphics don) {
		don.setColor(Color.BLACK);
		don.drawRect(v.x,v.y,side,side);
	}
	
	/*public void drawSquare(int x, int y, int side, Graphics don, Color keti) {
		don.setColor(keti);
		don.drawRect(x,y,side,side);
	}*/
	
	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
		Vertex andy = new Vertex();
		andy.x = 20;
		andy.y = 40;
		drawSquare(andy, 90, g);
		//drawSquare(20,150, 20, g, new Color(100,255,200));
		Vertex tim = new Vertex(130,40);
		drawSquare(tim, 80, g);
		Vertex pam = new Vertex(andy);
		//int viriya = 150;		
		//drawSquare(viriya,160, 30, g, Color.BLUE);
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200,200);
		window.setContentPane(new BestClassEver());
		window.setVisible(true);
	}
	
}
