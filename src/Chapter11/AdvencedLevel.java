package Chapter11;

public class AdvencedLevel extends PlayLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 점프합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("반바퀴 돕니다.");
		
	}

	@Override
	public void showlevelMessage() {
		System.out.println("=====중급자 입니다.=====");
		
	}
	
}
