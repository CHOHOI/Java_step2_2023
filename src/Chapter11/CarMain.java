package Chapter11;

public class CarMain {
/*
	public static void main(String[] args) {
		method(new ManualCar());
		System.out.println("=======================");
		method(new AiCar());

	}

	public static void method(Car car) {
		car.drive();
		car.stop();
	}
	*/
	
	
	public static void main(String[] args) {
		
		System.out.println("===========��������===========");
		Car mycar=new AiCar();
		mycar.run();
		System.out.println("===========����� ����===========");
		Car hiscar=new ManualCar();
		hiscar.run();
	}
	
	
}
