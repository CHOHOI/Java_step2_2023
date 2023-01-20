package Chapter17.hashSet;

import Chapter17.Member;
import Chapter17.Member2;
import Chapter17.linkedlist.MemberLinkedList;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSetList = new MemberHashSet();
		//ÆÀ¿øµéÀÇ Á¤º¸
		
		//ÆÀ¿øµéÀÇ Á¤º¸
		Member2 memberHeo = new Member2(1001, "ÇãÃÊÈ¸");
		Member2 memberjung = new Member2(1002, "Àü¼Ö¹Î");
		Member2 memberYoon = new Member2(1003, "À±¿µÈÆ");
		Member2 memberChan = new Member2(1004, "±èÂùÈñ");
		Member2 memberLee = new Member2(1005, "ÀÌÀç¹Î");
		//È¸¿ø°¡ÀÔ
		memberHashSetList.addMember(memberHeo);
		memberHashSetList.addMember(memberjung);
		memberHashSetList.addMember(memberYoon);
		memberHashSetList.addMember(memberChan);
		memberHashSetList.addMember(memberLee);
		
		memberHashSetList.showAllMember();
		//¹æ¹ı1
		//Member2 memberKim=new Member2(1008, "¹Ú¼ö·Å");
		//¹æ¹ı2
		Member2 memberKim=new Member2(1003, "±èÁø¼ö");
		memberHashSetList.removeMember(memberHeo.getMemberId());
		memberHashSetList.showAllMember();

	}

}
