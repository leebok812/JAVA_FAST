package ch02;

@FunctionalInterface // 이렇게 선언하면 메서드를 두개 달면 안됨.
public interface Add {

	public int add(int x, int y);
}
