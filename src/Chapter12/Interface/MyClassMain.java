package Chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {

       //X,Y MyInterface Ŭ���� Ÿ���� �ν��Ͻ� ������ �����Ͽ� ���
		
		MyClass mClass=new MyClass();
		
		X xClass=mClass; //X Ŭ���� Ÿ���� �ν��Ͻ� ����
		xClass.x();
		System.out.println("-----------------------");
		
		Y yClass=mClass; //Y Ŭ���� Ÿ���� �ν��Ͻ� ����
		yClass.y();
		System.out.println("-----------------------");
		
		MyInterface iClass=mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();

	}

}