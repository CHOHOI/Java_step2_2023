package Chapter12.MultiInterface;

public interface Sell{
	
	void sell();
	
	//���� �̸��� default�޼ҵ�� ������ �� �����Ƿ� �������̵�
	//���� �������̵� �޼ҵ尡 ��µ�
	/*
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}*/
	
	default void sellorder() {
		System.out.println("�Ǹ� �ֹ�");
	}

}
