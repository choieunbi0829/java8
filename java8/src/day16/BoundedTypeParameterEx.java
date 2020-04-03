package day16;

public class BoundedTypeParameterEx {
	public static void main(String[] args) {
		String str;
//		String str = Util.compare("a", "b");(x)
		
		int result1 = Util.<Integer>compare(10, 20);	//t1과 t2가 int이므로 Integer로 유추가 가능
		System.out.println(result1);		//-1
		
		int result2 = Util.compare(4.5, 3);		//t1은 double, t2는 int
		System.out.println(result2);
		
		int result3 = Util.compare(100, 100);
		System.out.println(result3);
	}
}
