package Day12;

public class Car {

	// �ʵ�
	String company = "����ڵ���";
	String model = "���";
	String color = "�Ķ�";
	int maxSpeed = 250;
	int speed = 0;

	/* ������ */
	Car() { // �����ڸ� �������� ������ �⺻�����ڰ� �ڵ����� �ۼ��˴ϴ�.
			// �����ڰ� �����Ѵٸ� �⺻�����ڴ� �ۼ������ʴ´�.
		this("����ڵ���", "����", 300);
	}

	Car(String company, String color, int maxSpeed) {
		this.company = company;
		this.color = color; // �̸��� �ٸ��ٸ� this��������ʾƵ� ��
		this.maxSpeed = maxSpeed; // �̸��� ���ٸ� this�� ���ڽ��� �����Ѿ���
	}

	Car(String color, int maxSpeed) {
		this("����ڵ���", color, maxSpeed);
	}
	Car(int maxSpeed) {
		this("����ڵ���", "����", maxSpeed);
		/*
		 * this.company="����ڵ���" this.color = "����"; this.maxSpeed = maxSpeed;
		 */
	}
	/*
	 * Car(String company, int maxSpeed, String color){ } Car(String color, int
	 * speed, int maxSpeed){ } Car(String company, String color, int maxSpeed, int
	 * speed){ } // Car(String color,String company, int maxSpeed){ //�ڷ����� ���°� �����ϸ�
	 * �ߺ�ó���Ҽ� ����.
	 * 
	 * Car(int max,String color, String company){ } //�����ڴ� �ʿ��� ��ŭ �ߺ����� �� �� �ִ�.
	 * 
	 */

	//�޼ҵ�
	
	void accel() {
		speed +=10;
		if(speed >maxSpeed) {
			speed = maxSpeed;
			
		}
		System.out.println("����ӵ�: " + speed);
		
			
		}
		void brake(){
			speed=0;
		System.out.println("���� �ӵ�: " + speed);
	}
	
}
