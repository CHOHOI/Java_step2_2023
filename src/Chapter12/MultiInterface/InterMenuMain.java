package Chapter12.MultiInterface;

public class InterMenuMain implements Inter_Menu3{

	public static void main(String[] args) {
		InterMenuMain im=new InterMenuMain();
		
		//�θ� = �ڽ�
		Inter_Menu1 im1=im; //���ɽ���
		Inter_Menu2 im2=im; //���ɽ���
		Inter_Menu3 im3=im; //���ɽ���
		System.out.println("-------Inter_Menu1-------");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambbong());
		im1.show();
		
		System.out.println("-------Inter_Menu2-------");
		System.out.println(im2.tangsuyuck());
		
		System.out.println("-------Inter_Menu3-------");
		System.out.println(im3.boggembab());
		

	}

	@Override
	public String jajang() {
		
		return "�ϳ������� �ƴ� ¥���";
	}

	@Override
	public String jjambbong() {
		
		return "�����ϼ���";
	}

	@Override
	public String tangsuyuck() {
		
		return "���� ������";
	}

	@Override
	public String boggembab() {
		
		return "�ع� �������� ¯!!";
	}

}
