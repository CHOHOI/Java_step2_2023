package Chapter17.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import Chapter17.Member;
import Chapter17.Member2;

public class MemberHashSet {
	
	private HashSet<Member2> hashSet;
	
	//�����ڸ� ���� LinkedList��ü ����
	public MemberHashSet() {
		hashSet=new HashSet<Member2>();
	}
	
	//addMember
 	public void addMember(Member2 member) {
 		hashSet.add(member);
	}
	
	//removeMember
 	public boolean removeMember(int memberId) {
		 Iterator<Member2> ir=hashSet.iterator();
		 
		 while(ir.hasNext()) {
			 Member2 member=ir.next();
			 int tempId=member.getMemberId();
			 if(tempId == memberId) {
				 hashSet.remove(member);
				 return true;
			 }
		 }
		 System.out.println(memberId+"�� �������� �ʽ��ϴ�");
		 return false;
	}
	
	//showAllMember
 	public void showAllMember() {
		for(Member2 member:hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}