package java8;

import java.util.Scanner;

public class Day1015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int kimbab=2000;
		final int dduk=2000;
		final int oden=500;
		final int sumdae=2000;
		int a,b,c,d;
		
		System.out.println("��� 1�� : 2000��, ������ 1�κ� : 2000��, ���� 1�� : 500��, ���� 1�κ� : 2000��");
		System.out.println("����� �� �� �����Ͻðڽ��ϱ�? : ");
		a=sc.nextInt();
		System.out.println();
		System.out.println("�����̴� �� �κ� �����Ͻðڽ��ϱ�? : ");
		b=sc.nextInt();
		System.out.println();
		System.out.println("������ �� �� �����Ͻðڽ��ϱ�? : ");
		c=sc.nextInt();
		System.out.println();
		System.out.println("����� �� �κ� �����Ͻðڽ��ϱ�? : ");
		d=sc.nextInt();
		System.out.println();
		
		System.out.println("����� " + a +"�� �ֹ��ϼ̽��ϴ�.");
		System.out.println("��� : " + kimbab * a);
		System.out.println();
		System.out.println("�����̴� " + b +"�κ� �ֹ��ϼ̽��ϴ�.");
		System.out.println("��� : " + dduk * b);
		System.out.println();
		System.out.println("������ " + c +"�� �ֹ��ϼ̽��ϴ�.");
		System.out.println("��� : " + oden * c);
		System.out.println();
		System.out.println("������ " + d +"�κ� �ֹ��ϼ̽��ϴ�.");
		System.out.println("��� : " + sumdae * d);
		System.out.println();
		
		System.out.println("�� �ݾ�: " + (kimbab * a + dduk * b + oden * c + sumdae * d));
		sc.close();
	}
}
