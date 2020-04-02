package day15;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl.changeBattery();
		Tv tv = new Tv();
		Audio audio = new Audio();
//		RemoteControl rc = new RemoteControl(); //인터페이스는 생성자가 없다.
		RemoteControl rc;		//변수는 정의할 수 있다.
		rc = tv;		//인터페이스 변수에는 구현 클래스의 객체가 대입된다.
		rc = new Tv();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc = audio;
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc=new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("보일러를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("보일러를 끕니다.");
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("온도의 단계를 " + volume + "단계로 변경합니다.");
			}
		};
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc=new IpTV();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc=new IpTV2();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
	}
}

