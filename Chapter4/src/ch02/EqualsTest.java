package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;

		System.out.println(std1);
		System.out.println(std2);
		System.out.println("===");
		System.out.println(std1 == std2); // �ΰ��� �ٸ� ��ü�� ������ false
		System.out.println(std1.equals(std2)); // equals�� �ΰ��� �ּҰ��� ���� ���°��� false
												// ������ Student���� equals�� �������̵� �ؼ� �ּҰ���
												// �ٸ����� ���������� ���⿡ true
		System.out.println(std1 == std3); // true

		System.out.println("====");

		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());

		System.out.println("====");

		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		System.out.println();
		System.out.println();
		System.out.println();
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2)); // true

		System.out.println(str1.hashCode()); // �ΰ��� ���� ���� ����
		System.out.println(str2.hashCode()); // �ΰ��� ���� ���� ����

		Integer i = 100;
		System.out.println(i.hashCode()); // Integer�� hashCode���� �� ������ ��ȯ
		
		System.out.println("======");
		
		System.out.println();
		System.out.println();
		System.out.println();

		std1.setStudentName("KIM");
		Student copyStudent = (Student)std1.clone();	
		System.out.println(copyStudent);
	}

}
