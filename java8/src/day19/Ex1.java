package day19;

import java.util.Hashtable;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<String, String> ha = new Hashtable<String, String>();
		
		System.out.println("�������� �и��� �̸��� ��ȭ��ȣ 4���� �Է��ϼ���.");
		System.out.print("�̸�, ��ȭ��ȣ : ");
		String name1 = sc.next();
		String num1 = sc.next();
		ha.put(name1, num1);
		System.out.print("�̸�, ��ȭ��ȣ : ");
		String name2 = sc.next();
		String num2 = sc.next();
		ha.put(name2, num2);
		System.out.print("�̸�, ��ȭ��ȣ : ");
		String name3 = sc.next();
		String num3 = sc.next();
		ha.put(name3, num3);
		System.out.print("�̸�, ��ȭ��ȣ : ");
		String name4 = sc.next();
		String num4 = sc.next();
		ha.put(name4, num4);
		
		System.out.println("��ȭ��ȣ�� �˻��� �̸��� �Է��ϼ���.");
		String name = sc.next();
		
		if(name == ha.get(name1)) {
			System.out.println(name + "�� ��ȭ��ȣ�� " + ha.get(num1));
		}else if(name == ha.get(name2)) {
			System.out.println(name + "�� ��ȭ��ȣ�� " + ha.get(num2));
		}else if(name == ha.get(name3)) {
			System.out.println(name + "�� ��ȭ��ȣ�� " + ha.get(num3));
		}else {
			System.out.println(name + "�� ��ȭ��ȣ�� " + ha.get(num4));
		}
		sc.close();
	}
}
