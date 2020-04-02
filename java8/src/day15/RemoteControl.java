package day15;

public interface RemoteControl {
	int MAX_VOLUME = 10;		//클래스에는 public static을 붙여야하지만 인터페이스에는 자동으로 붙어져잇다.
	int MIN_VOLUME = 0;
	
	void turnOn();				//추상메소드는 클래스에서 abstract를 붙여야하지만 인터페이스는 자동적으로 추상메소드로 인식
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 상태로 설정합니다.");
		}else {
			System.out.println("음소거 상태를 해제합니다.");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
