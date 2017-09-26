package pong;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JFrame;



public class Oknopong extends JFrame implements ActionListener {
	public static int x = 10;
	public static int y = 10;
	
	public Oknopong(){
		setSize(500,380); // Wielkoœæ okna
		setTitle("Moje pierwsze okienkio"); //Tytu³ u góry okna
		setLayout(null);  //Uk³ad stony lub przycisków	
		
		
		
		
		
		
	}
	

	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		//														**OKIENKO**
		Oknopong okienko = new Oknopong(); // Tworzenie obiektu danej klasy (klasa nazwa = new klasa)
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Zamykanie programu (w innym wypadku tylko zniknie z ekranu, ale w tle bedzie odpalony)
		okienko.setVisible(true);             //Sprawia, ¿e dane okno wyskakuje nam na ekranie
		
		for (int polx=0; polx<100; polx++){
			Oknopong.x = Oknopong.x + 1;
		
			Thread.sleep(1000);
			
		}
		

	}
	
	public void painti ( Graphics g ) {
		//przesuniecie uk³adu wspolrzednych
		 Insets b = getInsets();
		// prostok¹t i zaokr¹glony prostok¹t
		g.fillRect( x,y ,100, 70 );
		}
	
	
	
	
	public void actionPerformed(ActionEvent e)
{      						
		//Funkcje przycisków
		Object zrodlo = e.getSource();
}
}


