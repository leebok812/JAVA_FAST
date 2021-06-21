package ch13;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;

	public MemberTreeSet() {
		treeSet = new TreeSet<>(new Member()); // campare to 로 할경우 괄호안 new Member()구현해야함 + Member.java에 default생성자도
	}

	public void addMember(Member member) {
		treeSet.add(member);
	}

	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();

		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
