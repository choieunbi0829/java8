package day21;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JLabelTextEx {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabelText p = new JLabelText();
		p.init();
		f.add(p);
		f.setSize(280,230);
		f.setResizable(true);
		f.setTitle("���ؽ�Ʈ ����");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class JLabelText extends JPanel{
	JTextField tf;
	JTextArea ta;
	JPasswordField pf;
	
	public void init() {
		setLayout(new FlowLayout());		//Flow�� ������� �����Ѵ�.
		JLabel lb1 = new JLabel("�̸�");
		JLabel lb2 = new JLabel("�ּ�");
		JLabel lb3 = new JLabel("���");
		tf = new JTextField(20);		//���ڴ� �ִ� �Է¼�
		ta = new JTextArea(7,20);		//(��,ĭ(��))
		pf = new JPasswordField(20);
		add(lb1);
		add(tf);
		add(lb2);
		add(ta);
		add(lb3);
		add(pf);
	}
}