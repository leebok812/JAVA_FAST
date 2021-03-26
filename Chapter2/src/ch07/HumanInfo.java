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
		return "이 사람의 키는 " + height + " 이고 몸무게는 " + weight + "이며, 성별은" + sex + "입니다." + "이름은" + name + "이고 나이는" + age
				+ "입니다.";
	}

}
