import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class ArLab extends JPanel {
	
	int[][] plane = new int[200][200];
	int[] allCoordinates;
	int lines = 0;
	int coord;
	int arrayLength;
	
	public ArLab() {
		//Call File
		var filename = "TA.txt";
		File f = new File(filename);
		//Make Array of Coordinates
		for(int i=0;i<200;i++){
			for(int y=0;y<200;y++){
				plane[i][y] = 0;
				}
			}
		try{
			//Make Scanners
			Scanner s = new Scanner(f);
			Scanner sc = new Scanner(f);
			//Count the number of lines so that a precise array can be created. 
			while(s.hasNext() == true) {
				s.nextLine();
				lines += 1;	
			}
			lines=lines*2;
			//Create an array that contains coordinates
			allCoordinates = new int[lines];
			int a = 0;
			while(sc.hasNext() == true) {
				coord = sc.nextInt();
				allCoordinates[a] = coord;	
				a+=1;
				}
			//Cycle through array in allCoordinates, and change their values to 1
			for(int indx = 0; indx<lines; indx+=2){
				var x1 = allCoordinates[indx];
				var y1 = allCoordinates[indx+1];
				plane[x1-1][y1-1] = 1; 
				plane[x1-2][y1-2] = 1; 
				plane[x1-3][y1-3] = 1; 
				plane[x1-1][y1+1] = 1; 
				plane[x1-2][y1+2] = 1; 
				plane[x1-3][y1+3] = 1; 
				plane[x1+1][y1-1] = 1;
				plane[x1+2][y1-2] = 1;
				plane[x1+3][y1-3] = 1;
				plane[x1+1][y1+1] = 1;
				plane[x1+2][y1+2] = 1;
				plane[x1+3][y1+3] = 1;
				//Extra Credit
				plane[x1][y1+1] = 1;
				plane[x1][y1+2] = 1;
				plane[x1][y1+3] = 1;
				plane[x1][y1-1] = 1;
				plane[x1][y1-2] = 1;
				plane[x1][y1-3] = 1;
				plane[x1+1][y1] = 1;
				plane[x1+2][y1] = 1;
				plane[x1+3][y1] = 1;
				plane[x1-1][y1] = 1;
				plane[x1-2][y1] = 1;
				plane[x1-3][y1] = 1;
			}
			int arrayLength = (plane.length)-1;
			s.close();
		} catch(FileNotFoundException e){
			System.out.println("File is not found!");
		}
		}
		@Override
	
	public void paintComponent(Graphics g) {
		//Paint the Picture in the window. 
		for(int x2=0;x2<200;x2++){
			int y2 = 0; 
			for(y2=0;y2<200;y2++){
				if(plane[x2][y2]==1){
					g.setColor(Color.WHITE);
					g.fillRect(x2,y2,1,1);
				}
				else{
					g.setColor(Color.BLACK);
					g.fillRect(x2,y2,1,1);
				}
			}
		}
			
	
}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200,215);
		window.setContentPane(new ArLab());
		window.setVisible(true);
	}
}
