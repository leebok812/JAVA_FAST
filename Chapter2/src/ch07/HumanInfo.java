package ch07;

public class HumanInfo {

	int height;
	int weight;
	String sex;
	String name;
	int age;

	public HumanInfo() {

	}

	public HumanInfo(int height, int weight, String sex, String name, int age) {
		super();
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.name = name;
		this.age = age;
	}

	public String ShowHumanInfo() {
		return "�� ����� Ű�� " + height + " �̰� �����Դ� " + weight + "�̸�, ������" + sex + "�Դϴ�." + "�̸���" + name + "�̰� ���̴�" + age
				+ "�Դϴ�.";
	}

}
