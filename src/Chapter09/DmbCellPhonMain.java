package Chapter09;

public class DmbCellPhonMain {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : "+dmbCellPhone.model);
		System.out.println("���� : "+dmbCellPhone.color);
		System.out.println("-----------------------");
		//DmbCellPhone�� �ʵ�
		System.out.println("ä�� : " + dmbCellPhone.channel);
		System.out.println("-----------------------");
		//CellPhone�� �޼ҵ带 ����Ͽ� ��ȭ��ȭ ����
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("�ȳ�, ������?");
		dmbCellPhone.receiveVoice("�������� ���̾�!");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		System.out.println("-----------------------");
		//DmbCellPhone�� �޼ҵ带 ����Ͽ� ä���� �ٲٱ�
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(30);
		dmbCellPhone.turnOffDmb();
	}

}
