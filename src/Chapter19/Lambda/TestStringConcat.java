package Chapter19.Lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		
		//�ν��Ͻ� ����
		System.out.println("-----�ν��Ͻ� ����-----");
		StringConcatImple sc = new StringConcatImple();
		sc.makeString(s1, s2);
		
		//���ٽ� ���
		System.out.println("-----���ٽ� ���-----");
		StringConcat sc2 = (s, v) -> System.out.println(s + ", " + v);
		sc2.makeString("Hello", "World");
		
		//�͸��� ���� Ŭ����
		System.out.println("-----�͸��� ���� Ŭ���� ���-----");
		StringConcat sc3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		
		sc2.makeString(s1, s2);

	}

}

