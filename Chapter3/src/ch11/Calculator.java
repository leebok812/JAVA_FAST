package ch11;

public abstract class Calculator implements Calc { // 모두다 구현하지 않기때문에 abstract 함

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}



}
