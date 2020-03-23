package java8;

public class Day0706 {
	public static void main(String[] args) {
		int sum = 1;
		for(int i=1; i<=10; i++) {
			sum *=i;
		}
		System.out.println("1에서 10까지의 수의 곱의 값은 " +sum);
	}
}
