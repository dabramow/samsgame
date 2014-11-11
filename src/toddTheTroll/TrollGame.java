package toddTheTroll;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TrollGame extends JPanel {
	
	ToddSprite sprite = new ToddSprite(this);
	JFrame window = new JFrame();
	
	public TrollGame(){
		
		window.setSize(300, 400);
		
		
		

		addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
				
				sprite.keyPressed(e);
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
				sprite.keyReleased(e);
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
				
				
			}
			
		});
		
		setFocusable(true);
	}
	
	public void move()
	{
		sprite.move();
	}
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		sprite.paint(g2d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		JFrame frame = new JFrame("Mini Tennis");
		TrollGame game = new TrollGame();
		frame.add(game);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			
			game.move();
			game.repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
