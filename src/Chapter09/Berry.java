package Chapter09;

public class Berry extends Fruit {
	public String name;
	public String size;
	
	// setter
	public void set2(String a, String b) {
		name = a;
		size = b;
	}

	// getter
	public void Disp2() {
		System.out.println("�̸�" + name);
		System.out.println("ũ��" + size);
	}
}
