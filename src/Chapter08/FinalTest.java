package Chapter08;

import javax.swing.JOptionPane;

public class FinalTest {
	//�������(����)
	private static final int MAX=3;
	
	public static void main(String[] args) {
		//��������
		int num=0;
		
		for(int i=0; i<MAX;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("���Է�"));
			if(num > MAX) {
				System.out.println("�Է°��� 3���� �� Ů�ϴ�.");
			}//if
			else {
				System.out.println("�Է°��� 3���� ũ�� �ʽ��ϴ�.");
			}//else
		}//for
	}//main
}//class