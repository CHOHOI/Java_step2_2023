package Chapter10;

public class Taxi extends Vehicle {
	
	private int TaxiNum = 1005;

	@Override
	public void run() {
		System.out.println(TaxiNum + "번의 택시가 달립니다.");
		
	}
}
