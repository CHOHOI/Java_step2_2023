package Chapter21.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=null;
		fos=new FileOutputStream("output3.txt");
		
		fos.write(71);
		fos.write(72);
		fos.write(73);
		
		fos.flush();//��¹��� ����
		fos.close();
		System.out.println("������ ���� �Ǿ����ϴ�.");
	}

}
