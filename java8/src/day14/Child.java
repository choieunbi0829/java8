package day14;

public class Child extends Parent {
	Child(String name){
		super(name); 	//자동 생성됩니다.
		System.out.println("자식을 생성합니다.");
	}
}
