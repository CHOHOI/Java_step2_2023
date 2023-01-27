package Chapter21.Inputstream;

import java.io.IOException;

public class SystemTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여개를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			while((i=System.in.read()) != '\n') {
				System.out.println((char)i); //문자
				System.out.println(i + " ");
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
