package java8;

public class Day0602 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합: " + sum);
//		System.out.println("현재 i의 값 : " + i );
	}

}
