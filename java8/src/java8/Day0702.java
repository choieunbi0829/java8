package java8;

import java.util.Scanner;

public class Day0702 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1개를 입력하세요. : ");
		int num1 = sc.nextInt();

		if((num1 % 2) == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		sc.close();
	}
}