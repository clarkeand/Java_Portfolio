import javax.swing.ImageIcon;

public class Nephi extends Sprite {
	
	//Declare these ImageIcons for armed Nephi and regular Nephi.  
	private boolean hasSword;
	private ImageIcon normalIcon;
	private ImageIcon armedIcon;
	
	//Take the constructor from our superclass(Sprite) and load the specific Nephi image. 
	public Nephi() {
		super();
		normalIcon = new ImageIcon("nephi.png");
		armedIcon = new ImageIcon("nephi_and_sword.png");
		hasSword = false;
		image = normalIcon;
	}
	
	public void pickUpSword() {
		hasSword = true; 
		image = armedIcon;
	}
	
	public boolean isArmed() {
		return hasSword;
	}
	
	public void reset() {
		hasSword = false; 
		image = normalIcon;
	}
	
}

