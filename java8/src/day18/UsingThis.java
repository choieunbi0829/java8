package day18;

public class UsingThis {
	public int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void methed() {		//람다식
			Functional fi=()->{
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField + "\n");
			};
			fi.method();
			
			Functional fi2 = new Functional() {
				
				@Override
				public void method() {		//메소드가 아닌 객체영역임
					System.out.println("outterField: " + outterField);
					System.out.println("outterField: " + UsingThis.this.outterField + "\n");
					System.out.println("innerField: " + innerField);
			//		System.out.println("innerField: " + this.innerField + "\n");	//Inner.this.innerField를 사용해야 실행이 가능함					
				}
			};
			fi2.method();
		}
	}
}
