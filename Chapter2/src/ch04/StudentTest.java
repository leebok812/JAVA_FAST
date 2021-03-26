package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();  // Student 가 데이터 타입 studentLee가 변수
	
		studentLee.studentID = 12345;
		studentLee.setStudentName("LEE");
		studentLee.address="서울 노원구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName="KIM";
		studentKim.address ="경기도 성남시";
		
		studentKim.showStudentInfo();
		System.out.println(studentLee); // 두개의 주소값이 다른것을 볼 수 있음
		System.out.println(studentKim); // 두개의 주소값이 다른것을 볼 수 있음
	
	}

}
