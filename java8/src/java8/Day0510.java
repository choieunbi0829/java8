package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0510 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ga ="����";
		String ba = "����";
		String bo = "��";
		String people = "";
		String computer = "";
		
		System.out.print("����, ����, �� �� �ϳ��� �����ϼ���. :  ");
		people = sc.next();
		switch(people) {
			case "A":
			case "a":
				people = ga;
				break;
			case "B":
			case "b":
				people = ba;
				break;
			case "C":
			case "c":
				people = bo;
				break;
		}
		
		int number = (int)(Math.random() * 3);
		switch(number) {
			case 0 :
				computer = ga;
				break;
			case 1 :
				computer = ba;
				break;
			case 2 :
				computer = bo;
				break;
		}
		
		if((people == bo && computer == ba) ||(people == ga && computer == bo) || (people == bo && computer == ga)) {
			System.out.println("�����! ��� : " + people + ",��ǻ�� : " + computer);
		} else if(people == computer) {
			System.out.println("�����ϴ�! ��� : " + people + ", ��ǻ�� : " + computer);
		} else {
			System.out.println("��ǻ�ͽ�! ��� : " + people + ",��ǻ�� : " + computer);
		}
	}
}
