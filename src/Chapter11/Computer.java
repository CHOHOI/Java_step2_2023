package Chapter11;
//�� �ϳ��� �߻�޼ҵ尡 �����ϸ� �ݵ�� abstract�� �����ؾ���
//�߻� Ŭ����
public abstract class Computer {
	
	//�߻�޼ҵ� : body�� ����
	public abstract void display() ;
	public abstract void typing() ;
	
	//�Ϲ� �޼ҵ�

	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}

	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
		
	
}
