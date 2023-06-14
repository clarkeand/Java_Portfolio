//our very first class!
//(our first "non-main" class, anyway...)
public class Vertex {
	int x;
	int y;
	
	public Vertex(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public Vertex() {
		x = 0;
		y = 0;
	}
	
	//this is called a COPY CONSTRUCTOR.
	//That's a constructor that takes a single parameter,
	//an existing object of the same type. And it
	//copies the values from the existing object into
	//the new object.
	public Vertex(Vertex other) {
		x = other.x;
		y = other.y;
	}
	
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}
}