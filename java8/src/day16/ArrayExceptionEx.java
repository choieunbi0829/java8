package day16;

public class ArrayExceptionEx {
	public static void main(String[] args) {
		exceptionTest();
	}

	static void exceptionTest() {
		int[] arr = new int[3];
		try {	//try-catch�� �Բ� ����ؾ� �Ѵ�.
			arr[2] = 100;
			System.out.println(arr[2]);
//			throw new ArrayIndexOutOfBoundsException();//���������� ���ܸ� �߻���Ű���� ��ü�� �����ؼ� throw�Ѵ�.
		
		
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("���� ������ �Ұ����ϰų� �迭�� ������ ������ϴ�.");
	/*	} catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("�迭�� ������ �Ѿ ����� �� �����ϴ�.");
		*/
		} catch(Exception e) {		//��� ���ܸ� ó���ϱ⶧���� ���� �������� ����ؾ� �Ѵ�.
			System.out.println("�߻��� ��� ���ܸ� ó���մϴ�.");
			e.printStackTrace();	//���� ��� ����
		} finally {	//���ܿ� ������� ������ �����ϴ� �����Դϴ�. ���������մϴ�.
			System.out.println("finally�����Դϴ�.");
		}
		
		try {
			Thread.sleep(1000);	//����ó�� ���̴� ������ �Ұ����� �ڵ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
