package java8;

import java.util.Scanner;

public class Day1105 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,pay;
		
		System.out.print("��ǰ�ܰ��� �Է����ּ���: ");
		num1=sc.nextInt();
		System.out.print("������ �Է����ּ���: ");
		num2=sc.nextInt();
		
		pay= num1*num2;
		
		System.out.println("�ݾ���" + pay + "���̱⶧����");
		if(pay>=1000000) {
			num1 *=0.6;
			System.out.println("100���� �̻� 40%������ ���ϴ�.");
		}
		if(pay>=500000 && pay<1000000) {
			num1*=0.7;
			System.out.println("50���� �̻� 30%������ ���ϴ�.");
		}
		
		System.out.println("���� �����Ͻ� �ݾ��� " + (num1*num2) +"�� �Դϴ�.");
	}
}
