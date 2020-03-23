package java8;

public class Day0710 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " PINGPONG");
			} else if(i%5==0) {
				System.out.println(i + " PONG");
			} else if(i%3==0) {
				System.out.println(i + " PING");
				/*else if(i%3 ==0 && i%5 ==0) {
				 *System.out.println(i + " PINGPONG"); */
			} else {
				System.out.println(i);
			}
		}
		System.out.println();
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
			if(i%3==0) {
				System.out.print("PING");
			} 
			if(i%5==0) {
				System.out.print("PONG");
			}
			System.out.println();
		}
	}
}
