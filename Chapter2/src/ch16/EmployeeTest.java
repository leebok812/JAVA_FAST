package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee(); // �����ڸ� ���� ������ �ʾƵ� default �����ڸ� ��밡��
		employeeLee.setEmployeeName("�̼���");

		System.out.println(employeeLee.serialNum); // �ʱⰪ ||����� �� ����: static������ Ŭ���� �̸��� �����ؼ� ��� !

		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");

		System.out.println(employeeLee.getEmployeeName() + "���� �����" + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "���� �����" + employeeKim.getEmployeeId());

	}

}
