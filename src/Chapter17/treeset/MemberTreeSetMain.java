package Chapter17.treeset;

public class MemberTreeSetMain {

	public static void main(String[] args) {

		MemberTreeSet memberTreeset = new MemberTreeSet();

		Member3 memberPark = new Member3(1003, "�ڽ���");
		Member3 memberKim = new Member3(1004, "���ڹ�");
		Member3 memberLee = new Member3(1005, "���̽�");
		
		memberTreeset.addMember(memberPark);
		memberTreeset.addMember(memberKim);
		memberTreeset.addMember(memberLee);
		
		memberTreeset.showAllMember();
	}

}
