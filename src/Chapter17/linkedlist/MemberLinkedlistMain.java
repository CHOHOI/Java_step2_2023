package Chapter17.linkedlist;

import Chapter17.Member;


public class MemberLinkedlistMain {
	public static void main(String[] args) {
		MemberLinkedList memberLinkedList= new MemberLinkedList();
		//�������� ����
		
		//�������� ����
		Member memberHeo = new Member(1001, "����ȸ");
		Member memberjung = new Member(1002, "���ֹ�");
		Member memberYoon = new Member(1003, "������");
		Member memberChan = new Member(1004, "������");
		Member memberLee = new Member(1005, "�����");
		//ȸ������
		memberLinkedList.addMember(memberHeo);
		memberLinkedList.addMember(memberjung);
		memberLinkedList.addMember(memberYoon);
		memberLinkedList.addMember(memberChan);
		memberLinkedList.addMember(memberLee);
		
		memberLinkedList.showAllMember();
		memberLinkedList.removeMember(memberHeo.getMemberId());
		memberLinkedList.showAllMember();
	}
}
