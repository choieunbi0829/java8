package java8;

public class Day1001 {
	/*알파벳 나열하기*/
	public static void main(String[] args) {
		for(int i='a'; i<='z'; i++) {
			System.out.print((char)i);
		}
		System.out.println();
		for(int i='A'; i<='Z'; i++) {
			System.out.print((char)i);
		}
		System.out.println();
	}
}
