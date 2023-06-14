import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Jan29 extends JPanel {
	
	public Jan29() {
		//int[] scores;
		//scores = new int[5];
		/*int [] scores = new int[5];
		scores[0] = 9;
		scores[1] = 8;
		scores[2] = 10;
		scores[3] = 7;
		scores[4] = 0;*/
		int[] scores = {9,8,10,7,0};
		for(int s : scores){
			System.out.println("Someone got a score of " + s);
		}
		
		String frontRow = "Linda Don Marco Rodrigo";
		/*char[] letters = frontRow.toCharArray();
		for (char t : letters) {
			System.out.println(t);
		}*/
		String[] words = frontRow.split(" ");
		for (var w : words) {
			System.out.println(w);
		}
		
		int[][] sushi = new int[4][3];
		sushi[0][0] = 64;
		sushi[1][2] = 8;
		sushi[3][0] = 4096;
		System.out.println("I found " + sushi[3][0] + "at position 3,0 in the array.");
		
	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(200,200);
		window.setContentPane(new Jan29());
		window.setVisible(true);
	}
}
