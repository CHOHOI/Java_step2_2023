package Chapter23;

import java.util.Random;

public class RunnersTest {
	
	int[] playerRandom=new int[5];
	String [] playerJump= {"","","","","" };
	
	boolean finish=false;
	int finishPlayer=0;
	
	public void run() {
		while(true) {
			//����Ÿ�
			for(int i=0; i<playerRandom.length;i++) {
				playerRandom[i]=new Random().nextInt(4);// 0~3
				
			}
			
			//0.1�� �������� �޽�
			try {
			 Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//�� �������� ����Ÿ� ����
			
			for(int i=0;i<playerJump.length;i++) {
				switch (playerRandom[i]) {
				
				case 0:
					playerJump[i] +="";
					break;
				case 1:
					playerJump[i] +="   ";
					break;
				case 2:
					playerJump[i] +="     ";
					break;
				case 3:
					playerJump[i] +="  ";
					break;
				case 4:
					playerJump[i] +="    ";
					break;

				}//switch
			}//for
			
			//�޸���
			System.out.println("==================================================================================");
			for(int i=0;i<playerJump.length;i++) {
				System.out.print(playerJump[i] );
				System.out.println(i+1+"��");
				
				if(playerJump[i].length() >= 50) {
					finishPlayer=i+1;
					finish=true;
				}
			}//for
			System.out.println("==================================================================================");
			
			//���
			if(finish) {
				System.out.println("WINNER : "+finishPlayer);
				break;
			}
			}//while
	}
}
