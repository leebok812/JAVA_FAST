package ch01;

class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OutClass() {
		inClass = new InClass();
	}

	private class InClass {

		int iNum = 100;

		// static int sInNum = 500; 사용불가 // 정적내부 클래스에서 사용가능

		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}

	public void usingClass() {
		inClass.inTest();
	}

	static class InStaticClass {

		int iNum = 100;
		static int sInNum = 200;

		void inTest() {
			System.out.println("InClass num = " + iNum + "(내부클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sNum = " + sInNum + "(내부 클래스의 스태틱 변수)");

		}

		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		outClass.usingClass();
		System.out.println("===============");
		// OutClass.InClass inner = outClass.new InClass(); // InClass를 private으로 쓰면 이렇게
		// 사용불가
		// inner.inTest();
		System.out.println("===============");
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		System.out.println("===============");
		OutClass.InStaticClass.sTest();

	}

}
