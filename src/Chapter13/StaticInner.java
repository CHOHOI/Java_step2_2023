package Chapter13;

public class StaticInner {
	
	int a=10;
	private int b=100;
	static int c=200; //Data���� �޸�
	
	//������
	//�޼ҵ�
	//���� Ŭ����
	static class Inner{
		//�ʵ�
		static int d=1000;
		//������
		//�޼ҵ�
		public void printData() {
			//a�� b�� static�� �ƴϿ��� �����Ϳ������� ����� �� ����
			//System.out.println("int a : "+a);
			//System.out.println("privaet int b : "+b);
			System.out.println("static c : "+c);
			System.out.println("static d : "+d);
		}
		
	}
	
	public static void main(String[] args) {
		Inner inner=new Inner();
		inner.printData();
		
		
	}

}

