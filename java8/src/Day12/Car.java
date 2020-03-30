package Day12;

public class Car {

	// 필드
	String company = "기아자동차";
	String model = "쏘울";
	String color = "파랑";
	int maxSpeed = 250;
	int speed = 0;

	/* 생성자 */
	Car() { // 생성자를 생성하지 않으면 기본생성자가 자동으로 작성됩니다.
			// 생성자가 존재한다면 기본생성자는 작성되지않는다.
		this("기어자동차", "검정", 300);
	}

	Car(String company, String color, int maxSpeed) {
		this.company = company;
		this.color = color; // 이름이 다르다면 this사용하지않아도 됨
		this.maxSpeed = maxSpeed; // 이름이 같다면 this로 나자신을 가르켜야함
	}

	Car(String color, int maxSpeed) {
		this("기아자동차", color, maxSpeed);
	}
	Car(int maxSpeed) {
		this("기아자동차", "검정", maxSpeed);
		/*
		 * this.company="기아자동차" this.color = "검정"; this.maxSpeed = maxSpeed;
		 */
	}
	/*
	 * Car(String company, int maxSpeed, String color){ } Car(String color, int
	 * speed, int maxSpeed){ } Car(String company, String color, int maxSpeed, int
	 * speed){ } // Car(String color,String company, int maxSpeed){ //자료형의 형태가 동일하면
	 * 중복처리할수 없다.
	 * 
	 * Car(int max,String color, String company){ } //생성자는 필요한 만큼 중복정의 할 수 있다.
	 * 
	 */

	//메소드
	
	void accel() {
		speed +=10;
		if(speed >maxSpeed) {
			speed = maxSpeed;
			
		}
		System.out.println("현재속도: " + speed);
		
			
		}
		void brake(){
			speed=0;
		System.out.println("현재 속도: " + speed);
	}
	
}
