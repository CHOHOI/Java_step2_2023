package Chapter09;

public class CustomerMain {
	public static void main(String[] args) {

		// VIP ��
		System.out.println("-----------VIP��-----------");
		int price = 10000;
		VIPCustomer vipcs = new VIPCustomer(1004, "ȫ�浿", 900);

		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName() + "���� " + vipprice + "���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(vipcs.showCustomer());

		System.out.println("-----------�Ϲݰ�-----------");
		price = 10000;

		Customer customer = new Customer(1003, "ȫ����");
		int customerprice = customer.calcPrice(price);
		System.out.println(customer.getCustomerName() + "���� " + customerprice + "���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(customer.showCustomer());
	}
}
