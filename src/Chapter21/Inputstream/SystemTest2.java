package Chapter21.Inputstream;

import java.io.IOException;

public class SystemTest2 {

	public static void main(String[] args) {
		System.out.println("���ĺ� ������ ���� [Enter]�� ��������");
		
		int i;
		try {
			while((i=System.in.read()) != '\n') {
				System.out.println((char)i); //����
				System.out.println(i + " ");
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
