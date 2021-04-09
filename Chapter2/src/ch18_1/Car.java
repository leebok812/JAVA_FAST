package ch18_1;

public class Car {
	private static int serialNum = 10000;

	private int CarNum;
	
	
	public static int getSerialNum() {
		return serialNum;
	}

	public Car() {
		serialNum++;
		CarNum = serialNum;
	}
	
	
	public int getCarNum() {
		return CarNum;
	}

	public void setCarNum(int carNum) {
		CarNum = carNum;
	}
	
	
}
