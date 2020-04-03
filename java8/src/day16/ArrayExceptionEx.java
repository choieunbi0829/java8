package day16;

public class ArrayExceptionEx {
	public static void main(String[] args) {
		exceptionTest();
	}

	static void exceptionTest() {
		int[] arr = new int[3];
		try {	//try-catch는 함께 사용해야 한다.
			arr[2] = 100;
			System.out.println(arr[2]);
//			throw new ArrayIndexOutOfBoundsException();//강제적으로 예외를 발생시키려면 객체를 생성해서 throw한다.
		
		
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자 연산이 불가능하거나 배열의 범위를 벗어났습니다.");
	/*	} catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("배열은 범위를 넘어서 사용할 수 없습니다.");
		*/
		} catch(Exception e) {		//모든 예외를 처리하기때문에 가장 마지막에 사용해야 한다.
			System.out.println("발생된 모든 예외를 처리합니다.");
			e.printStackTrace();	//오류 경로 추적
		} finally {	//예외와 상관없이 무조건 실행하는 구간입니다. 생략가능합니다.
			System.out.println("finally구간입니다.");
		}
		
		try {
			Thread.sleep(1000);	//예외처리 없이는 실행이 불가능한 코드
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
