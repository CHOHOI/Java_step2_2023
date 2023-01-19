package Chapter16.generic2;

public class Water  extends Meterial{

	@Override
	public String toString() {
		
		return "재료는 water 입니다.";
	}

	@Override
	public void doprinting() {
		// TODO Auto-generated method stub
		System.out.println("물 재료는 불가능합니다.");
	}
	
}
