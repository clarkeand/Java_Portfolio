import javax.swing.*;
import java.awt.Graphics;

public class Jan24 extends JPanel {
	
	int age;
	ImageIcon picture;
	
	public Jan24() {
		String ages = JOptionPane.showInputDialog("What is your age?");
		try{
			age = Integer.parseInt(ages);
		} catch(NumberFormatException e) {
			System.out.println("Hey! Digits only, please. Assuming 16.");
			age = 16;
		}
		//Load the pictures
		picture = new ImageIcon("teenpower.png");

	}

	@Override
	public void paintComponent(Graphics g) {
		  if(age >= 13 && age<= 19){
			picture.paintIcon(null,g,10,10);
		} 
		else {
			g.drawString("NO TEEN POWER FOR YOU.",10,10);
		}
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200,200);
		window.setContentPane(new Jan24());
		window.setVisible(true);
	}
}