package java8;

public class Day0714 {
	public static void main(String[] args) {
		/* 1~100 중에 5의 배수의 합을 출력 */
		int sum = 0;
		int num = 0;
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("5의 배수의 합은 " + sum + "입니다.");

		/* 1~50 중에 3의 배수는 화면에 출력하세요. */
		System.out.println("3의 배수는");

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

		/*1~50 중에 3의 배수의 총합과 개수를 출력*/
		
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				num +=i;
				cnt ++;
			}
		}
		System.out.println("3의 배수의 총합은 " +num+ "이며, 개수는 " + cnt + "입니다.");
		
	}
}
