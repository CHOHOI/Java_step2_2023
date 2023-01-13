package Chapter11;

public class Player {
	
	private PlayLevel level;
	
	public Player() {
		level=new BeginnerLevel(); 
		level.showlevelMessage();
	}
	
	public PlayLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayLevel level) {
		this.level=level;
		level.showlevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
}
