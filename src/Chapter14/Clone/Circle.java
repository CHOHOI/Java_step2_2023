package Chapter14.Clone;

public class Circle implements Cloneable{
	Point point;
	int radius;
	
	public Circle(int x, int y,int radius) {
		//�����ڸ� ���ؼ� �ٸ� Ŭ������ ��ü����
		point= new Point(x,y);
		this.radius=radius;
	}
//Ŭ������ü ����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		
		return "������ " + point + "�̰� , " + "�������� "+radius;
	}
	
}
