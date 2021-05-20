package ch15;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();

		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();

		System.out.println("===============");

		Buy buyer = customer; // Buy ���� ���ǵ� �޼��常 ��밡��
		buyer.buy();
		buyer.order();

		System.out.println("===============");

		Sell seller = customer; // Sell ���� ���ǵ� �޼��常 ��밡��
		seller.sell();
		seller.order();
	}

}
