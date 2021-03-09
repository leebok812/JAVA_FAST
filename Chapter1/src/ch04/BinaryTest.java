package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10;
		int bNum = 0B1010; // 0B뒤에 1010 이런식으로 쓰면 2진수 표현법 B 소문자로 써도 무방
		int oNum = 012 ; // 0 뒤에 숫자를 나열하면 8진수 표현법
		int xNum = 0XA; // 0x뒤에 숫자를 나열하면 16진수 표현법 | 여기서 A=10을 뜻함 X 소문자로 써도 무방
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}
