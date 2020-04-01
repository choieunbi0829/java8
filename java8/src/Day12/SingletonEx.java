package Day12;

public class SingletonEx {
	public static void main(String[] args) {
		Singleton s1;	
		//s1 = new Singleton();	생성자 호출은 불가능
		s1 = Singleton.getInstance();	//기존에 생성된 객체를 호출합니다.
		
		Singleton s2= Singleton.getInstance();
		
		if(s1==s2) {
			System.out.println("동일객체");
		}else {
			System.out.println("다른객체");
		}
		
		Member m1 = new Member("홍길동","hong");
		Member m2 = new Member("홍길동","hong");	//new로 새로운 객체를 불러온것으로 되기때문에
		if(m1==m2) {								//값은 같지만 객체가 들어가 있는 주소가 다른것으로 인식
			System.out.println("동일객체");
		}else {
			System.out.println("다른객체");
		}
	}
}
