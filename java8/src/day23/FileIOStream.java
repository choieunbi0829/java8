package day23;

import java.io.FileReader;
import java.io.IOException;

public class FileIOStream {
	static String tfile;
	public static void main(String[] args) {
		int cnt;
		char chr;
		if(args.length !=1) {
			System.out.println("매개변수로 텍스트 파일 이름을 입력하세요");
			System.exit(1);
		}
		tfile = args[0];
		FileReader fr;
		try {
			fr = new FileReader(tfile);
			System.out.println("파일 이름:" + tfile);
			System.out.println("-----------------");
			while((cnt=fr.read()) != -1) {
				chr =(char)cnt;
				System.out.print(chr);
			}
		}catch(IOException e) {
			System.out.println(e.toString());
/*		}finally {
			try {
			if(fr != null)
					fr.close();
				} catch (IOException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
			}
		*/
	
		}
	}	
}
