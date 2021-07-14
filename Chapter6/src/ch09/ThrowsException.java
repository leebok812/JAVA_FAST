package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException { // try
																														// catch로
																														// 처리
																														// 하지
																														// 않고
																														// 이
																														// 메서드를
																														// 쓰는
																														// 곳에서
																														// 처리하겠다는
																														// 말

		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;

	}

	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();

		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) { // 위치 중요 !

		}
		System.out.println("End");

	}

}
