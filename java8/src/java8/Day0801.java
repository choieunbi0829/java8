package java8;

public class Day0801 {
	public static void main(String[] args) {
		/*1~100���� ���*/
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		/*1~100�߿� 3�� 5�� ������� ���� ��?*/
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%15==0) {
				sum +=i;
			}
		}
		System.out.println("3�� 5�� ������� ��: " +sum);
		
		/*1~100 �߿� ¦���� ���ϰ� Ȧ���� �� ����� ���*/
		int sum1 = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sum1 +=i;
			} else {
				sum1 -=i;
			}
		}
		System.out.println("¦���� ���ϰ� Ȧ���� �� �� : " + sum1);
		
		
	}
}
