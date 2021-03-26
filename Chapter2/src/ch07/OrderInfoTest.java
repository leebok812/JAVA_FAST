package ch07;

public class OrderInfoTest {

	public static void main(String[] args) {

		// OrderInfo or = new
		// OrderInfo(777,0103337777,"서울시강남구","20210327","211241",20000,"707");
		OrderInfo or = new OrderInfo();

		or.setOrderNum(111);
		or.setPhoneNum(0107773333);
		or.setAddress("서울시 강남구 삼성동");
		or.setOrderDate("20210327");
		or.setOrderTime("211245");
		or.setOrderPrice(20000);
		or.setOrderNum(888);

		System.out.println("주문 접수 번호 : " + or.orderNum);
		System.out.println("주문 핸드폰 번호 : " + or.phoneNum);
		System.out.println("주문 집 주소 : " + or.address);
		System.out.println("주문 날짜 : " + or.orderDate);
		System.out.println("주문 시간  : " + or.orderTime);
		System.out.println("주문 가격 : " + or.orderPrice);
		System.out.println("메뉴 번호 : " + or.orderNum);

	}

}
