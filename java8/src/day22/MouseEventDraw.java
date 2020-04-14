package day22;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MouseEventDraw extends JPanel implements MouseListener{
	int noval = 0;
	int[] x,y ;
	
	public MouseEventDraw() {
		x = new int[50];
		y = new int[50];
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.BLUE);
		g.drawString("���콺�� Ŭ���ϸ� �簢���� �׸�", 10, 10);
		g.setColor(Color.RED);
		for(int i=0; i<noval; i++) {
			g.drawRect(x[i]-20, y[i]-20, 50, 50);
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		if(noval<50) {
			x[noval] = e.getX();
			y[noval] = e.getY();
			noval++;
		}
		repaint();
	}

	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {	
	}
	public void mouseExited(MouseEvent e) {	
	}
	
}
