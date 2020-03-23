package java8;

public class Day0709 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=50; i++) {
			sum +=i;
		}
		double avg = (double)sum / 50;
		System.out.println("1부터 50까지의 합의 평균은 " + avg + "입니다." );
	}	
}
