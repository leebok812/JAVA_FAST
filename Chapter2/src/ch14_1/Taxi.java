package ch14_1;

public class Taxi {
	int taxiNumber;
	int passengerCount;
	int money;
	
	String taxiName;

	public Taxi(String taxiName) {
		this.taxiName = taxiName;

	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showTaxiInfo() {
		System.out.println(taxiName + " ������ " + money + "�� �Դϴ�.");
	}
}
