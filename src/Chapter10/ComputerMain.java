package Chapter10;

public class ComputerMain {

	public static void main(String[] args) {
		
		
		int r=10;
		Calculator calculator = new Calculator();
		System.out.println("������ : " + calculator.areaCircle(r));
		
		Computer cp = new Computer();
		System.out.println("������ : " +cp.areaCircle(r));

	}

}
