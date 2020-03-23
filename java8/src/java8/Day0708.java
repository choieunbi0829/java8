package java8;

public class Day0708 {
	public static void main(String[] args) {
		/*1에서 10까지 출력*/
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		/*10~1까지 출력*/
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		/*숫자 대신 문자(#)으로 출력*/
		for(int i=1; i<=10; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		/*10~1까지 #을 출력*/
		for(int i=10; i>=1; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
