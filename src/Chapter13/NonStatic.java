package Chapter13;

import javax.swing.JOptionPane;

class Out{
	
	//�ʵ�
	static int a=1;
	
	//������
	
	//�޼ҵ�
	
	//���� Ŭ����
	public class In{
		
		//�ʵ�
		
		//����Ʈ ������
		
		//�޼ҵ�
		public String  Infun() {
			
			return (a+"��° Non-Static ���� �ǽ�");
		}
		
	}//inner class
}//outter class


public class NonStatic {

	public static void main(String[] args) {
		//1.�ٱ� Ŭ���� ��ü
		Out obj1=new Out();
		//2.���� Ŭ���� ��ü
		Out.In obj2=obj1.new In();
		//3.���ο� �ִ� �޼ҵ�
		String str=obj2.Infun();
		
		JOptionPane.showMessageDialog(null, str+"\n Success");
	}

}
