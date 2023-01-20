package Chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
	
	public static void main(String[] args) {
		//Map<String integer> ���� map
		Map<String,Integer> map = new HashMap<String, Integer>();
		//���� ������(����,�й�) ����
		map.put("����ȸ", 100);
		map.put("���ֹ�", 101);
		map.put("������", 102);
		map.put("������", 103);
		map.put("�����", 104);
		map.put("�忩��", 105);
		//������ �ο�
		System.out.println("�� ������ �� : "+  map.size());
		//������ �й��� �˾Ƴ���
		System.out.println("������ �й�");
		System.out.println(map.get("����ȸ"));
		//���� ����� �й� ���
		System.out.println("�� ������ �� : "+map.size());
		Set<String> ketSet=map.keySet();
		Iterator<String> keyIterator=ketSet.iterator();
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println(key + " : "+value);
		}
		System.out.println();
		
		
				
	}
}
