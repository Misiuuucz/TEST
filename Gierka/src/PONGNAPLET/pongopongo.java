package PONGNAPLET;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class pongopongo extends Applet implements KeyListener
{

	private Rectangle kwadrat;	
	

	public void init()
	{
		
		this.addKeyListener(this);
		kwadrat = new Rectangle(0, 0, 50, 50);
		
	
	}

	
	public void paint(Graphics g)
	{	
	setSize(500, 500);
	Graphics2D g2 = (Graphics2D)g;
	g2.fill(kwadrat);
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			kwadrat.setLocation(kwadrat.x + 2, kwadrat.y);
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			kwadrat.setLocation(kwadrat.x - 2, kwadrat.y);
		}
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			kwadrat.setLocation(kwadrat.x , kwadrat.y - 2);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			kwadrat.setLocation(kwadrat.x, kwadrat.y + 2);
		}
		
		repaint();
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	
}