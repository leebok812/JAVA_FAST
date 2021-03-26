package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {} // default생성자를 쓸 수 있게 함
	
	public Student(int studentNumber, String studentName, int grade) {
		//System.out.println("student 생성");
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
		
		
	}
	
	
	public String showStudentInfo() {
		return studentName +"학생의 학번은" + studentNumber +"이고, " +grade +"학년 입니다.";
	}
	
	
	
}
