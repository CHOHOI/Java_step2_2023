package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyService {

	CompanyBasics cb = new CompanyBasics();
	Scanner scan = new Scanner(System.in);
	CompanyBasics c;
	ArrayList<CompanyBasics> workerArr = new ArrayList<CompanyBasics>();

	public CompanyService() {

	}

	public void saveWorker() {
		c = new CompanyBasics();
		System.out.print("�̸��� �Է��ϼ��� : ");
		c.setName(scan.next());
		System.out.print("�μ��� �Է��ϼ��� : ");
		c.setPart(scan.next());
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		c.setAddr(scan.next());
		System.out.print("������ �Է��ϼ��� : ");
		c.setBirthday(scan.next());

		workerArr.add(c);
	}

	public void search() {
		boolean run=true;
		if (workerArr.size() == 0) {
			System.out.println("����Ǿ� �ִ� ���� ������ �����ϴ�.");
		} else {
			System.out.print("ã������ ������ �̸��� �Է��ϼ��� :");
			String name = scan.next();
			
			for (int i = 0; i < workerArr.size(); i++) {
				if ((workerArr.get(i).getName()).equals(name)) {
					System.out.println(workerArr.get(i).toString());
					run=false;
					break;
				}//inner if
				
			}//for
			while (run) {
				System.out.println("ã������ ������ �̸��� �����ϴ�");
				run=false;
			}
		}//else

	}

}
