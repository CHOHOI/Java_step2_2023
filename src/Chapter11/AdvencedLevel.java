package Chapter11;

public class AdvencedLevel extends PlayLevel {

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
		
	}

	@Override
	public void jump() {
		System.out.println("���� �����մϴ�.");
		
	}

	@Override
	public void turn() {
		System.out.println("�ݹ��� ���ϴ�.");
		
	}

	@Override
	public void showlevelMessage() {
		System.out.println("=====�߱��� �Դϴ�.=====");
		
	}
	
}
