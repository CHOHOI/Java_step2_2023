package Chapter11;

public class MainBoard {
	public static void main(String[] args) {
		
	//�⺻���� 1�ܰ�
	Player player = new Player();
	player.play(1);
	
	//���� 2�ܰ�
	AdvencedLevel alevel=new AdvencedLevel();
	player.upgradeLevel(alevel);
	player.play(2);
	
	
	//���� �ܰ�
		SuperLevel slevel=new SuperLevel();
		player.upgradeLevel(slevel);
		player.play(3);
		}
}
