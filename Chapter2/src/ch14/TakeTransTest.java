package ch14;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("JAMES",5000);
		Student studentT = new Student("TOMAS",10000);
		
		Bus bus100 = new Bus(100);
		//Bus bus500 = new Bus(500);
		
		studentJ.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		studentT.takeSubway(greenSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		System.out.println("==================");
		bus100.showBusInfo();
		greenSubway.showBusInfo();
		
		
	}

}
