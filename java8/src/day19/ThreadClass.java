package day19;

public class ThreadClass extends Thread{
	String name;
	
	public ThreadClass(String name) {
		this.name = name;
	}
	@Override
	public void run(){
		try {
			while(true) {
				System.out.println(name + "");
			}
		}catch(Exception e) {
				
			
		}
	}
}
