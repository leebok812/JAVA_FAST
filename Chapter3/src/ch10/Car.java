package ch10;

public abstract class Car {

	public abstract void drive();

	public abstract void stop();

	public abstract void wiper();
	
	
	
	public void startCar() {
		System.out.println("시동을 켭니다.");

	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} // 추상메소드x 구현된 메소드인데 내용이 없는것. 상속받은것에서 재정의 받기 위해 사용
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
}
