package Chapter11;

public class SuperLevel extends PlayLevel{
	@Override
	public void run() {
		System.out.println("�ſ� ���� �޸��ϴ�.");
		
	}

	@Override
	public void jump() {
		System.out.println("�ſ� ���� �����մϴ�.");
		
	}

	@Override
	public void turn() {
		System.out.println("�ѹ��� ���ϴ�.");
		//�ѹ��� ���ϴ�
	}

	@Override
	public void showlevelMessage() {
		System.out.println("=====����� �Դϴ�.=====");
		
	}
	
}
