package Chapter21.Inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamTest5 {

	public static void main(String[] args) {
		
		try (FileOutputStream fos= new FileOutputStream("resource.txt", true);//정장
				FileInputStream fis = new FileInputStream("resource.txt")){
			//쓰기
			fos.write(65);//A 대용되는 문자로 저장
			fos.write(66);//B 대용되는 문자로 저장
			fos.write(67);//C 대용되는 문자로 저장
			//읽기
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
