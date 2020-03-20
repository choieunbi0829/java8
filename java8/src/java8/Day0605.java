package java8;

public class Day0605 {
	public static void main(String[] args) {
		System.out.println("구구단출력");
		
		for(int i=1; i<=9; i++) {
//			System.out.println(i + "단");
			for(int j=2; j<=9; j++) {
				System.out.print(j +"x" + i + "=" + (i*j)+ "\t");
				}
			System.out.println();
			
		}
	}
}
