package Day12;

public class Sing {
	String title;
	String artist;
	int year;
	String country;
	
	Sing (String title, String artist, int year, String country){
		this.title=title;
		this.artist=artist;
		this.year=year;
		this.country=country;
	}
	
	void show() {
		System.out.println(year + "�� " + country + "������ " + artist + "�� �θ� " + title);
	}
}
