package Chapter09;

public class SuperMain {

	public static void main(String[] args) {
		
		Paprika obj=new Paprika();
		obj.set1("피망류", "여름", "노랑파프리카"); //부모클래스의 생성자
		obj.set2("빨강", 7000, "빨강파프리카"); //자식클래스의 생성자
		
		obj.Disp1();
		obj.Disp2();
	}

}
