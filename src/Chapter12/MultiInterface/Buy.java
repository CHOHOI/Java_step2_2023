package Chapter12.MultiInterface;

public interface Buy {
	
	void buy();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}

}