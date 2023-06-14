import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Valentines extends JPanel {
	
	public Valentines() {
		//Your custom initialization code here
	}
	
	public void drawSquare(int x,int y,int side, Graphics g){
		g.setColor(Color.BLACK);
		g.drawRect(x,y,side,side);
	}

	public void drawColorfulSquare(int x,int y,int side, Graphics g,Color keti){
		g.setColor(keti);
		g.drawRect(x,y,side,side);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		drawSquare(20,40,90,g);
		drawSquare(112,40,90,g);
		drawColorfulSquare(20,130,90,g,Color.RED);
		drawColorfulSquare(112,130,90,g,Color.BLUE);
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200,200);
		window.setContentPane(new Valentines());
		window.setVisible(true);
	}

}
