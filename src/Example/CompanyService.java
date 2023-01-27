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
		System.out.print("이름을 입력하세요 : ");
		c.setName(scan.next());
		System.out.print("부서를 입력하세요 : ");
		c.setPart(scan.next());
		System.out.print("주소를 입력하세요 : ");
		c.setAddr(scan.next());
		System.out.print("생일을 입력하세요 : ");
		c.setBirthday(scan.next());

		workerArr.add(c);
	}

	public void search() {
		boolean run=true;
		if (workerArr.size() == 0) {
			System.out.println("저장되어 있는 직원 정보가 없습니다.");
		} else {
			System.out.print("찾으려는 직원의 이름을 입력하세요 :");
			String name = scan.next();
			
			for (int i = 0; i < workerArr.size(); i++) {
				if ((workerArr.get(i).getName()).equals(name)) {
					System.out.println(workerArr.get(i).toString());
					run=false;
					break;
				}//inner if
				
			}//for
			while (run) {
				System.out.println("찾으려는 직원의 이름을 없습니다");
				run=false;
			}
		}//else

	}

}
