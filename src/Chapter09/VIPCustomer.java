package Chapter09;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		// this.customerID=customerID;
		// this.customerName=customerName;
		customerGrade = "VIP";
		bonusPoint = 0.05;
		this.agentID = agentID;// ���� ����
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint = (price - (int) (price * saleRatio)) * bonusPoint;
		return price - (int) (price * saleRatio); // ���ǰ���
	}

	@Override
	public String showCustomer() {

		return super.showCustomer() + "\n����������" + agentID + "�Դϴ�.";
	}

	public int getAgentID() {
		return agentID;
	}

}