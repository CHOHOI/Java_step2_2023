package Chapter17.hashSet;

import Chapter17.Member;
import Chapter17.Member2;
import Chapter17.linkedlist.MemberLinkedList;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSetList = new MemberHashSet();
		//�������� ����
		
		//�������� ����
		Member2 memberHeo = new Member2(1001, "����ȸ");
		Member2 memberjung = new Member2(1002, "���ֹ�");
		Member2 memberYoon = new Member2(1003, "������");
		Member2 memberChan = new Member2(1004, "������");
		Member2 memberLee = new Member2(1005, "�����");
		//ȸ������
		memberHashSetList.addMember(memberHeo);
		memberHashSetList.addMember(memberjung);
		memberHashSetList.addMember(memberYoon);
		memberHashSetList.addMember(memberChan);
		memberHashSetList.addMember(memberLee);
		
		memberHashSetList.showAllMember();
		//���1
		//Member2 memberKim=new Member2(1008, "�ڼ���");
		//���2
		Member2 memberKim=new Member2(1003, "������");
		memberHashSetList.removeMember(memberHeo.getMemberId());
		memberHashSetList.showAllMember();

	}

}
