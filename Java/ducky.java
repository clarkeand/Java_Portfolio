import javax.swing.*;
import java.awt.Graphics;

public class ducky extends JPanel {
	
	ImageIcon duck;
	
	public ducky() {
		duck = new ImageIcon("duck.png");
	}

	@Override
	public void paintComponent(Graphics g) {
		var x = 0;
		var y = 0;
		var w = getWidth();
		/*for(var x = 0; x<w; x+=60){
			duck.paintIcon(null,g,x,y);
		}*/
		for (int q=0;q<5;q++){
			x=0;
			for(int i=0;i<2;i+=1){
			duck.paintIcon(null,g,x,y);
			x+=60;
		}
		y+= 100;
		}
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200,200);
window.setContentPane(new ducky());
		window.setVisible(true);
	}
}
