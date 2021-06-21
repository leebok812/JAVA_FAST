package ch13;

import java.util.Comparator;

//public class Member implements Comparable<Member>{
	public class Member implements Comparator<Member>{

	private int memberId; //ȸ�� ���̵�
	private String memberName; //ȸ�� �̸�
	
	
	public Member() {}
	
	
	public Member(int memberId, String memberName) { // ������
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [ȸ������ ���̵�= " + memberId + ", ȸ������ �̸�=" + memberName + " �Դϴ�.]";
	}

	@Override
	public int hashCode() {
		
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member) {
			Member member = (Member)obj;
			if( this.memberId == member.memberId) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	/*
	@Override
	public int compareTo(Member member) { 
		
		if(this.memberId > member.memberId) {
			return 1;  // ��������    -1
		}else if(this.memberId < member.memberId) {
			return -1;       //      1  �ϰ�� ���� ���� 
		}else {
			return 0;
		}
		
		
		return (this.memberId - member.memberId); // ���� ���� (this.memberId - member.memberId)* (-1) ��������
	}

	*/
	
	
	@Override
	public int compare(Member member1, Member member2) { //�ϳ��� �� �ϳ��� �񱳴��

		
		
		return (member1.memberId-member2.memberId);  //��������
		//return (member2.memberId-member1.memberId); //��������
	}
	
	
	
}
