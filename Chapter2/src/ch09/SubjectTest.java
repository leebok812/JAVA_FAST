package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");

		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 99);

		Student studentKim = new Student(88, "kim");

		studentKim.setKoreaSubject("����", 77);
		studentKim.setMathSubject("����", 66);

		studentLee.showScore();
		System.out.println("===================");
		studentKim.showScore();

	}

}
