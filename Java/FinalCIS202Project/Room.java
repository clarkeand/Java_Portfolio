import java.awt.*;

public class Room implements Drawables{

	//Create our exits and desitination position. 
	private Point pos;
	private Room exitEast;
	private Room exitWest;
	private Room exitNorth;
	private Room exitSouth;
	//Create a final field for the sizes of our rooms. 
	public static final int SIZE = 50;
	
	//Set default values to our variables. If no info is entered this will be the default. 
	public Room() {
		pos = new Point(10,10);
		exitEast = null;
		exitWest = null;
		exitNorth = null;
		exitSouth = null; 
	}
	
	//Take numerical values that we insert into Room and convert them into x and y coordinates, also set each exit to Null. 
	public Room(int x, int y) {
		pos = new Point(x,y);
		exitEast = null;
		exitWest = null;
		exitNorth = null;
		exitSouth = null; 
	}
	
	//Declare exists to East, West, North, and South. 
	public void setEastExit(Room r) {
		exitEast = r;
		r.exitWest = this;
	}
	
	public void setWestExit(Room r) {
		exitWest = r;
		r.exitEast = this;
	}
	
	public void setNorthExit(Room r) {
		exitNorth = r;
		r.exitSouth = this;
	}
	
	public void setSouthExit(Room r) {
		exitSouth = r;
		r.exitNorth = this;
	}
	
	//Draw the squares first, and then depending on whether or not the exit contains a null value and create a line to act as an 'exit'
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(pos.x,pos.y, SIZE, SIZE);
		g.setColor(Color.YELLOW);
		//Draws an East side exit and west side exit on its destination room. 
		if(exitEast!=null) {
			int dx = pos.x + 50;
			int dy = pos.y + 22;
			int dx2 = pos.x + 55; 	
			int dy2 = pos.y + 22; 
			g.setColor(Color.YELLOW);
			g.drawLine(dx, dy, dx, dy+6);
			g.drawLine(dx2, dy2, dx2, dy2+6);
			g.setColor(Color.BLACK);
			g.drawLine(dx, dy, dx2, dy);
			g.drawLine(dx2, dy2+5, dx2, dy+5);
		}
		
		//Draws an West side exit and East side exit on its destination room. 
		if(exitWest!=null) {
			int dx = pos.x;
			int dy = pos.y + 22;
			int dx2 = pos.x - 5; 	
			int dy2 = pos.y + 22; 
			g.setColor(Color.YELLOW);
			g.drawLine(dx, dy, dx, dy+6);
			g.drawLine(dx2, dy2, dx2, dy+6);
			g.setColor(Color.BLACK);
			g.drawLine(dx, dy, dx2, dy);
			g.drawLine(dx, dy+6, dx2, dy+6);
		}
		
		//Draws a North side exit and South side exit on its destination room. 
		if(exitNorth!=null) {
			int dx = pos.x + 22;
			int dy = pos.y;
			int dx2 = pos.x +22; 	
			int dy2 = pos.y - 5; 
			g.setColor(Color.YELLOW);
			g.drawLine(dx, dy, dx+6, dy);
			g.drawLine(dx2, dy2, dx2+6, dy);
			g.setColor(Color.BLACK);
			g.drawLine(dx, dy, dx, dy2);
			g.drawLine(dx, dy+6, dx2, dy+6);
			g.setColor(Color.YELLOW);
			g.fillRect(pos.x+1,pos.y+1,48,48);
		}
		
		//Draws a South side exit and North side exit on its destination room. 
		if(exitSouth!=null) {
			int dx = pos.x + 22;
			int dy = pos.y + 50;
			int dx2 = pos.x + 22; 	
			int dy2 = pos.y + 55; 
			g.setColor(Color.YELLOW);
			g.drawLine(dx, dy, dx+6, dy);
			g.drawLine(dx2, dy2, dx2+6, dy2);
			g.setColor(Color.BLACK);
			g.drawLine(dx, dy, dx, dy2);
			g.drawLine(dx2+6, dy2, dx2+6, dy);
			g.setColor(Color.YELLOW);
			g.fillRect(pos.x+1,pos.y+1,48,48);
		}
		
	}
	//Create function that gets the point of the specific room that we are dealing with. 
	public Point getPosition() {
		return pos;
	}
	
	//Check if the room has an exit and return a boolean true/false depending on each exits value
	public boolean hasNorthExit() {
		if(exitNorth == null){
			return false;
		}
		else {
			return true;
		}
	}
	public boolean hasSouthExit() {
		if(exitSouth == null){
			return false;
		}
		else {
			return true;
		}
	}
	public boolean hasEastExit() {
		if(exitEast == null){
			return false;
		}
		else {
			return true;
		}
	}
	public boolean hasWestExit() {
		if(exitWest == null){
			return false;
		}
		else {
			return true;
		}
	}
	
	//Create methods that will return the room's exit
	public Room getNorthExit() {
		return exitNorth;
	}
	public Room getSouthExit() {
		return exitSouth;
	}
	public Room getEastExit() {
		return exitEast;
	}
	public Room getWestExit() {
		return exitWest;
	}
	
}
