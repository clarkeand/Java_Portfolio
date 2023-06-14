import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Books extends JPanel {
	
		ArrayList<String> title = new ArrayList<String>();
		ArrayList<Integer> year = new ArrayList<Integer>();
		ArrayList<String> genre = new ArrayList<String>();
		
	public Books() {

		var filename = "bookshelf.txt";
		File f = new File(filename);
		try{
			Scanner s = new Scanner(f);
			while(s.hasNext() == true) {
				String line = s.nextLine();
				String[] rex=line.split(",");
				title.add(rex[0]);
				year.add(Integer.parseInt(rex[1]));
				genre.add(rex[2]);
			}
			s.close();
		} catch(FileNotFoundException e){
			System.out.println("File is not found!");
		}
		}
		@Override
	
	public void paintComponent(Graphics g) {
		int y = 20;
		for (int i=0;i<title.size(); i++){
			String t = title.get(i);
			int yr = year.get(i);
			String gr = genre.get(i);
			g.drawString("The book " + t + " was published in " + yr + " and it's genre is " + gr + ".", 10, y);
			y+=20;
		}
	
}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200,200);
		window.setContentPane(new Books());
		window.setVisible(true);
	}
}
