import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Feb7 extends JPanel {
	
	public Feb7() {
		var filename = "numbas.txt";
		File f = new File(filename);
		int sum = 0;
		try{
			Scanner s = new Scanner(f);
			while(s.hasNext() == true) {
				int marco = s.nextInt();
				sum += marco;
			}
			s.close();
		} catch(FileNotFoundException e){
			System.out.println("Yo! File is not found!");
		}
		System.out.println("The total is " + sum);
		}
		@Override
	
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
	
}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200,200);
		window.setContentPane(new Feb7());
		window.setVisible(true);
	}
}
