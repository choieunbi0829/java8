package java8;

public class Day0704 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				
					sum += i;
			}
			
		}
		System.out.println("1���� 10������ �� �� ¦���� �հ��" + sum + "�Դϴ�.");
	}
}
/*for (int i = 1; i <= 10; i++) {
if (i % 2 != 0) {
	continue;
}
sum += i;
*/