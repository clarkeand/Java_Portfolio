import java.awt.*;

public class Pyramid {
	
	private Point position;
	private Color stairColor;
	private Color brickColor;
	
	//cUses all default values
	public Pyramid() {
		brickColor = Color.YELLOW;
		stairColor = Color.BLACK;
		position = new Point(100,350);
	}
	
	//Allows the user to create a pyramid at an x/y position
	public Pyramid(int x, int y) {
		this();
		position = new Point(x,y);
	}

	//Allows the user to use a Point perameter
	public Pyramid(Point p) {
		this();
		position = new Point(p);
	}
	
	//Sets the color of the bricks OR defers to default color. 
	public void setStairColor(Color c){
		stairColor = c;
	}
	
	//Sets the color of the bricks OR defers to default color. 
	public void setBrickColor(Color c){
		brickColor = c;
	}

	//Draws the actual temple
	public void draw(Graphics g){
		//Make Temple Layers
		g.setColor(brickColor);
		g.fillRect(position.x,position.y,300,45);
		g.fillRect(position.x+16,position.y-45,270,45);
		g.fillRect(position.x+33,position.y-85,235,40);
		g.fillRect(position.x+53,position.y-120,195,35);
		g.fillRect(position.x+76,position.y-190,150,70);
		//Make Temple Top's Door
		g.setColor(Color.BLACK);
		g.fillRect(position.x+136,position.y-155,28,35);
		//Make Temple Layers Border
		g.drawRect(position.x,position.y,300,45);
		g.drawRect(position.x+16,position.y-45,270,45);
		g.drawRect(position.x+33,position.y-85,235,40);
		g.drawRect(position.x+53,position.y-120,195,35);
		g.drawRect(position.x+76,position.y-190,150,70);
		//Make Steps to Temple using strings
		g.setColor(stairColor);
		g.drawString("__________________",position.x+92,position.y+40);
		g.drawString("__________________",position.x+92,position.y+32);
		g.drawString("__________________",position.x+92,position.y+25);
		g.drawString("__________________",position.x+92,position.y+18);
		g.drawString("__________________",position.x+92,position.y+11);
		g.drawString("__________________",position.x+92,position.y+4);
		g.drawString("__________________",position.x+92,position.y-3);
		g.drawString("__________________",position.x+92,position.y-10);
		g.drawString("__________________",position.x+92,position.y-17);
		g.drawString("__________________",position.x+92,position.y-22);
		g.drawString("__________________",position.x+92,position.y-29);
		g.drawString("__________________",position.x+92,position.y-34);
		g.drawString("__________________",position.x+92,position.y-41);
		g.drawString("__________________",position.x+92,position.y-48);
		g.drawString("__________________",position.x+92,position.y-55);
		g.drawString("__________________",position.x+92,position.y-62);
		g.drawString("__________________",position.x+92,position.y-69);
		g.drawString("__________________",position.x+92,position.y-76);
		g.drawString("__________________",position.x+92,position.y-84);
		g.drawString("__________________",position.x+92,position.y-91);
		g.drawString("__________________",position.x+92,position.y-98);
		g.drawString("__________________",position.x+92,position.y-105);
		g.drawString("__________________",position.x+92,position.y-112);
		g.drawString("__________________",position.x+92,position.y-119);
	}
}