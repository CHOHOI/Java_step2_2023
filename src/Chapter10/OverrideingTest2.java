package Chapter10;

import Chapter09.Customer;
import Chapter09.VIPCustomer;

public class OverrideingTest2 {

	public static void main(String[] args) {
		//�θ�=�ڽ� (�ڵ�����ȯ)
		Customer vc=new VIPCustomer(10003, "��ġ", 20000);
		System.out.println(vc.showCustomer());

	}

}
