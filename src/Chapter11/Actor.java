package Chapter11;

import java.util.Scanner;

public class Actor {
	public static void main(String[] args) {
		
	
	/*
	 �Ʒ��� ����� �ݿ��ϴ� ���α׷��� �ۼ��غ���.
 		�˻��� ��� : �����
		[�����]
		���ϵ�
		������ �׳�
		�����ϰ� �����ϰ�  ---> �˻��� ����� �̷�� �� ���.
		
		�˻��� ��� : ��
		�ش��찡 �������� �ʽ��ϴ� ---> �˻��� ����� �̷������ ���� ���. 
	 
	 */
	
	//3�� 2�� �ʱ�ȭ
	String[][] actor = { {"[�۰�ȣ]", "����", "����", "����"},
						 {"[�����]","���ϵ�","�����ѱ׳�", "�����ϰ� �����ϰ�"},
						 {"[�̺���]","��������","����","����"}
						};
	
	int cnt=0;
	
	System.out.print("�˻��� ��� : ");
	Scanner scan = new Scanner(System.in);
	String actName = scan.next();
	
	for(int i=0; i<actor.length;i++) {
		if(actor[i][0].equals("["+actName+"]")){//�˻��� ��찡 �ִ��� ������ �Ǵ�
		for(int j=0; j<actor[i].length;j++) {
			System.out.println(actor[i][j]);
		}
		}else {
			cnt++;
			if(cnt>actor.length) {
				System.out.println("�ش��찡 �������� �ʽ��ϴ�.");
			}
		}
	}
	
	/*
	while (run) {
		System.out.print("�˻��� ��� : ");
		String actName = scan.next();
		switch (actName) {
		case "�۰�ȣ":
			for(int i=0; i<actor[0].length;i++)
				System.out.println(actor[0][i]);
			break;
		case "�����":
			for(int i=0; i<actor[1].length;i++)
				System.out.println(actor[1][i]);
			break;
		case "�̺���":
			for(int i=0; i<actor[2].length;i++)
				System.out.println(actor[2][i]);
			break;

		default:
			System.out.println("�ش��찡 �������� �ʽ��ϴ�.");
			run = false;
			break;
		}
	}//while
	
*/
	}//main
}//class
