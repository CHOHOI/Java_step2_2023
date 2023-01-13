package Chapter11;
//단 하나라도 추상메소드가 존재하면 반드시 abstract를 선언해야함
//추상 클래스
public abstract class Computer {
	
	//추상메소드 : body가 없다
	public abstract void display() ;
	public abstract void typing() ;
	
	//일반 메소드

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
		
	
}
