package CheckAge;

public class CheckAge {
	public static void CheckAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Возраст должен быть больше 18");
		}
		System.out.println("Возраст разрешен");
	}
}
