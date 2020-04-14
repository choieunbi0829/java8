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
		JFrame f = new JFrame("메뉴예제");
		//메뉴만들기
		
		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu("파일");
		JMenu jm2 = new JMenu("편집");
		JMenu jm3 = new JMenu("보기");
		JMenuItem item1 = new JMenuItem("새로만들기");
		JMenuItem item2 = new JMenuItem("열기");
		JMenuItem item3 = new JMenuItem("저장");
		JMenuItem item4 = new JMenuItem("잘라내기");
		JMenuItem item5 = new JMenuItem("복사");
		JMenuItem item6 = new JMenuItem("붙여넣기");
		JMenuItem item7 = new JMenuItem("도구모음");
		JMenuItem item8 = new JMenuItem("상태표시줄");
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
		
		ActionListener listener = e-> tf.setText(e.getActionCommand());		//String값을 리턴한다.
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

