package java8;

import java.util.Scanner;

public class Day0611 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intvalue;
		int resvalue = 0;

		System.out.println("숫자를 입력하세요!: ");
		intvalue = sc.nextInt();

		while (intvalue > 0) {

			resvalue = resvalue * 10;
			resvalue = resvalue + (intvalue % 10);
			intvalue = intvalue / 10;
		}
		System.out.println("바뀐 숫자 : " + resvalue);

		sc.close();
	}
}
