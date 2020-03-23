package java8;

public class Day0707 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=1; i<=50; i++) {
			if(i%3 ==0) {
				cnt++;
			}
		}
		System.out.println("3의 배수의 갯수 :" + cnt);
	}	
}
