package ch02;

public class AddTest {

	public static void main(String[] args) {

		Add addL = (x, y) -> {
			return x + y;
		};
		// Add addL = (x,y)-> x+y; 위와 같은 의미

		System.out.println(addL.add(2, 3));

	}

}
