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
		super("가위바위보 게임");
		start();
		
		
		
	}
	//메인 메소드
	
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
		
		ba = new JButton("바위");
		ga = new JButton("가위");
		bo = new JButton("보");
		end = new JButton("종료");
		reset = new JButton("재시작");
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
			com = "가위";
			break;
		case 1 :
			com = "바위";
			break;
		case 2 :
			com = "보";
			break;
			
		}
	}
	
	
	private void getFight(String com, String user) {
		if(com.equals("바위")) {
			if(user.equals("바위")) {
				list.add("컴퓨터 : 바위");
				list.add("비겼습니다.");
			}else if(user.equals("보")) {
				list.add("컴퓨터 : 바위 ");
				list.add("이겼습니다.");
			}else {
				list.add("컴퓨터 : 바위 ");
				list.add("졌습니다.");
			}
		}
		if(com.equals("가위")) {
			if(user.equals("바위")) {
				list.add("컴퓨터 : 가위");
				list.add("이겼습니다.");
			}else if(user.equals("보")) {
				list.add("컴퓨터 : 가위 ");
				list.add("졌습니다.");
			}else {
				list.add("컴퓨터 : 가위 ");
				list.add("비겼습니다.");
			}
	}
		if(com.equals("보")) {
			if(user.equals("바위")) {
				list.add("컴퓨터 : 보");
				list.add("졌습니다.");
			}else if(user.equals("보")) {
				list.add("컴퓨터 : 보 ");
				list.add("비겼습니다.");
			}else {
				list.add("컴퓨터 : 보 ");
				list.add("이겼습니다.");
			}
	}
		startMix();
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == ba) {
			list.add("유저 : 바위");
			getFight(com, "바위");
		}else if(e.getSource() == ga) {
			list.add("유저 : 가위");
			getFight(com, "가위");
		}else if(e.getSource() == bo) {
			list.add("유저 : 보");
			getFight(com, "보");
		}else if(e.getSource() == reset) {
			list.removeAll();
			startMix();
		}else if(e.getSource() == end) {
			System.exit(0);
		}		
	}
	
	
}
