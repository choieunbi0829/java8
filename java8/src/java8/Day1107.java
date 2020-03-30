package java8;

import java.util.Random;
import java.util.Scanner;

public class Day1107 {
	public static void main(String[] args) {
		/* 가위바위보게임 */

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String ga = "가위", ba = "바위", bo = "보";
		String user="";
		String com="";

		
			System.out.print("가위 = 1 ,바위 = 2, 보=3 중 한개를 입력해주세요 : ");
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
			System.out.println("이기셨습니다.");
		} else if (user == com) {
			System.out.println("user: " + user + "com: " + com);
			System.out.println("비기셨습니다.");
		} else {
			System.out.println("user: " + user + "com: " + com);
			System.out.println("졌습니다.");
		}
		sc.close();
	}
}
