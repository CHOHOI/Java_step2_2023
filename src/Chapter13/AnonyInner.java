package Chapter13;

public class AnonyInner {
	
	public void test() {
		
		new TestInter() {  //TestInter ti=new TestInter   -> ti.printData()
			@Override
			public void printData() {
				System.out.println("ȭ����!!!");	
			}//�߻�޼ҵ� ����
		}.printData();
		
	}//�޼ҵ� ��
	public static void main(String[] args) {
		
		AnonyInner in=new AnonyInner();
		in.test();

	}

}
