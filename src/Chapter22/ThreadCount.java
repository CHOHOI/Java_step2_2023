package Chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable {
	
	private int n;
	
	public ThreadCount(int n) {
		this.n=n;
	}
	public static void main(String[] args) {
		/*��ĳ�ʸ� �̿��Ͽ� Ű���忡 ���ڸ� �Է¹ް�
		 * �Է¹��� ���ڰ� 1�� �����ϴٰ� 0�� �Ǿ��� ��
		 * "����"��� �޼����� �Բ� �����带 ������������ �����Ͻÿ�.
		 */
		System.out.println("���� �Է��ϼ��� : ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		ThreadCount tc=new ThreadCount(num);
		//������ ��ü �� ����
		Thread t=new Thread(tc);
		t.start();
	}
	@Override
	public void run() {
		int i=n;
		for(i=n; i>=1;i--) {
			
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				 e.printStackTrace();
			}
		}
		System.out.println("����");
	}
}
