package Chapter17.arraylist;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList= new MemberArrayList();
		//�������� ����
		Member memberHeo = new Member(1001, "����ȸ");
		Member memberjung = new Member(1002, "���ֹ�");
		Member memberYoon = new Member(1003, "������");
		Member memberChan = new Member(1004, "������");
		Member memberLee = new Member(1005, "�����");
		//ȸ������
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
