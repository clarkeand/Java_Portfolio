import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*; //Collections, ArrayList,

public class altair extends JPanel {
	
	public altair() {
		ArrayList<String> kiara = new ArrayList<String>();
		var filename = "temples.txt";
		File f = new File(filename);
		try{
			Scanner s = new Scanner(f);
			while(s.hasNext() == true) {
				String name = s.nextLine();
				if (name.startsWith("//")){
					continue;
				}
				kiara.add(name);
			}
			s.close();
		} catch(FileNotFoundException e){
			System.out.println("Yo! File is not found!");
		}
		Collections.sort(kiara);
		for(var t : kiara){
			System.out.println(t);
		}
		}
		@Override
	
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
	
}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200,200);
		window.setContentPane(new altair());
		window.setVisible(true);
	}
}
