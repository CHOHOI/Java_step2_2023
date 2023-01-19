package Chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	//AllayList 선언
	private ArrayList<Member> arrayList;
	public MemberArrayList() {
		//heap 생성
		arrayList= new ArrayList<Member>();
		
	}
	//저장 :ArrayList에 add하는 메소드 
	public void addMember(Member member) {
		arrayList.add(member);
	}
	//삭제 :ArrayList에 REMOVE하는 메소드 
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
		System.out.println(memberId+"가 존재하지 않는 ID입니다.");
		return false;
	}
	
	//정보출력 메소드 : arrayList 출력하기
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
