package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0716 {
	public static void main(String[] args) {
		/* 가위바위보 */

		Scanner sc = new Scanner(System.in);
		String com = "";
		String peo = "";
		final String ga = "가위";
		final String ba = "바위";
		final String bo = "보";
		int life = 3;
		int score = 0;
		/* 유저값 설정 */
		while (true) {
			do {
				System.out.print("가위 :1, 바위:2, 보:3, 종료:4 " + "\t" + ">");
				int temp = sc.nextInt();
				switch (temp) {
				case 1:
					peo = ga;
					break;
				case 2:
					peo = ba;
					break;
				case 3:
					peo = bo;
					break;
				case 4:
					System.out.println("4번을 선택하여 프로그램을 종료합니다.");
					System.out.println("score: " + score + ",life: " + life);
					System.exit(0);
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
				}
			} while (peo.equals(""));

			/* 컴퓨터 설정 */
			Random rd = new Random();
			int temp = rd.nextInt(3);

			switch (temp) {
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
			/* 유저 컴퓨터 비교 */

			if ((peo.equals(bo) && com.equals(ba)) || (peo.equals(ba) && com.equals(ga))
					|| (peo.equals(ga) && com.equals(bo))) {
				score += 100;
				System.out.println("유저승리! 유저: " + peo + ", 컴퓨터: " + com);
			} else if (peo == com) {
				score += 10;
				System.out.println("비겼습니다. 유저: " + peo + ", 컴퓨터: " + com);
			} else {
				life -= 1;
				System.out.println("컴퓨터 승! 유저: " + peo + ", 컴퓨터: " + com);
			}
			if (life == 0) {
				System.out.println("게임을 종료합니다.");
				System.out.println("총점은 " + score + "점입니다.");
				System.exit(0);
			}
			System.out.println("score: " + score + ",life: " + life);
		}
	}

}
