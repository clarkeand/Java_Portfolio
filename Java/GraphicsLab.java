import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class GraphicsLab extends JPanel {
	
	//Call the  pyramids and Point
	Pyramid yay;
	Pyramid yay2;
	Point position;
	
	public GraphicsLab() {
		//Call the constructors for the pyramids
		yay = new Pyramid(100,350);
		position = new Point(200,375);
		yay2 = new Pyramid(position);
	}

	/* The "2Override" note says that we are intentionally replacing an existing method with 	our own version. */
	@Override
	public void paintComponent(Graphics g) {
		var dy = 50; 
		var w = getWidth();
		var h = getHeight();
		// Set Background color
		g.setColor(new Color(79,192,131));
		g.fillRect(0,0,w,h);
		//Make a sunset sky
		g.setColor(new Color(255,51,51));
		g.fillRect(0,0,w,200);
		g.setColor(Color.YELLOW);
		g.fillOval(50,125,100,100);
		g.setColor(new Color(79,192,131));
		g.fillRect(0,200,153,50);
		//Make CLouds
		g.setColor(Color.WHITE);
		g.fillOval(350,35,70,35);
		g.fillOval(360,25,70,35);
		g.fillOval(385,45,70,35);
		g.fillOval(350-50,35+20,70,35);
		g.fillOval(360-50,25+20,70,35);
		g.fillOval(385-50,45+20,70,35);
		g.fillOval(100,35,70,35);
		g.fillOval(110,25,70,35);
		g.fillOval(135,45,70,35);
		g.fillOval(400,155,70,35);
		g.fillOval(410,145,70,35);
		g.fillOval(435,150,70,35);
		
		//Draw the 1st pyramid
		yay.draw(g);
		
		//Draw the second pyramid with a different color
		yay2.setBrickColor(Color.RED);
		yay2.setStairColor(Color.BLUE);
		yay2.draw(g);
		
		//Make Shrubbery
		g.setColor(Color.GREEN);
		g.fillOval(80,375,75,50);
		g.fillOval(90,365,75,50);
		g.fillOval(100,375,82,50);
		g.fillOval(80+290,375,75,50);
		g.fillOval(90+290,350,75,50);
		g.fillOval(100+290,375,94,50);
		// Make Sign
		g.setColor(new Color(198,140,83));
		g.fillRect(345,425,150,40);
		g.setColor(Color.BLACK);
		g.drawString("Clarke's Pyramid",370,450);
		
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Mayan Ruins");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500,500);
		window.setContentPane(new GraphicsLab());
		window.setVisible(true);
	}
}