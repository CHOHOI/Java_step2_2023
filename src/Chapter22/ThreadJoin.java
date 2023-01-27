package Chapter22;

public class ThreadJoin implements Runnable {

	public static void main(String[] args) {
		System.out.println("����Ŭ���� ����!");
		
		ThreadJoin t1=new ThreadJoin();
		Thread JThread=new Thread(t1);
		JThread.start();
		
		System.out.println("����Ŭ���� ����!");
		
		try {
			JThread.join();//run()�޼���� Main()�޼��尡 join�� �Ǿ� run()�� ������ ���� �� ������ ��ٸ�(�� -> �Ʒ�)
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//==============================================================
	@Override
	public void run() {

		System.out.println("run() �޼��� ����!");
		first();
	}
	
	public void first() {
		System.out.println("first() �޼��� ����!");
		second();
	}
	public void second() {
		System.out.println("second() �޼��� ����!");
	}
}

