import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class ArraysLab extends JPanel {
	
	public ArraysLab() {
		int[][] coordinates = new int[200][200];
		var filename = "coordinates.txt";
		File f = new File(filename);
		for(i=0;i<=200;i++){
			for(y=0;y<=200;y++){
				coordinates[i][y] = 0;
				}
			}
		try{
			Scanner s = new Scanner(f);
			while(s.hasNext() == true) {
				String name = s.nextInt();
				}
			}
		s.close();
		catch(FileNotFoundException e){
			System.out.println("File is not found!");
		}
		}
		@Override
	
	public void paintComponent(Graphics g) {
		
		}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200,200);
		window.setContentPane(new ArraysLab());
		window.setVisible(true);
	}
	}