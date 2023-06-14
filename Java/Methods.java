import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Methods extends JPanel {
	
	ArrayList<String> instructions = new ArrayList<String>();
	int a = 0;
	
	public Methods() {
		//Get user input for the name of the file containing the coordinates. 
		String userF = JOptionPane.showInputDialog("What is the name of the file? Please include .txt extension.");
		File f = new File(userF);
		try{
			//Make Scanner
			Scanner s = new Scanner(f);
			//Loop through each line of the .txt file and split it into an ArrayList.
			while(s.hasNext() == true) {
				String line = s.nextLine();
				for (String splitLines : line.split(" ")) {
					instructions.add(splitLines);
					}
				}
			
		} catch(FileNotFoundException e){
			System.out.println("File is not found!");
		}
	}
	
	public void changeColor(int red, int green, int blue, Graphics g){
		Color color1 = new Color(red,green,blue);
		g.setColor(color1);
		a+=4;
	}

	public void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3, Graphics g){
		//Make a triangle by creating 3 seperate lines that meet together. 
		g.drawLine(x1,y1,x2,y2);
		g.drawLine(x2,y2,x3,y3);
		g.drawLine(x3,y3,x1,y1);
		a+=7;
	}
	public void drawCircle(int xc, int yc, int r, Graphics g){
		//xc is the x value of the center of the circle
		int x = xc-r;
		//yc is the y value of the center of the circle
		int y = yc-r;
		//r is the length of the radius
		g.drawOval(x,y,r*2,r*2);
		a+=4;
	}

	@Override
	public void paintComponent(Graphics g) {
		while(a<instructions.size()){
			//Sort between Color, Circle, and Triangle
			if((instructions.get(a)).equalsIgnoreCase("color")){
				int c1 = a+1;
				int c2 = a+2;
				int c3 = a+3;
				int colorv1 = Integer.parseInt(instructions.get(c1));
				int colorv2 = Integer.parseInt(instructions.get(c2));
				int colorv3 = Integer.parseInt(instructions.get(c3));
				changeColor(colorv1,colorv2,colorv3,g);
			}
			if((instructions.get(a)).equalsIgnoreCase("circle")){
				int c1 = a+1;
				int c2 = a+2;
				int c3 = a+3;
				int circv1 = Integer.parseInt(instructions.get(c1));
				int circv2 = Integer.parseInt(instructions.get(c2));
				int circv3 = Integer.parseInt(instructions.get(c3));
				drawCircle(circv1,circv2,circv3,g);
			}
			if((instructions.get(a)).equalsIgnoreCase("triangle")){
				int c1 = a+1;
				int c2 = a+2;
				int c3 = a+3;
				int c4 = a+4;
				int c5 = a+5;
				int c6 = a+6;
				int triv1 = Integer.parseInt(instructions.get(c1));
				int triv2 = Integer.parseInt(instructions.get(c2));
				int triv3 = Integer.parseInt(instructions.get(c3));
				int triv4 = Integer.parseInt(instructions.get(c4));
				int triv5 = Integer.parseInt(instructions.get(c5));
				int triv6 = Integer.parseInt(instructions.get(c6));
				drawTriangle(triv1,triv2,triv3,triv4,triv5,triv6,g);
			}
		}
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(600,420);
		window.setContentPane(new Methods());
		window.setVisible(true);
	}
}