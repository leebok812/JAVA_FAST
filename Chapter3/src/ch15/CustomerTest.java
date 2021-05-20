package ch15;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();

		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();

		System.out.println("===============");

		Buy buyer = customer; // Buy 에서 정의된 메서드만 사용가능
		buyer.buy();
		buyer.order();

		System.out.println("===============");

		Sell seller = customer; // Sell 에서 정의된 메서드만 사용가능
		seller.sell();
		seller.order();
	}

}
