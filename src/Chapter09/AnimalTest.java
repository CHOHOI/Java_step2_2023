package Chapter09;
class Animal{

	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}	
class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void reading() {
	System.out.println("����� å�� �н��ϴ�.");
}

	}
class Tiger extends Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	public void hunting() {
	System.out.println("ȣ���̴� ����� �մϴ�.");
}
}
	class Eagle extends Animal{
		public void move() {
			System.out.println("�������� �ϴ��� ���ϴ�.");
		}
		public void flying() {
		System.out.println("�������� ������ ��� ���� �ٴմϴ�.");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest aTest=new AnimalTest();
		//Animal animal=new Human();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());

	}
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
