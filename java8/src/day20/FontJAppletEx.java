package day20;

import javax.swing.JFrame;

public class FontJAppletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("��Ʈ ���� ����");
		FontJApplet p = new FontJApplet();
		p.init();
		
		f.setSize(600,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setResizable(false);		//������ ������ �ȵ�
		f.setVisible(true);
	}
}