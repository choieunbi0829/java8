package java8;

public class Day0903 {
	public static void main(String[] args) {
		/*printf�� ����(format)�� �°� ����ϴ� �޼ҵ�
		 * printf�� C���� ������� ����ϴ� �޼ҵ��ε� �ڹٿ����� ����� �� �ִ�.
		 * ù��° �μ�(�Է°�)�� ��� ������ �Է��ϰ� �ι�°���ʹ� ������Ŀ� ������ ���� �Է�
		 * 
		 * ������ ������ %�� �����Ѵ�.
		 * d: decimal 10����
		 * f : float �Ǽ�
		 * lf : long float -> double �Ǽ� //c���� �ڹٿ� ����
		 * o : octa 8����
		 * x : hexa 16����
		 * b : binary 2����
		 * s : String ���ڿ�
		 * c : char ���� 1��
		 * 
		 * ������ �� �ִ� ��
		 * ���ʿ� ���ڸ� �Է��ϸ� �ڸ����� ����
		 * %2d ->2�ڸ� ���, %10d->�������� 10�ڸ� ���
		 * ���� �տ� 0�� ���̸� �� ������ 0���� ä��*/
		
		
		
		/*1~25���� 5ĭ 5�ٷ� ���*/
		
		int cnt=1;
		for(int i=1; i<=5; i++){
			
			for(int j=1; j<=5; j++) {
				System.out.printf("%02d", cnt);
				cnt++;
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 * 01 02 03 04 05
		 * 10 09 08 07 06
		 * 11 12 13 14 15
		 * 20 19 18 17 16
		 * 21 22 23 24 25*/
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i%2==0) {
				System.out.print((i*5)+j+1+ "\t");
				
				}else {
					System.out.print((i+1)*5-j+"\t");
				}
				}
			System.out.println();
			}
		/*
		 * @
		 *  @
		 *   @
		 *    @
		 *     @
		 */
			
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j ++) {
				if(i<j) {
					System.out.print(" ");
				} else if(i>j) {
					System.out.print(" ");
				} else {
					System.out.print("@");
				}
			}
			System.out.println();
		}
	}
}

 

