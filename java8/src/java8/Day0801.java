package java8;

public class Day0801 {
	public static void main(String[] args) {
		/*1~100까지 출력*/
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		/*1~100중에 3과 5의 공배수의 합은 얼마?*/
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%15==0) {
				sum +=i;
			}
		}
		System.out.println("3과 5의 공배수의 합: " +sum);
		
		/*1~100 중에 짝수는 더하고 홀수는 뺀 결과를 출력*/
		int sum1 = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sum1 +=i;
			} else {
				sum1 -=i;
			}
		}
		System.out.println("짝수는 더하고 홀수는 뺀 값 : " + sum1);
		
		
	}
}
