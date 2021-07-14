package ch10;

public class PassWordTest {

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PassWordException {

		if (password == null) {
			throw new PassWordException("��й�ȣ�� null�� �� �����ϴ�.");
		} else if (password.length() < 5) {
			throw new PassWordException("��й�ȣ�� 5�ڸ� �̻��̾�� �մϴ�.");
		} else if (password.matches("[a-zA-Z]+")) {
			throw new PassWordException("��й�ȣ�� ���ڳ� Ư�����ڸ� �����ؾ� �մϴ�.");
		}

		this.password = password;
	}

	public static void main(String[] args) {

		PassWordTest test = new PassWordTest();

		String password1 = null;

		try {
			test.setPassword(password1);
			System.out.println("��������1");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("========");
		// -----------------------

		String password2 = "abc";

		try {
			test.setPassword(password2);
			System.out.println("��������2");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("========");
		// ----------------------

		String password3 = "abcde";

		try {
			test.setPassword(password3);
			System.out.println("��������3");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("========");
		// ----------------------

		String password4 = "abcde1#";

		try {
			test.setPassword(password4);
			System.out.println("��������4");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
	}
}
