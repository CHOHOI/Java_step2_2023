package Chapter17.linkedlist;

import Chapter17.Member;


public class MemberLinkedlistMain {
	public static void main(String[] args) {
		MemberLinkedList memberLinkedList= new MemberLinkedList();
		//ÆÀ¿øµéÀÇ Á¤º¸
		
		//ÆÀ¿øµéÀÇ Á¤º¸
		Member memberHeo = new Member(1001, "ÇãÃÊÈ¸");
		Member memberjung = new Member(1002, "Àü¼Ö¹Î");
		Member memberYoon = new Member(1003, "À±¿µÈÆ");
		Member memberChan = new Member(1004, "±èÂùÈñ");
		Member memberLee = new Member(1005, "ÀÌÀç¹Î");
		//È¸¿ø°¡ÀÔ
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
