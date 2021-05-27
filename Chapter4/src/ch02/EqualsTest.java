package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;

		System.out.println(std1);
		System.out.println(std2);
		System.out.println("===");
		System.out.println(std1 == std2); // 두개는 다른 객체기 때문에 false
		System.out.println(std1.equals(std2)); // equals는 두개의 주소값이 같냐 보는것임 false
												// 하지만 Student에서 equals를 오버라이드 해서 주소값은
												// 다르지만 물리적으로 같기에 true
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

		System.out.println(str1.hashCode()); // 두개가 같은 값이 나옴
		System.out.println(str2.hashCode()); // 두개가 같은 값이 나옴

		Integer i = 100;
		System.out.println(i.hashCode()); // Integer의 hashCode값은 그 정수값 반환
		
		System.out.println("======");
		
		System.out.println();
		System.out.println();
		System.out.println();

		std1.setStudentName("KIM");
		Student copyStudent = (Student)std1.clone();	
		System.out.println(copyStudent);
	}

}
