package Chapter21.Inputstream;

import java.io.IOException;

public class SystemTest {

	public static void main(String[] args) {
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		
		int i;
		try {
			i= System.in.read();
			System.out.println(i);//�ƽ�Ű�ڵ�
			System.out.println((char)i); //����
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
