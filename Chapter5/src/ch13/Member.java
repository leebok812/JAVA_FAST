package ch13;

import java.util.Comparator;

//public class Member implements Comparable<Member>{
	public class Member implements Comparator<Member>{

	private int memberId; //회원 아이디
	private String memberName; //회원 이름
	
	
	public Member() {}
	
	
	public Member(int memberId, String memberName) { // 생성자
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
		return "Member [회원님의 아이디= " + memberId + ", 회원님의 이름=" + memberName + " 입니다.]";
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
			return 1;  // 오름차순    -1
		}else if(this.memberId < member.memberId) {
			return -1;       //      1  일경우 내림 차순 
		}else {
			return 0;
		}
		
		
		return (this.memberId - member.memberId); // 오름 차순 (this.memberId - member.memberId)* (-1) 내림차순
	}

	*/
	
	
	@Override
	public int compare(Member member1, Member member2) { //하나는 나 하나는 비교대상

		
		
		return (member1.memberId-member2.memberId);  //오름차순
		//return (member2.memberId-member1.memberId); //내림차순
	}
	
	
	
}
