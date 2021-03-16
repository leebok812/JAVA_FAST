package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

		byte bNum = 125;
		int iNum = bNum;
		
		int hNum = 255;
		byte cNum = (byte) hNum; // 강제 캐스팅
		
		double dNum = 3.14;
		int kNum = (int) dNum; // 강제 캐스팅
		
		
		System.out.println(iNum);
		
		//======================================
		
		double aNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)aNum + (int)fNum;
		int iNum2 = (int)(aNum+fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		
			
	}

}
