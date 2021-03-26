package ch04;

public class Teacher {

	public int teacherID;
	public String teacherName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println( teacherID+"아이디의 선생님 이름은 "+teacherName+"이고, 주소는 "+ address+"입니다.");
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	
	public void setTeacherName(String name) {
		teacherName = name;
	}
	
	
}
