package java8;

public class Day0714 {
	public static void main(String[] args) {
		/* 1~100 �߿� 5�� ����� ���� ��� */
		int sum = 0;
		int num = 0;
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("5�� ����� ���� " + sum + "�Դϴ�.");

		/* 1~50 �߿� 3�� ����� ȭ�鿡 ����ϼ���. */
		System.out.println("3�� �����");

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

		/*1~50 �߿� 3�� ����� ���հ� ������ ���*/
		
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				num +=i;
				cnt ++;
			}
		}
		System.out.println("3�� ����� ������ " +num+ "�̸�, ������ " + cnt + "�Դϴ�.");
		
	}
}
