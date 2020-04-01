package Day12;

public class StudentttEx {
	public static void main(String[] args) {
		Studenttt s1=new Studenttt("È«±æµ¿", "³²¼º", 30, 20200001);
		Studenttt s2=new Studenttt();
		s2.setName("±èÀ»µ¿");
		s2.setGender("¿©¼º");
		s2.setAge(40);
		s2.setsNo(20200002);
		s1.showInfo();
		s2.showInfo();
	}
}
