package Chapter15;

public class StBufferMain {
	public static void main(String[] args) {
		
		StringBuffer buf=new StringBuffer("Nice Day");
		
		System.out.println(buf.toString());
		System.out.println(buf.length());//���ڼ�
		//StringBuffer�� �⺻ �뷮 16 + �߰�(8) = 24
		System.out.println(buf.capacity());
		//24�� �Ѿ�� �㿵����(25~50)������ 50 /51~:���� �ִ� �뷮
		buf.ensureCapacity(25);
		System.out.println(buf.capacity());
		buf.insert(0, "Hi! ");
		System.out.println(buf);
		buf.insert(12, " Everybody! ");
		System.out.println(buf);
		buf.delete(0, 4);
		System.out.println(buf);
	}
}
