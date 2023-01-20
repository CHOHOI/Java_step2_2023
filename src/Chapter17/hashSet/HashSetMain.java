package Chapter17.hashSet;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		// equals와 hashcode가 override된 String Type
		HashSet<String> hashset= new HashSet<String>();
		hashset.add(new String("엄정화"));
		hashset.add(new String("박현정"));
		hashset.add(new String("임창정"));
		hashset.add(new String("야다"));
		hashset.add(new String("IZI"));
		
		System.out.println(hashset);
		hashset.add(new String("임창정"));
		System.out.println(hashset);
	}

}
