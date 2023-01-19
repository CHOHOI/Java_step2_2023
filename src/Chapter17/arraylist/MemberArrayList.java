package Chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	//AllayList ����
	private ArrayList<Member> arrayList;
	public MemberArrayList() {
		//heap ����
		arrayList= new ArrayList<Member>();
		
	}
	//���� :ArrayList�� add�ϴ� �޼ҵ� 
	public void addMember(Member member) {
		arrayList.add(member);
	}
	//���� :ArrayList�� REMOVE�ϴ� �޼ҵ� 
	public boolean removeMember(int memberId) {
		Iterator<Member> it=arrayList.iterator();
		
		while(it.hasNext()) {
			Member member=it.next();
			int tempId=member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"�� �������� �ʴ� ID�Դϴ�.");
		return false;
	}
	
	//������� �޼ҵ� : arrayList ����ϱ�
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
