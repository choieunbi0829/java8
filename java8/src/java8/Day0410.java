package java8;

import java.util.Scanner;

public class Day0410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w;
		int h;
		
		System.out.println("���簢���� ���ο� ������ ���ÿ� : ");
		w = sc.nextInt();
		h = sc.nextInt();
		
		double res1 = (double)w *h;
		double res2 = (double)2 * ( w + h );
		System.out.println("���簢���� ���� : " + res1);
		System.out.println("�簢���� �ѷ� : " + res2);
		
		sc.close();
	}
}
