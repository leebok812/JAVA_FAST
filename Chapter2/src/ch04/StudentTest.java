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
	
	}

}
