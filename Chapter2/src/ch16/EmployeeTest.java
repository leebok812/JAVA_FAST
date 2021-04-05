package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee(); // 생성자를 따로 만들지 않아도 default 생성자를 사용가능
		employeeLee.setEmployeeName("이순신");

		System.out.println(employeeLee.serialNum); // 초기값 ||노란줄 간 이유: static변수는 클래스 이름을 참조해서 써라 !

		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");

		System.out.println(employeeLee.getEmployeeName() + "님의 사번은" + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은" + employeeKim.getEmployeeId());

	}

}
