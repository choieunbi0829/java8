package day22;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam2 extends JFrame{
	public static void main(String[] args) {
		JFrame f = new JFrame("�޴�����");
		//�޴������
		
		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu("����");
		JMenu jm2 = new JMenu("����");
		JMenu jm3 = new JMenu("����");
		JMenuItem item1 = new JMenuItem("���θ����");
		JMenuItem item2 = new JMenuItem("����");
		JMenuItem item3 = new JMenuItem("����");
		JMenuItem item4 = new JMenuItem("�߶󳻱�");
		JMenuItem item5 = new JMenuItem("����");
		JMenuItem item6 = new JMenuItem("�ٿ��ֱ�");
		JMenuItem item7 = new JMenuItem("��������");
		JMenuItem item8 = new JMenuItem("����ǥ����");
		jm1.add(item1);
		jm1.add(item2);
		jm1.add(item3);
		jm2.add(item4);
		jm2.add(item5);
		jm2.add(item6);
		jm3.add(item7);
		jm3.add(item8);
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		TextField tf = new TextField();
		tf.setEnabled(false);
//		tf.setEditable(false);
		
		f.add(tf, BorderLayout.SOUTH);
		f.setJMenuBar(jmb);
		f.setSize(300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener listener = e-> tf.setText(e.getActionCommand());		//String���� �����Ѵ�.
		item1.addActionListener(listener);
		item2.addActionListener(listener);
		item3.addActionListener(listener);
		item4.addActionListener(listener);
		item5.addActionListener(listener);
		item6.addActionListener(listener);
		item7.addActionListener(listener);
		item8.addActionListener(listener);
		
	}
		
	}

