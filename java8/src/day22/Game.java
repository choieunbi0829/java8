package day22;

import java.awt.Container;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Game extends JFrame implements ActionListener{
	String user = "";
	static String com = "";
	static int mixnum = 0;
	JButton ba;
	JButton ga;
	JButton bo;
	JButton end;
	JButton reset;
	List list;

	public  Game() {
		super("���������� ����");
		start();
		
		
		
	}
	//���� �޼ҵ�
	
	public static void main(String[] args) {
		startMix();
		Game game = new Game();
		game.setSize(450,330);
		game.setVisible(true);
		game.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
	}
	public void start() {
		Container cpane = getContentPane();
		cpane.setLayout(null);
		
		ba = new JButton("����");
		ga = new JButton("����");
		bo = new JButton("��");
		end = new JButton("����");
		reset = new JButton("�����");
		list = new List();
		
		ba.setBounds(30,250,70,30);
		ga.setBounds(130, 250, 70, 30);
		bo.setBounds(230, 250, 70, 30);
		end.setBounds(330, 250, 70, 30);
		reset.setBounds(330, 220, 70,30);
		list.setBounds(30, 20, 380, 180);
		
		cpane.add(ba);
		cpane.add(ga);
		cpane.add(bo);
		cpane.add(end);
		cpane.add(reset);
		cpane.add(list);
		ba.addActionListener(this);
		ga.addActionListener(this);
		bo.addActionListener(this);
		end.addActionListener(this);
		reset.addActionListener(this);
	}
	
	public static void startMix() {
		mixnum = (int) (Math.random()*3);
		switch(mixnum) {
		case 0 :
			com = "����";
			break;
		case 1 :
			com = "����";
			break;
		case 2 :
			com = "��";
			break;
			
		}
	}
	
	
	private void getFight(String com, String user) {
		if(com.equals("����")) {
			if(user.equals("����")) {
				list.add("��ǻ�� : ����");
				list.add("�����ϴ�.");
			}else if(user.equals("��")) {
				list.add("��ǻ�� : ���� ");
				list.add("�̰���ϴ�.");
			}else {
				list.add("��ǻ�� : ���� ");
				list.add("�����ϴ�.");
			}
		}
		if(com.equals("����")) {
			if(user.equals("����")) {
				list.add("��ǻ�� : ����");
				list.add("�̰���ϴ�.");
			}else if(user.equals("��")) {
				list.add("��ǻ�� : ���� ");
				list.add("�����ϴ�.");
			}else {
				list.add("��ǻ�� : ���� ");
				list.add("�����ϴ�.");
			}
	}
		if(com.equals("��")) {
			if(user.equals("����")) {
				list.add("��ǻ�� : ��");
				list.add("�����ϴ�.");
			}else if(user.equals("��")) {
				list.add("��ǻ�� : �� ");
				list.add("�����ϴ�.");
			}else {
				list.add("��ǻ�� : �� ");
				list.add("�̰���ϴ�.");
			}
	}
		startMix();
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == ba) {
			list.add("���� : ����");
			getFight(com, "����");
		}else if(e.getSource() == ga) {
			list.add("���� : ����");
			getFight(com, "����");
		}else if(e.getSource() == bo) {
			list.add("���� : ��");
			getFight(com, "��");
		}else if(e.getSource() == reset) {
			list.removeAll();
			startMix();
		}else if(e.getSource() == end) {
			System.exit(0);
		}		
	}
	
	
}
