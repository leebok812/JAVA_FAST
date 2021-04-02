package ch14_1;

public class TakeTrans {

	public static void main(String[] args) {
		Person Edward = new Person("Edward", 20000);

		Taxi taxi777 = new Taxi("잘 간다 운수택시");

		Edward.takeTaxi(taxi777);
		Edward.showInfo();
		taxi777.showTaxiInfo();

	}

}
