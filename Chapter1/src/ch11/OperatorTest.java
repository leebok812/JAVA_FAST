package ch11;

public class OperatorTest {

	public static void main(String[] args) {

		int gameScore = 150;
		
		int lastScore = ++gameScore; // gameScore +=1; gameScore = gameScore+1;
		
		System.out.println(lastScore);
		System.out.println(gameScore);
		
		System.out.println("=================");
		
		int gameScore2 = 150;
		
		int lastScore2 = gameScore2++; // statement �� ���� �Ŀ� �������Ѷ�
		
		System.out.println(lastScore2); //150
		System.out.println(gameScore2); //151
		
		
		
		
	}

}
