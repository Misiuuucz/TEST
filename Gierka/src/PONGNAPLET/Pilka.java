package PONGNAPLET;

import javax.swing.*;
import java.awt.*;

public class Pilka extends JFrame
{
	int x=50;
	int y=50;
	int rad=50;
	int CHUJ;
	
	void ruch()
	{
		if(x<getWidth() - rad)
		{
			x = x+1;
		}
		
		
	}
	
}
