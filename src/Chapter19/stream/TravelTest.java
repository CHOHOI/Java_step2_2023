package Chapter19.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		List<TravelCustomer> customerList = new ArrayList<>();
		
		//��ü ����
		TravelCustomer tc1 = new TravelCustomer("�̼���", 30, 28000);
		TravelCustomer tc2 = new TravelCustomer("������", 20, 35000);
		TravelCustomer tc3 = new TravelCustomer("ȫ�浿", 18, 25000);
		//�߰�
		customerList.add(tc1);
		customerList.add(tc2);
		customerList.add(tc3);
		
		System.out.println("--�� ��� �߰��� ������� ���--");
		//map : �����͸� Ư�����ǿ� �ش��ϴ� ������ ��ȯ�� ��
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		System.out.println();
		//mapToInt : int�� �ڷ�� ��ȯ
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		//filter : Ư�� ���ǿ� �´� �����͸� �ɷ�����
		System.out.println("-----20�� �̻��� ���� �̸��� �����Ͽ� ���-----");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
		

	}

}
