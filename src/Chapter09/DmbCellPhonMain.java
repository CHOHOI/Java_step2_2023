package Chapter09;

public class DmbCellPhonMain {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델 : "+dmbCellPhone.model);
		System.out.println("색상 : "+dmbCellPhone.color);
		System.out.println("-----------------------");
		//DmbCellPhone의 필드
		System.out.println("채널 : " + dmbCellPhone.channel);
		System.out.println("-----------------------");
		//CellPhone의 메소드를 사용하여 전화통화 구현
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("안녕, 잘지내?");
		dmbCellPhone.receiveVoice("잘지내는 중이야!");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		System.out.println("-----------------------");
		//DmbCellPhone의 메소드를 사용하여 채널을 바꾸기
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(30);
		dmbCellPhone.turnOffDmb();
	}

}
