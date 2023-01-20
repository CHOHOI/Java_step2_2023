package Chapter17.hashSet;

import java.util.HashSet;
import java.util.Set;

import Chapter17.Member2;

public class MemberHashSetMain {

	public static void main(String[] args) {
		
		Set<Member2> set =new HashSet<Member2>();
		
		set.add(new Member2(30,"È«±æµ¿"));
		set.add(new Member2(30,"È«±æµ¿"));//ÀúÀåµÇ¸é ¾ÈµÊ
		
		System.out.println("ÃÑ °´Ã¼¼ö : "+set.size());
	}

}
