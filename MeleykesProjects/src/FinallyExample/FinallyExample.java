package FinallyExample;

public class FinallyExample {
	public static void main(String[] args) {
		try {
			System.out.println("Начало блока try");
			int result = 10 / 2;
			System.out.println("Результат:" + result);
		} catch (Exception e) {
			System.out.println("Ошибка:На ноль делить нельзя");
		} finally {
			System.out.println("Этот блок выполняется всегда!");
		}
		System.out.println("Программа продолжается...");
	}
}
