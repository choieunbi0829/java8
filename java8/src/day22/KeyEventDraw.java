package day22;

import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyEventDraw extends JPanel{
	public static void main(String[] args) {
		JFrame f = new JFrame("Ű�̺�Ʈ");
		
		TextField tf = new TextField();
		tf.setEnabled(false);
		
		f.add(tf);
		f.setSize(200, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				tf.setText(String.valueOf((char)key));
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO �ڵ� ������ �޼ҵ� ����
				int key = e.getKeyCode();
				String temp = tf.getText();
				tf.setText(temp + " : " + KeyEvent.getKeyText(key));		//Ű�̸� ���
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		
	}
}