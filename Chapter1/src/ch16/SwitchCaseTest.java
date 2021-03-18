package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int month = s.nextInt();
		int day;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: // 옛날 방식
			day = 31;
			break;
		case 2:
			day = 28;
			break;
//		case 3:
//			day = 31;
//			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
//		case 5:
//			day = 31;
//			break;
//		case 6:
//			day = 30;
//			break;
//		case 7:
//			day = 31;
//			break;
//		case 8:
//			day = 31;
//			break;
//		case 9:
//			day = 30;
//			break;
//		case 10:
//			day = 31;
//			break;
//		case 11:
//			day = 30;
//			break;
//		case 12:
//			day = 31;
//			break;
		default:
			System.out.println("존재 하지 않는 달입니다.");
			day = -1;

		}
			System.out.println(month + "월은 "+ day +"일 입니다.");
	}

}
