package ch07;

public class OrderInfoTest {

	public static void main(String[] args) {

		// OrderInfo or = new
		// OrderInfo(777,0103337777,"����ð�����","20210327","211241",20000,"707");
		OrderInfo or = new OrderInfo();

		or.setOrderNum(111);
		or.setPhoneNum(0107773333);
		or.setAddress("����� ������ �Ｚ��");
		or.setOrderDate("20210327");
		or.setOrderTime("211245");
		or.setOrderPrice(20000);
		or.setOrderNum(888);

		System.out.println("�ֹ� ���� ��ȣ : " + or.orderNum);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + or.phoneNum);
		System.out.println("�ֹ� �� �ּ� : " + or.address);
		System.out.println("�ֹ� ��¥ : " + or.orderDate);
		System.out.println("�ֹ� �ð�  : " + or.orderTime);
		System.out.println("�ֹ� ���� : " + or.orderPrice);
		System.out.println("�޴� ��ȣ : " + or.orderNum);

	}

}
