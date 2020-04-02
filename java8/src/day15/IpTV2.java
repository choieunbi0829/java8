package day15;

public class IpTV2 extends Tv implements Internet {

	@Override
	public void searchWeb() {
		System.out.println("인터넷 검색");
	}

}
