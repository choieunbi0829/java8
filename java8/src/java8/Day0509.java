package java8;

import java.util.Scanner;

public class Day0509 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű����� �� ���� ���ڸ� �Է��ϼ��� : ");
		
		String coffee = sc.next();
		
		switch(coffee) {
			case "A":
			case "a":
				System.out.println("�Ƹ޸�ī��");
					break;
			case "C":
			case "c":
				System.out.println("īǪġ��");
				break;
			case "I":
			case "i":
				System.out.println("ī���");
				break;
			case "M":
			case "m":
				System.out.println("ī���ī");	
		}
		sc.close();
	}
}
