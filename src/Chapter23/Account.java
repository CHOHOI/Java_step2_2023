package Chapter23;

public class Account {
	
	int balance = 1000; //�ܾ�
	//��ݸ޼ҵ�
	public synchronized void withdraw(int money) {
		if(balance <money) {
			try {
				wait(); //�����尡 ���������� ���� ���¿� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		balance-=money;
	}
	//�Աݸ޼���
	public synchronized void deposit(int money) {
		balance+=money;
		notify();//������ ������ ����
	}
}
/*
��Ƽ������ ȯ�濡�� ����ؾ��� �����尣�� ����ȭ
���� ��� �׷��尣�� �����ϴ� Data�� �����ҽ� �����ϰ� �����ϴ� �������� ����ȭ�� ���� ���Ѿ� �Ѵ�.
�ڹٿ����� synchronized Ű����� Ű����� ����ȭ�� �����ش�
*/