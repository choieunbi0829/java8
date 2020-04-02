package day15;

public interface RemoteControl {
	int MAX_VOLUME = 10;		//Ŭ�������� public static�� �ٿ��������� �������̽����� �ڵ����� �پ����մ�.
	int MIN_VOLUME = 0;
	
	void turnOn();				//�߻�޼ҵ�� Ŭ�������� abstract�� �ٿ��������� �������̽��� �ڵ������� �߻�޼ҵ�� �ν�
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���Ұ� ���·� �����մϴ�.");
		}else {
			System.out.println("���Ұ� ���¸� �����մϴ�.");
		}
	}
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
}
