package Chapter14.Clone;

public class ObjectCloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10,20,30);
		Circle circleCopy=(Circle)circle.clone();
		System.out.println(circle);
		System.out.println(circleCopy);
		
		//hash °ª
		System.err.println(System.identityHashCode(circleCopy));
		System.err.println(System.identityHashCode(circle));
	}

}
