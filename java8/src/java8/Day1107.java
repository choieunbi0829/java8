package java8;

import java.util.Random;
import java.util.Scanner;

public class Day1107 {
	public static void main(String[] args) {
		/* �������������� */

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String ga = "����", ba = "����", bo = "��";
		String user="";
		String com="";

		
			System.out.print("���� = 1 ,���� = 2, ��=3 �� �Ѱ��� �Է����ּ��� : ");
			user = sc.next();
			
		switch(user) {
		case "a":
			user = ga;
			break;
		case "b":
			user = ba;
			break;
		case "c":
			user = bo;
			break;
		}
		int num = (int) (Math.random() * 3);

		switch (num) {
		case 0:
			com = ga;
			break;
		case 1:
			com = ba;
			break;
		case 2:
			com = bo;
			break;
		}

		if (user.equals(ba) && com.equals(ga) || user.equals(bo) && com.equals(ba)
				|| user.equals(ga) && com.equals(bo)) {
			System.out.println("user: " + user + "com: " + com);
			System.out.println("�̱�̽��ϴ�.");
		} else if (user == com) {
			System.out.println("user: " + user + "com: " + com);
			System.out.println("���̽��ϴ�.");
		} else {
			System.out.println("user: " + user + "com: " + com);
			System.out.println("�����ϴ�.");
		}
		sc.close();
	}
}
