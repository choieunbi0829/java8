package java8;

import java.util.Random;
import java.util.Scanner;

public class Day1016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int com[] = new int[3];
		int user[] = new int[3];
		int x, y, z;
		int strike=0, ball=0;

		x = rd.nextInt(9) + 1;

		do {
			y = rd.nextInt(9) + 1;
		} while (x == y);

		do {
			z = rd.nextInt(9) + 1;
		} while (y == z || x == z);
		
		com[0]=x;
		com[1]=y;
		com[2]=z;
		
		/*System.out.println("1~9���� ���� �� ���� �Է��մϴ�.");
		for(i=0; i<user.length; i++) {
			do {
			System.out.print(i+1 + "��° ���� : ");
			user[i]=sc.nextInt();
			 if(user[i]==0) {
				 System.out.println("0�� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���");
			 }
			 if(user[i]>9) {
				 System.out.println("���ڸ� �ʰ��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���");
			 }
			 
		}while(user[i]==0 || user[i]>9 );
			
		}
		
		System.out.println("������ �����մϴ�.");
		System.exit(0);
		*/
		for(int j=0; j<11; j++) {
		System.out.println("ù ��° ���� �Է��� �ּ���. : ");
		do {
			if(user[0] != 0) {
				System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
			}
			user[0]=sc.nextInt();
		}while(user[0]<1 ||user[0]>9);
		do {
			if(user[0]==user[1]) {
				System.out.println("������ ���ڴ� ����� �� �����ϴ�. �ٽ� �Է��� �ּ���.");
			}
		System.out.println("�� ��° ���� �Է��� �ּ���. : ");
		do {
			if(user[1] != 0) {
				System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
			}
			user[1]=sc.nextInt();
		}while(user[1]<1 ||user[1]>9);
		}while(user[0]==user[1]);
		
		do {
			if(user[0] ==user[1] || user[1]==user[2]) {
				System.out.println("������ ���ڴ� ����� �� �����ϴ�. �ٽ� �Է��� �ּ���.");
			}
		System.out.println("�� ��° ���� �Է��� �ּ���. : ");
		do {
			if(user[2] != 0) {
				System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
			}
			user[2]=sc.nextInt();
		}while(user[2]<1 ||user[2]>9);
		}while(user[0]==user[2] || user[1]==user[2]);
		
		for(int i=0; i<3; i++) {
			if(com[i]==user[i]) {
				strike++;
			}
		}
		
		if(com[0]==user[1] ||com[0]==user[2]) {
			ball++;
		}
		if(com[1]==user[0] ||com[1]==user[2]) {
			ball++;
		}
		if(com[2]==user[0] ||com[2]==user[1]) {
			ball++;
		}
		System.out.println(strike + "��Ʈ����ũ, " + ball + "��");
		if(strike==3) {
			System.out.println("�����Դϴ�. ������ �����մϴ�.");
			System.exit(0);
		}
		strike = ball = 0;
	}
	}
}
