package java8;

import java.util.Scanner;

public class Day0713 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("������ �Է��Ͻÿ� :");
		int line = sc.nextInt();
		if (line % 2 == 0) {
			System.out.println("¦����� ����");
			System.exit(0); // ¦����� ����
		}
		int upLine = line / 2;
		int downLine = line - upLine;

		for (i = 0; i < upLine; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("$");
			}

			System.out.println();
		}
		for (i = downLine; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("$");
			}
			System.out.println();
		} 
	
	}

}
