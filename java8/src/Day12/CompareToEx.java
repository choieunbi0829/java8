package Day12;

public class CompareToEx {
	public static void main(String[] args) {
		String a = "aaa";
		String b = "ABC";
		int res = a.compareTo(b);
		System.out.println("비교결과: " + res);
		
		String c = "Java Programming Very Good";
		String d = "Java Programming";
		
		boolean compare1 = a.regionMatches(false, 5, d, 5, 11);
		boolean compare2 = a.regionMatches(true ,0 ,d, 0, 4);
		boolean compare3 = a.regionMatches(false ,0 ,d, 0, 4);
		
		System.out.println(compare1);
		System.out.println(compare2);
		System.out.println(compare3);
	}
}
