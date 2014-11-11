package toddTheTroll;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ToddSprite {
	
	private BufferedImage toddImg;
	private TrollGame game;
	private int x = 0;
	private int y = 0;
	private int xa = 0;
	private int ya = 0;
	
	public ToddSprite(TrollGame game){
		
		
		
		 try {                
	          toddImg = ImageIO.read(new File("C:\\Users\\Sam\\workspace\\ToddTheTroll\\Images\\samsffsprite2.png"));
	       } catch (IOException ex) {
	          
	    	   // file missing
	       }
		 
		 this.game = game;
			x = 0;
			y = game.getHeight() - toddImg.getHeight();
		 
		 
	}
	
	public void move()
	{
		if (ya == 0)
			y = game.getHeight() - toddImg.getHeight();
		else
			y = y + ya;
		
		x = x + xa;
		
	}
	
	public void paint(Graphics2D g) {
	    
		 
		
	    g.drawImage(toddImg, x, y, null);           
	}
	
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -1;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 1;
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			ya = ya - toddImg.getHeight();
		}
		
	}
	
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			xa = 0;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			ya = 1;
		}
		
	}
	

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

}
