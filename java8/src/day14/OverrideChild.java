package day14;

public class OverrideChild extends OverrideParent {
	void method3() {
		System.out.println("�ڽ� �޼���3");
	}
	
	@Override	//�������ϰڴٴ°��� �˷��ִ� ��
	void method2() {
		System.out.println("�ڽ� �޼���2");
	}

	
}
