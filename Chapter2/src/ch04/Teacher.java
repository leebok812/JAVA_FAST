package ch04;

public class Teacher {

	public int teacherID;
	public String teacherName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println( teacherID+"���̵��� ������ �̸��� "+teacherName+"�̰�, �ּҴ� "+ address+"�Դϴ�.");
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	
	public void setTeacherName(String name) {
		teacherName = name;
	}
	
	
}
