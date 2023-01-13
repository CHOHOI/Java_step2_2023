package Chapter11;

public class SuperLevel extends PlayLevel{
	@Override
	public void run() {
		System.out.println("매우 빨리 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("매우 높게 점프합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 돕니다.");
		//한바퀴 돕니다
	}

	@Override
	public void showlevelMessage() {
		System.out.println("=====상급자 입니다.=====");
		
	}
	
}
