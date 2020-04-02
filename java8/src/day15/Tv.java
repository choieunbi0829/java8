package day15;

public class Tv implements RemoteControl {
	int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("������ " + volume + "���� �����մϴ�.");
	}

	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("TV�� ���Ұ� ���·� �����մϴ�.");
		} else {
			System.out.println("TV�� ���Ұ� ���¸� �����մϴ�.");
		}
	}
}
