package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();  // Student �� ������ Ÿ�� studentLee�� ����
	
		studentLee.studentID = 12345;
		studentLee.setStudentName("LEE");
		studentLee.address="���� �����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName="KIM";
		studentKim.address ="��⵵ ������";
		
		studentKim.showStudentInfo();
		System.out.println(studentLee); // �ΰ��� �ּҰ��� �ٸ����� �� �� ����
		System.out.println(studentKim); // �ΰ��� �ּҰ��� �ٸ����� �� �� ����
	
	}

}
