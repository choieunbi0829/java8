package java8;

import java.util.Scanner;

public class Day0701 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�� ���� ������ �Է��ϼ���. : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1==num2) {
			System.out.println("Same");
			} else {
				System.out.println("Different");
			}
		
		String result = num1 == num2? "����" : "�ٸ�";
		System.out.println(result);
		sc.close();
	}
}
