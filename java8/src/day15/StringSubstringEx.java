package day15;

public class StringSubstringEx {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secomdNum = ssn.substring(7);
		System.out.println(secomdNum);
	}
}
