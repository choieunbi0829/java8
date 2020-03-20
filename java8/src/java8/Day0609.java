package java8;

import java.util.Scanner;

public class Day0609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ga = "가위";
		String ba = "바위";
		String bo = "보";
		String people = "";
		String computer = "";
		int score = 0;
		int life = 3;

		// 사람입력 // 게임시작 지점
		while (true) {
			System.out.print("가위, 바위, 보 중 하나를 선택하세요.(a=가위, b=바위, c=보, q=종료 :  ");
			people = sc.next();
			switch (people) {
			case "A":
			case "a":
				people = ga;
				break;
			case "B":
			case "b":
				people = ba;
				break;
			case "C":
			case "c":
				people = bo;
				break;
			case "Q":
			case "q":
				people = "quit";
				break;
			default:
				people = "error";
			}

			int number = (int) (Math.random() * 3);
			switch (number) {
			case 0:
				computer = ga;
				break;
			case 1:
				computer = ba;
				break;
			case 2:
				computer = bo;
				break;
			}

			if ((people.equals(bo) && computer.equals(ba)) || (people.equals(ga) && computer.equals(bo))
					|| (people.equals(bo) && computer.equals(ga))) {
				System.out.println("사람승! 사람 : " + people + ",컴퓨터 : " + computer);
				score += 10;
			} else if (people == computer) {
				System.out.println("비겼습니다! 사람 : " + people + ", 컴퓨터 : " + computer);
				score += 1;
			} else {
				System.out.println("컴퓨터승! 사람 : " + people + ",컴퓨터 : " + computer);
				life -= 1;
			}
			System.out.println("현재 점수: " + score + "현재 라이프: " + life);
			System.out.println();

			if (life == 0) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
			// 게임끝
		}
	}
}
