import java.awt.*;
import javax.swing.*;

public abstract class Sprite implements Drawables{

	//Create new fields for currentRoom and image
	protected Room currentRoom;
	protected ImageIcon image;
	
	public Sprite() {
		//Assign Null Values to CurrentRoom and Image
		currentRoom = null;
		image = null;
	}
	
	//Create a Setter and a Getter for the current room. 
	public void setCurrentRoom(Room r) {
		currentRoom = r; 
	}
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	//Actually draw the sprite if currentroom is anything other than null
	@Override
	public void draw(Graphics g) {
		if(currentRoom != null) {
			Point pos2 = new Point(currentRoom.getPosition());
			int x1 = pos2.x;
			int y1 = pos2.y;
			image.paintIcon(null,g,x1+6,y1+7);
		}
	}
	
	//Create our move Methods
	public void moveNorth() {
		if(currentRoom.hasNorthExit() == true) {
			setCurrentRoom(currentRoom.getNorthExit());
		}
	}
	public void moveSouth() {
		if(currentRoom.hasSouthExit() == true) {
			setCurrentRoom(currentRoom.getSouthExit());
		}
	}
	public void moveEast() {
		if(currentRoom.hasEastExit() == true) {
			setCurrentRoom(currentRoom.getEastExit());
		}
	}
	public void moveWest() {
		if(currentRoom.hasWestExit() == true) {
			setCurrentRoom(currentRoom.getWestExit());
		}
	}
}
