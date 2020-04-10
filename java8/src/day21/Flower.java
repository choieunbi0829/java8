package day21;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Flower extends JPanel{
	Color[] color = {Color.RED, Color.YELLOW};
	Color[] color1 = {Color.BLUE , Color.GREEN};
	int [] flo1 = {90, 60};
	
	public void paint(Graphics g) {
		g.fillOval(50, 50, 60, 60);
		g.drawOval(75,75,100,100);
		
		
	}
}
