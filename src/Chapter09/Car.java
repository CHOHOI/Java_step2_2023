package Chapter09;

public class Car {
	public int speed;
	public void speedUp() {
		speed+=1;
	}
	//override�Ұ����� �޼ҵ�
	public final void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
		speed=0;

	}
}
