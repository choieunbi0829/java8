package java8;

public class Day0708 {
	public static void main(String[] args) {
		/*1���� 10���� ���*/
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		/*10~1���� ���*/
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		/*���� ��� ����(#)���� ���*/
		for(int i=1; i<=10; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		/*10~1���� #�� ���*/
		for(int i=10; i>=1; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
