import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SheepFun extends JPanel implements KeyListener {
	
	Sheep sineva;
	
	public SheepFun() {
		sineva = new Sheep();
		addKeyListener(this);
	}
		
	@Override
	public void paintComponent(Graphics g) {
		requestFocusInWindow();
		int w = getWidth();
		int h = getHeight();
		//draw a green background
		g.setColor(Color.GREEN);
		g.fillRect(0,0,w,h);
	
		sineva.draw(g);
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500,800);
		window.setContentPane(new SheepFun());
		window.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("You just pressed a key!");
		//char clarke = e.getKeyChar();
		//System.out.print(clarke);
		int kc = e.getKeyCode();
		if (kc == KeyEvent.VK_UP) {
			sineva.move(0,-10);
			repaint();
		}
		if (kc == KeyEvent.VK_DOWN) {
			sineva.move(0,+10);
			repaint();
		}
		if (kc == KeyEvent.VK_LEFT) {
			sineva.move(-10,0);
			repaint();
		}
		if (kc == KeyEvent.VK_RIGHT) {
			sineva.move(+10,0);
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("You just let go of a key!");
		
	}
}
