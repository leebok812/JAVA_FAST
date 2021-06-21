package ch13;

import java.util.Comparator;
import java.util.TreeSet;


class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2)*(-1);
	}
	
}


public class MemberTreeSetTest {

	public static void main(String[] args) {

		/*
		 * TreeSet<String> set = new TreeSet<String>();
		 * 
		 * set.add("ȫ�浿"); set.add("������"); set.add("�̼���");
		 * 
		 * System.out.println(set);
		 */
		/*
		MemberTreeSet memberTreeSet = new MemberTreeSet();

		Member memberLee = new Member(1004, "�̼���");
		Member memberKim = new Member(1001, "������");
		Member memberKang = new Member(1002, "������");
		Member memberHong = new Member(1003, "ȫ�浿");

		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);

		
		memberTreeSet.showAllMember();
		
		*/
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		set.add("park");
		set.add("kim");
		set.add("lee");
		
		System.out.println(set); // ������ �������� ������ MyCompare�� ���� ��������
		
	}

}
