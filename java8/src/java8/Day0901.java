package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0901 {
	public static void main(String[] args) {
		/*
		 * 1~100 �߿� �����ϰ� ������ �����Ѵ�. �Է��� ���� ���亸�� ũ�� "up" �Է��� ���� ���亸�� ������ "DOWN" �ִ� ȸ����
		 * 10ȸ�� �����մϴ�. ������ ��Ҹ� ���� ������ ����մϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int com = rd.nextInt(100) + 1;
		int a = com;
		int user;
		int cnt=0;
		while (true) {

			System.out.print("������ �Է����ּ���.(1~100) : ");
			user = sc.nextInt();
			 cnt++;
			if (user < a) {
				System.out.println("�Էµ� ���ں��� �����ϴ�."+ cnt + "ȸ �Է��Ͽ����ϴ�.");

			} else if (user == a) {
				System.out.println("���õ� ���ڰ� �����ϴ�. �����Դϴ�."+ cnt + "ȸ �Է��Ͽ����ϴ�.");
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			} else {
				System.out.println("�Էµ� ���ں��� �����ϴ�."+ cnt + "ȸ �Է��Ͽ����ϴ�.");

			}
		}
		
		
		/*int cnt;
		long startTime = System.currentTimeMillis();
		
		while (true) {
			do {
				if(user !=0) {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
				System.out.println("���ڸ� �Է����ּ���. (1~100) : ");
				user = sc.nextInt();
			}while(user<1||user>100);
			cnt++;
			if(user==com) {
				System.out.println("�����Դϴ�. " + cnt + "ȸ �Է��Ͽ����ϴ�.");
			}else if(com>user) {
			System.out.println("UP!!" + cnt + "ȸ �Է��Ͽ����ϴ�.");
			} else { 
				System.out.println("Down!" + cnt +"ȸ �Է��Ͽ����ϴ�.");
			}
			if(cnt==10) {
				System.out.println("���������� 0���Դϴ�. ������ �����մϴ�.");
				System.exit(0);
			}
		}
		
		long endTime=System.currentTimeMillis();
		long playTime = (endTime-startTime)/1000;
		long score = (long)((60-playTime)/0.6);
		System.out.println("����������" + score + "���Դϴ�. ������ �����մϴ�.");
		*/
	}
}
