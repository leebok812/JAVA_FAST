package ch02;

public class BinarySearchProblem {

	public static void main(String[] args) {

		int[] numbers = { 12, 25, 31, 48, 54, 66, 70, 83, 95, 108 };

		int target = 83;

		int left = 0;
		int right = numbers.length - 1; // 9
		int mid = (left + right) / 2; // 4  

		int temp = numbers[mid]; //54
		boolean find = false;

		while (left <= right) { // while( 0 <= 9 ) 0..1..2..3..4..5..6..7..8..9

			if (target == temp) { // ���� ã�� ���
				find = true;
				break;
			} else if (target < temp) { // ã������ ���� �� ���� ���
				right = mid - 1;

			} else {
				left = mid + 1;
			}
			mid = (left + right) / 2;
			temp = numbers[mid];
		}

		if (find == true) {
			mid++;
			System.out.println("ã�� ���� " + mid + "��° �ֽ��ϴ�.");
		} else
			System.out.println("ã�� ���� �����ϴ�.");
	}
}