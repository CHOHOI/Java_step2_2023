package Chapter09;

public class Fruit {
	private String sort;//�з�
	private String season;//��������
	
	//������
	
	//setter
	public void set1(String a,String b) {
		sort = a;
		season = b;
	}
	//getter
	public void Disp() {
		System.out.println("�з�" + sort);
		System.out.println("����" + season);
	}
	
}
