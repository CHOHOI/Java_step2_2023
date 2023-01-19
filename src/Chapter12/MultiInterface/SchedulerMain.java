package Chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
       
       while(true) {
    	   System.out.println();
    	   System.out.println("R or r : �Ѹ� ���ʷ� �Ҵ�");
    	   System.out.println("L or l : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
    	   System.out.println("P or p : ���� skill ���� ���� �������� �Ҵ�");
    	   System.out.println("S or s : ����");
    	   System.out.print("��ȭ ��� ����� �����ϼ��� : ");
    	   
    	    //���ڸ� �ƽ�Ű�ڵ�� ����ȯ
    	    //���1
    	    //charAt(0) : ����(char) �Ǵ� ���ڿ�(String) => ASCII �� int
			//char input=scan.next().charAt(0); 
			//System.in.read() : �ֿܼ� �Է¹ޱ� ��� �̷°��� �ƽ�Ű�ڵ尪
			//int ch=System.in.read(); //�ƽ�Ű�ڵ尪
			//���2
			String mun = scan.nextLine();
			int ch = mun.charAt(0); //charAt(0):String -> ACSII(int)
			
			Scheduler scheduler =null;
	         
			//��ü�� ����
			if (ch == 'R' || ch == 'r') {
				scheduler = new RoundRobin();
			} else if (ch == 'L' || ch == 'l') {
				scheduler = new LeastJob();
			} else if (ch == 'P' || ch == 'p') {
				scheduler = new PriorityAllocation();
			} else if (ch == 'S' || ch == 's') {
				System.out.println("������ �����մϴ�.");
				break;
			} else {
				System.out.println("�������� �ʴ� ����Դϴ�.");
				continue; //����
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
       }
		
	}

}
