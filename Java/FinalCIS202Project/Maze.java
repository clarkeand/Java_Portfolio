import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Maze extends JPanel implements KeyListener{
		
	//This is where we declare each room as a field, so that we are able to use them in other places. 
	private Room r1;
	private Room r2;
	private Room r3;
	private Room r4;
	private Room r5;
	private Room r6;
	private Room r7;
	private Room r8;
	private Room r9;
	private Room r10;
	private Room r11;
	private Room r12;
	private Room r13;
	private Room r14;
	private Room r15;
	private Room r16;
	//Declare each Sprite as a field
	private Nephi hero;
	private Laban villain;
	private Sword weapon;
	private Plates brassPlates;
	//Create an Array List to store our Drawables
	ArrayList<Drawables> list = new ArrayList<Drawables>();
	
	public Maze() {
		//This is where we instantiate each room in order to set their x, and y vairables, and add them to arrays. 
		r1 = new Room();
		r2 = new Room(65,10);
		r3 = new Room(120,10);
		r4 = new Room(175,10);
		r5 = new Room(10,65);
		r6 = new Room(65,65);
		r7 = new Room(120,65);
		r8 = new Room(175,65);
		r9 = new Room(10,120);
		r10 = new Room(65,120);
		r11 = new Room(120,120);
		r12 = new Room(175,120);
		r13 = new Room(10,175);
		r14 = new Room(65,175);
		r15 = new Room(120,175);
		r16 = new Room(175,175);
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(r4);
		list.add(r5);
		list.add(r6);
		list.add(r7);
		list.add(r8);
		list.add(r9);
		list.add(r10);
		list.add(r11);
		list.add(r12);
		list.add(r13);
		list.add(r14);
		list.add(r15);
		list.add(r16);
		//System.out.println(list);
		addKeyListener(this);
		
		//This sets the exit from the source room to the destination room. I had the destination room listed before the setExit and then had the destination room at the end. 
		r1.setEastExit(r2);
		r2.setEastExit(r3);
		r3.setEastExit(r4);
		r5.setEastExit(r6);
		r4.setSouthExit(r8);
		r8.setWestExit(r7);
		r7.setWestExit(r6);
		r7.setSouthExit(r11);
		r12.setWestExit(r11);
		r5.setSouthExit(r9);
		r9.setSouthExit(r13);
		r9.setEastExit(r10);
		r14.setNorthExit(r10);
		r14.setEastExit(r15);
		r15.setEastExit(r16);
		r16.setNorthExit(r12);
		
		//Instantiate our sprites, and addd them to our arraylist
		hero = new Nephi();
		villain = new Laban();
		weapon = new Sword();
		brassPlates = new Plates();
		hero.setCurrentRoom(r5);
		villain.setCurrentRoom(r7);
		weapon.setCurrentRoom(r13);
		brassPlates.setCurrentRoom(r1);
		list.add(hero);
		list.add(villain);
		list.add(weapon);
		list.add(brassPlates);
		
		
	}

	@Override
	public void paintComponent(Graphics g) {
		//Get the height and width of the window and set a solid background. 
		var w = getWidth();
		var h = getHeight();
		g.setColor(Color.YELLOW);
		g.fillRect(0,0,w,h);
		//Draw each room and then depending on their exits, draw a line matching the background color. Also draws the sprites
		for(int i=0; i <= (list.size() - 1);i++) {
			list.get(i).draw(g);
		}
		requestFocusInWindow();
	}
	
	//Make our sprite moveable
	public void keyPressed(KeyEvent e) {
		int kc = e.getKeyCode();
		switch(kc) {
		case KeyEvent.VK_UP:
			//Check if Nephi is going into Laban's room and if he is armed, continue the game, else, reset
			hero.moveNorth();
			repaint();
			if (villain.getCurrentRoom()==hero.getCurrentRoom()) {
				if(hero.isArmed() == true) {
					villain.setCurrentRoom(null);
				}
				else{
					JOptionPane.showMessageDialog(null, "Oh no! Laban got you! Try Again.");
					reset();
				}
			}
			break;
		case KeyEvent.VK_DOWN:
			hero.moveSouth();
			//Check if Nephi is going into the room the sword is inside of and if so change sprite and make the sword dissappear. 
			if (weapon.getCurrentRoom()==hero.getCurrentRoom()) {
				hero.pickUpSword();
				weapon.setCurrentRoom(null);
			}
			
			break;
		case KeyEvent.VK_LEFT:
			hero.moveWest();
			repaint();
			//Check if Nephi is going into the Plates' room and if he is, he wins!
			if (hero.getCurrentRoom()==brassPlates.getCurrentRoom()) {
				brassPlates.setCurrentRoom(null);
				JOptionPane.showMessageDialog(null, "Congrats! You got the plates and you win!");
				reset();
			}
			break;
		case KeyEvent.VK_RIGHT:
			hero.moveEast();
			repaint();
			//Check if Nephi is going into Laban's room and if he is armed, continue the game, else, reset
			if (villain.getCurrentRoom()==hero.getCurrentRoom()) {
				if(hero.isArmed() == true) {
					villain.setCurrentRoom(null);
				}
				else{
					JOptionPane.showMessageDialog(null, "Oh no! Laban got you! Try Again.");
					reset();
				}
			}
			break;
		default:
			System.out.println("Hey, push an arrow key to make Nephi move!");
		}
		repaint();
	}
	
	public void keyTyped(KeyEvent e) {	
	}
	
	public void keyReleased(KeyEvent e) {
	}

	public static void main(String[] args) {
		//Create the window we will do our drawing in. 
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(235,255);
		window.setContentPane(new Maze());
		window.setVisible(true);
	}
	
	private void reset() {
		hero.setCurrentRoom(r5);
		villain.setCurrentRoom(r7);
		weapon.setCurrentRoom(r13);
		brassPlates.setCurrentRoom(r1);
		hero.reset();
	}
}