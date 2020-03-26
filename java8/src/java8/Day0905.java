package java8;

public class Day0905 {
	public static void main(String[] args) {
		/*
		 * for문을 사용하여 a~z까지 출력하세요 abcdefghijkmnopqrsyuvwxyz 힌트: 형변환 필요
		 */
		int cnt=1;
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= 26; j++) {
				System.out.print((char)+(64 + cnt));
				cnt++;
			}
		}
	}
}