package java8;

public class Day0905 {
	public static void main(String[] args) {
		/*
		 * for���� ����Ͽ� a~z���� ����ϼ��� abcdefghijkmnopqrsyuvwxyz ��Ʈ: ����ȯ �ʿ�
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