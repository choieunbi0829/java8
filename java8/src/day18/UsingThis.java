package day18;

public class UsingThis {
	public int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void methed() {		//���ٽ�
			Functional fi=()->{
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField + "\n");
			};
			fi.method();
			
			Functional fi2 = new Functional() {
				
				@Override
				public void method() {		//�޼ҵ尡 �ƴ� ��ü������
					System.out.println("outterField: " + outterField);
					System.out.println("outterField: " + UsingThis.this.outterField + "\n");
					System.out.println("innerField: " + innerField);
			//		System.out.println("innerField: " + this.innerField + "\n");	//Inner.this.innerField�� ����ؾ� ������ ������					
				}
			};
			fi2.method();
		}
	}
}
