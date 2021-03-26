package ch04;

public class TeacherTest {

	public static void main(String[] args) {

			Teacher teacher = new Teacher();
			teacher.teacherID = 77777;
			teacher.teacherName = "JAMES";
			teacher.address = "서울시 강남구";
			
			teacher.showStudentInfo();
	}

}
