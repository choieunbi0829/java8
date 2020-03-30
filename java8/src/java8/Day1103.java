package java8;

import java.util.Scanner;

public class Day1103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, res;
		while (true) {
			System.out.print("두개의 정수를 입력하세요 : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			res = num1 * num2;
			System.out.println("두개의 정수값 곱은 " + res);
			if (res > 500) {
				break;
			}
		}
		System.out.println("2개의 정수값 곱이 500을 초과하였습니다.");
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}
