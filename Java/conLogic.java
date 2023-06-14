import javax.swing.*;
import java.awt.*;

public class conLogic extends JPanel {
	
	//Load image variables
	int age;
	ImageIcon primary;
	ImageIcon beehive;
	ImageIcon miamaid;
	ImageIcon laurel;
	ImageIcon rs;
	ImageIcon deacon;
	ImageIcon teacher;
	ImageIcon priest;
	ImageIcon elders;
	
	String gender;
	
	public conLogic() {
		//Make pop up windows.
		gender = JOptionPane.showInputDialog("What is your gender? Please use M for male and F for Female.");
		String ages = JOptionPane.showInputDialog("What is your age?");
		age = Integer.parseInt(ages);
		
		//Load the images
		primary = new ImageIcon("prmry.jpg");
		beehive = new ImageIcon("beehive.gif");
		miamaid = new ImageIcon("miamaid.gif");
		laurel = new ImageIcon("laurel.gif");
		rs = new ImageIcon("RS.jpg");
		deacon = new ImageIcon("deacon.jpg");
		teacher = new ImageIcon("teacher.jpg");
		priest = new ImageIcon("priest.jpg");
		elders = new ImageIcon("elders.jpg");
	}

	@Override
	public void paintComponent(Graphics g) {
		//Make Female class list
		if(gender.equalsIgnoreCase("F")){
			//Primary
			if(age>=0 && age<12){
				g.drawString("You go to Primary!",10,10);
				primary.paintIcon(null,g,10,30);
				}
			//Beehive
			if(age>=12 && age<=13){
				g.drawString("You belong to the Beehive class.",10,10);
				beehive.paintIcon(null,g,10,30);
				}
			//Miamaid
			if(age>=14 && age<=15){
				g.drawString("You belong to the Miamaid class.",10,10);
				miamaid.paintIcon(null,g,10,30);
				}
			//Laurel Class
			if(age>=16 && age<18){
				g.drawString("You belong to the Laurel class.",10,10);
				laurel.paintIcon(null,g,10,30);
				}
			//Relief Society
			if(age>=18 && age<120){
				g.drawString("You are a member of the Relief Society.",10,10);
				rs.paintIcon(null,g,10,30);
				}
			if(age<0 || age>=120){
				g.drawString("Are you sure you entered your age correctly?",10,10);
			}
			}
		//Make Male class list
		if(gender.equalsIgnoreCase("M")){
			//Primary
			if(age>=0 && age<12){
				g.drawString("You go to Primary!",10,10);
				primary.paintIcon(null,g,10,30);
				}
			//Deacons
			if(age>=12 && age<=13){
				g.drawString("You belong to the Deacons Quorum.",10,10);
				deacon.paintIcon(null,g,10,30);
				}
			//Teachers
			if(age>=14 && age<=15){
				g.drawString("You belong to the Teachers Quorum.",10,10);
				teacher.paintIcon(null,g,10,30);
				}
			//Priests
			if(age>=16 && age<18){
				g.drawString("You belong to the Priests Quorum.",10,10);
				priest.paintIcon(null,g,10,30);
				}
			//Elders Quorum
			if(age>=18 && age<120){
				g.drawString("You are a member of the Elders Quorum.",10,10);
				elders.paintIcon(null,g,10,30);
				}
			if(age<0 || age>=120){
				g.drawString("Are you sure you entered your age correctly?",10,10);
			}
			}
		
		if (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F")){
			g.drawString("Invalid Entry. Please use M for male, or F for female.",10,10);
		}
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(350,200);
		window.setContentPane(new conLogic());
		window.setVisible(true);
	}
}