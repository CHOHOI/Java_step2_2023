package Chapter12.Interface;

public class SmartTelevision implements Remote, Searchable{

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Remote.MAX_VOLUME) {
			this.volume=Remote.MAX_VOLUME;
		}else if(volume < Remote.MAX_VOLUME) {
			this.volume=Remote.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("���� TV ���� : "+this.volume);
		
	}

	@Override
	public void seatch(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
		
	}
	
}
