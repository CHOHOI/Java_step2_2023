package Chapter11;

public class PhoneMain {

	public static void main(String[] args) {
		
		//Phone phone=new Phone();//(x)
		SmartPhone smartPhone = new SmartPhone("������");
		
		System.out.println(smartPhone.owner + "��");
		smartPhone.turnOn();
		smartPhone.intresearch();
		smartPhone.turnOff();
	}

}
