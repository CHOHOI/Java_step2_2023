package Chapter14.Clone;

public class ExitMain {
	public static void main(String[] args) {
		
		for(int i=0 ; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				//System.exit(i);//main �޼ҵ忡�� ����
				break;//for�� ����
			}//if
			
		}//for
		System.out.println("�����ڵ�");
	}//main
}//class
