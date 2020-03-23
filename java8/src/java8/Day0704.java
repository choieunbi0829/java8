package java8;

public class Day0704 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				
					sum += i;
			}
			
		}
		System.out.println("1에서 10까지의 수 중 짝수의 합계는" + sum + "입니다.");
	}
}
/*for (int i = 1; i <= 10; i++) {
if (i % 2 != 0) {
	continue;
}
sum += i;
*/