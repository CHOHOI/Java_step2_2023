package Chapter19.Lambda;


public class TestAdd {
	
	public static void main(String[] args) {
		//Lambda : �޼ҵ� �̸��� ���� �����θ� ������
		Add addF = (x, y) -> x + y;
		
		int a = addF.add(4, 5);
		
		System.out.println(addF.add(3, 5));
		System.out.println(a);
		
	}

}
