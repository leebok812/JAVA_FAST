package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int month = s.nextInt();

		int day = switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 -> {// 14�������ķ� ǥ������ ���
			System.out.println("�̹����� 31�ϱ��� �Դϴ�.");// �����
			yield 31;// ��ȯ���� ���� �����Ƿ� yieldó���Ѵ�.
		}// ���๮�� ��ȯ�� ���� ���� �߰�ȣ ó��
		case 2 -> 28;

		case 4, 6, 9, 11 -> 30;

		default -> { // ���๮�� ��ȯ�� ���� ���� �߰�ȣ ó��
			System.out.println("���� ���� �ʴ� ���Դϴ�."); // �����
			yield -1; // ��ȯ���� ���� �����Ƿ� yieldó���Ѵ�.
		}
		}; // ������ int day�� ���� �޴´ٴ� �ǹ̷� ���ǹǷ� ���⼭ �ݾ���� ������ �Ȼ����.
		System.out.println(month + "���� " + day + "�� �Դϴ�.");
	}

}
