package ch06;

public class VariableTest {

	public static void main(String[] args) {
		byte fromBNum = -128;
		byte toBNum = 127;
		System.out.println("byte : "+fromBNum+"~"+toBNum);
		
		//int num = 12345678900; int 의 가능 범위 넘어가서 오류 발생!
		long lNum = 12345678900L;
		System.out.println(lNum);
		
	}

}
