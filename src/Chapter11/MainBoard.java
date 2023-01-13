package Chapter11;

public class MainBoard {
	public static void main(String[] args) {
		
	//기본게임 1단계
	Player player = new Player();
	player.play(1);
	
	//레벨 2단계
	AdvencedLevel alevel=new AdvencedLevel();
	player.upgradeLevel(alevel);
	player.play(2);
	
	
	//레벨 단계
		SuperLevel slevel=new SuperLevel();
		player.upgradeLevel(slevel);
		player.play(3);
		}
}
