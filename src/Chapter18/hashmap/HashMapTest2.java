package Chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
	
	public static void main(String[] args) {
		//Map<String integer> 생성 map
		Map<String,Integer> map = new HashMap<String, Integer>();
		//팀원 데이터(성함,학번) 저장
		map.put("허초회", 100);
		map.put("전솔민", 101);
		map.put("김찬희", 102);
		map.put("윤영훈", 103);
		map.put("이재민", 104);
		map.put("장여주", 105);
		//팀원의 인원
		System.out.println("총 팀원의 수 : "+  map.size());
		//팀장의 학번을 알아내자
		System.out.println("팀장의 학번");
		System.out.println(map.get("허초회"));
		//팀원 모두의 학번 출력
		System.out.println("총 팀원의 수 : "+map.size());
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
