package Day12;

public class TV {
	//필드
	String com;
	int year;
	int inch;
	
	//생성자
	TV(String com, int year, int inch){
		this.com = com;
		this.year = year;
		this.inch = inch;
	}
	//메소드
	void show() {
		System.out.println(com+"에서 만든 " + year + "년형 " + inch + "인치 TV ");
	}

}
	
 
	
	
