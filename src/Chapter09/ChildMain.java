package Chapter09;

public class ChildMain {

	public static void main(String[] args) {


		Child child = new Child();
		child.method1();//부모꺼
		child.method2();//자식꺼
		child.method3();//자식꺼
		
		System.out.println();		
		Parent parent1 = new Parent();
		parent1.method1();
		parent1.method2();
		//독립적으로 부모클래스만 사용
		System.out.println();
		Parent parent2 =child;
		parent2.method1();
		parent2.method2();
	}

}
