package Chapter17.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import Chapter17.Member;

public class MemberLinkedList {

		private LinkedList<Member> linkedList;
		
		//생성자를 통한 LinkedList 객체 생성
		public MemberLinkedList() {
			linkedList= new LinkedList<Member>();
		}
		
		//addMember
		public void addMember(Member member) {
			linkedList.add(member);
		}
		//removeMember
		
			public boolean removeMember(int memberId) {
				Iterator<Member> it=linkedList.iterator();
				
				while(it.hasNext()) {
					Member member=it.next();
					int tempId=member.getMemberId();
					if(tempId == memberId) {
						linkedList.remove(member);
						return true;
					}
			
			}
				System.out.println(memberId+"가 존재하지 않는 ID입니다.");
				return false;
		}
		//showMember
			public void showAllMember() {
				for(Member member : linkedList) {
					System.out.println(member);
				}
				System.out.println();
			}
}
