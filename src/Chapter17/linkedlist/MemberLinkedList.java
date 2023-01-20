package Chapter17.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import Chapter17.Member;

public class MemberLinkedList {

		private LinkedList<Member> linkedList;
		
		//�����ڸ� ���� LinkedList ��ü ����
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
				System.out.println(memberId+"�� �������� �ʴ� ID�Դϴ�.");
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
