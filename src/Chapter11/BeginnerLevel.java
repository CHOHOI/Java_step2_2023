package Chapter11;

public class BeginnerLevel extends PlayLevel {

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
		
	}

	@Override
	public void jump() {
		System.out.println("jump�� �Ұ��� �մϴ�.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn�� �Ұ��� �մϴ�.");
		//�ѹ��� ���ϴ�
	}

	@Override
	public void showlevelMessage() {
		System.out.println("=====�ʺ��� �Դϴ�.=====");
		
	}
	
	
}
