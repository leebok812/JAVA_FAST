package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {

		int max;
		System.out.println("�� ���� �Է� �޾Ƽ� �� ū ���� ����ϼ���\n");

		Scanner s = new Scanner(System.in);
		System.out.println("�Է� 1:");
		int num1 = s.nextInt();
		System.out.println("�Է� 2:");
		int num2 = s.nextInt();
		
		max = (num1 > num2)? num1 :num2;
		System.out.println(max);
		
		
	}

}
