package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int month = s.nextInt();

		int day = switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 -> {// 14버전이후로 표현가능 방식
			System.out.println("이번달은 31일까지 입니다.");// 수행과
			yield 31;// 반환값이 같이 있으므로 yield처리한다.
		}// 수행문과 반환을 같이 쓰면 중괄호 처리
		case 2 -> 28;

		case 4, 6, 9, 11 -> 30;

		default -> { // 수행문과 반환을 같이 쓰면 중괄호 처리
			System.out.println("존재 하지 않는 달입니다."); // 수행과
			yield -1; // 반환값이 같이 있으므로 yield처리한다.
		}
		}; // 위에서 int day가 값을 받는다는 의미로 사용되므로 여기서 닫아줘야 오류가 안생긴다.
		System.out.println(month + "월은 " + day + "일 입니다.");
	}

}
