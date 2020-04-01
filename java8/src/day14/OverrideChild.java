package day14;

public class OverrideChild extends OverrideParent {
	void method3() {
		System.out.println("자식 메서드3");
	}
	
	@Override	//재정의하겠다는것을 알려주는 것
	void method2() {
		System.out.println("자식 메서드2");
	}

	
}
