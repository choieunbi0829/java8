package day16;

public class UtilEx {
	public static void main(String[] args) {
		Box2<String> box = Util.<String>boxing("ȫ�浿");
		String name = box.get();		//String�� ����Ǿ� ����
		System.out.println(name);
		
		Box2<Integer> box2 = Util.<Integer>boxing(100);		//�޼ҵ� ȣ��� ���׸��� ���ߵȴٸ� ������ �� �ִ�.
		int number = box2.get();
		System.out.println(number);
	}
}
