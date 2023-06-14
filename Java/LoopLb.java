import javax.swing.*;
import java.awt.*;

public class LoopLb extends JPanel {
	
	int numStripes;
	int starR;
	int starC;
	
	public LoopLb() {
		//Collect the user input for number of stripes, rows of stars, and columns of stars. 
		String stripes = JOptionPane.showInputDialog("How many stripes would you like in your flag?");
		numStripes = Integer.parseInt(stripes);
		String starRows = JOptionPane.showInputDialog("How many rows of stars would you like in your flag?");
		starR = Integer.parseInt(starRows);
		String starColumns = JOptionPane.showInputDialog("How many columns of stars would you like in your flag?");
		starC = Integer.parseInt(starColumns);

	}

	@Override
	public void paintComponent(Graphics g) {
		//create X and Y variables for calculations with stars. 
		int x = 0;
		int y = 0;
		//Get Height and Width of the window
		var w = getWidth();
		var h = getHeight();
		//Calculate the Stripe Width and Height
		var stripeWidth = w;
		var stripeHeight = h/numStripes;
		//Calculate the Height and Width of the blue box. 
		var blueBoxW = (w*2)/5;
		var blueBoxH = 7*stripeHeight;
		//Create new variable needed to space the stripes apart. 
		var strpH=0;
		//Set Background to White
		g.setColor(Color.WHITE);
		g.fillRect(0,0,blueBoxW,blueBoxH);
		//Draw the stripes in. 
		for (var i=0;i<=numStripes;i+=1){
			g.setColor(Color.RED);
			g.fillRect(0,strpH,stripeWidth,stripeHeight);
			strpH += (2*stripeHeight);
		}	
		//Make the Blue Rectangle where stars will end up going. 
		g.setColor(Color.BLUE);
		g.fillRect(0,0,blueBoxW,blueBoxH);
		g.setColor(Color.WHITE);
		//Draw the stars. 
		var starWidth = (blueBoxW/starC);
		var starHeight = (blueBoxH/starR);
		for (int q=0;q<starR;q+=1){
			x=0;
			for(int i=0;i<starC;i+=1){
			g.fillOval(x,y,starWidth,starHeight);
			x+= starWidth;
			}
			y+= starHeight;
			}
		
		}


	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500,400);
window.setContentPane(new LoopLb());
		window.setVisible(true);
	}
}