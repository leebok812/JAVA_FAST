package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10;
		int bNum = 0B1010; // 0B�ڿ� 1010 �̷������� ���� 2���� ǥ���� B �ҹ��ڷ� �ᵵ ����
		int oNum = 012 ; // 0 �ڿ� ���ڸ� �����ϸ� 8���� ǥ����
		int xNum = 0XA; // 0x�ڿ� ���ڸ� �����ϸ� 16���� ǥ���� | ���⼭ A=10�� ���� X �ҹ��ڷ� �ᵵ ����
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}
