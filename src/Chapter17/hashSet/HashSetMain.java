package Chapter17.hashSet;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		// equals�� hashcode�� override�� String Type
		HashSet<String> hashset= new HashSet<String>();
		hashset.add(new String("����ȭ"));
		hashset.add(new String("������"));
		hashset.add(new String("��â��"));
		hashset.add(new String("�ߴ�"));
		hashset.add(new String("IZI"));
		
		System.out.println(hashset);
		hashset.add(new String("��â��"));
		System.out.println(hashset);
	}

}
