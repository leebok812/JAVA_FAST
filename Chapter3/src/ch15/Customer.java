package ch15;

public class Customer implements Buy, Sell {// 인터페이스 여러개 구현 가능!

	@Override
	public void sell() {

		System.out.println("customer sell");

	}

	@Override
	public void buy() {

		System.out.println("customer buy");

	}

	@Override
	public void order() {

		System.out.println("customer order");

	}

	public void hello() {
		System.out.println("hello");
	}

}
