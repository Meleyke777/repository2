package errors;

public class ErrorsClass {
	public static void main(String[] args) {
		try {
			String n = null;
			System.out.println(n.length());
			int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			System.out.println(number[11]);
			System.out.println(5 / 0);
		}

		catch (NullPointerException e) {
			System.err.println("Ошибка,обращения к null объекту ");
		}

		catch (IndexOutOfBoundsException e) {
			System.err.println("Ошибка,выход за предел массива");
		}

		catch (ArithmeticException e) {
			System.err.println("Ошибка,на ноль не делится");
		}
	}
}