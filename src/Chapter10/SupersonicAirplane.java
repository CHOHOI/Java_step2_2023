package Chapter10;

public class SupersonicAirplane extends Airplane {
	// NORMAL =1 SUPERSONIC=2
	// �ʵ�(��������)
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL; // 1

	// �������̵��� �̿��Ͽ� flyMode�� SUPERSONIC�̸� ������ �����Դϴ�. �׷��� ������ Airplane�� fly�����մϴ�.
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("������ �����Դϴ�.");
			return;
		} else if (flyMode == NORMAL) {
			super.fly();
		} // if

	}// fly
}
