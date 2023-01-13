package Chapter11;

public class SmartPhone extends Phone {
	//부모클래스 로딩시
	//부모 클래스의 생성자를 오버로딩시 기본 생성자를 인식하지 못하므로 추상클래스로 정의한다.
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void intresearch() {
		System.out.println("인테넷 검색을 합니다.");
	}

}
