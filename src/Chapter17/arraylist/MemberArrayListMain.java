package Chapter17.arraylist;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList= new MemberArrayList();
		//ÆÀ¿øµéÀÇ Á¤º¸
		Member memberHeo = new Member(1001, "ÇãÃÊÈ¸");
		Member memberjung = new Member(1002, "Àü¼Ö¹Î");
		Member memberYoon = new Member(1003, "À±¿µÈÆ");
		Member memberChan = new Member(1004, "±èÂùÈñ");
		Member memberLee = new Member(1005, "ÀÌÀç¹Î");
		//È¸¿ø°¡ÀÔ
		memberArrayList.addMember(memberHeo);
		memberArrayList.addMember(memberjung);
		memberArrayList.addMember(memberYoon);
		memberArrayList.addMember(memberChan);
		memberArrayList.addMember(memberLee);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberHeo.getMemberId());
		memberArrayList.showAllMember();
	}

}
