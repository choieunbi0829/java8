package java8;

import java.util.Scanner;

public class Day0503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���� ������ �Է��� �ּ���(0~100): ");
		int score = sc.nextInt();
		String pass = "";
		
		if(score >=90) {
			pass = "A����";
			} else if(score>=80) {
				pass = "B����";
			} else if(score>=70) {
				pass = "C����";
			} else if(score>=60) {
				pass = "D����";
			} else  {
				pass = "F����";
			}	
	
		System.out.println("���輺���� " + pass + "�Դϴ�.");
		sc.close();
	}
}

/*90�� �̻��� A����
 * 90�� �̸� 80�� �̻��� B����
 * 80�� �̸� 70�� �̻��� C����
 * 70�� �̸� 60�� �̻��� D�̻�
 * 60�� �̸��� F����
 */