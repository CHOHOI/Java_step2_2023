package Chapter17;

public class Member2 {
	
	private int memberId;
	private String memberName;
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	@Override
	public int hashCode() {
		//memberName.hashCode() : String�̹Ƿ� 10����
		//return super.hashCode(); //10���� �޸� �ּ�
		//���1
		//return memberName.hashCode() +memberId;
		//���2
		return memberId;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member2 = (Member2)obj;
			return member2.memberName.equals(memberName) && (member2.memberId == memberId);				
		}else
			return false;
		
	}
	*/
	//���2
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member2=(Member2)obj;
			if(this.memberId==member2.memberId)
				return true;
		}
		return false;
	}
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}
	
	
	
}
