package Chapter14.Clone;

public class ExitMain {
	public static void main(String[] args) {
		
		for(int i=0 ; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				//System.exit(i);//main 메소드에서 나감
				break;//for문 종료
			}//if
			
		}//for
		System.out.println("종료코드");
	}//main
}//class
