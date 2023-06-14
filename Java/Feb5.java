import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Feb5 extends JPanel {
	
	public Feb5() {
		var filename = "guys.txt";
		var f = new File(filename);
		try{
			var s = new Scanner(f);
			while (s.hasNext() == true){
				var name = s.nextLine();
				System.out.println(name);
		}
		
		s.close();
	}catch(FileNotFoundException e) {
		System.out.println("YO! The file is missing!")
	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200,200);
		window.setContentPane(new Feb5());
		window.setVisible(true);
	}
}
