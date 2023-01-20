package Chapter17.treeset;

public class MemberTreeSetMain {

	public static void main(String[] args) {

		MemberTreeSet memberTreeset = new MemberTreeSet();

		Member3 memberPark = new Member3(1003, "¹Ú½ÃÇè");
		Member3 memberKim = new Member3(1004, "±èÀÚ¹Ù");
		Member3 memberLee = new Member3(1005, "ÀÌÀÌ½ã");
		
		memberTreeset.addMember(memberPark);
		memberTreeset.addMember(memberKim);
		memberTreeset.addMember(memberLee);
		
		memberTreeset.showAllMember();
	}

}
