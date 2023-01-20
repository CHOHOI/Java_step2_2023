package Chapter17.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Mycompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareToIgnoreCase(s2)*-1;//*-1:��������
	}
	
}
public class ComparatorTest2 {
	
	public static void main(String[] args) {
		//default�� �������̵� �Ǿ� �ִ� String / Integer
		//��������
		Set<String> set = new TreeSet<String>(new Mycompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		System.out.println(set);
	}
}
