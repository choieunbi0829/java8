package Day12;

public class StudentttEx {
	public static void main(String[] args) {
		Studenttt s1=new Studenttt("ȫ�浿", "����", 30, 20200001);
		Studenttt s2=new Studenttt();
		s2.setName("������");
		s2.setGender("����");
		s2.setAge(40);
		s2.setsNo(20200002);
		s1.showInfo();
		s2.showInfo();
	}
}
