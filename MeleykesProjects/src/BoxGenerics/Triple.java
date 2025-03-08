package BoxGenerics;

public class Triple<T, U, V> {

	private T first;
	private U second;
	private V third;

	public Triple(T first, U second, V third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public void setFirst(int i) {
		this.first = first;
	}

	public void setSecond(String string) {
		this.second = second;
	}

	public void setThird(double d) {
		this.third = third;
	}

	public T getFirst() {
		return first;
	}

	public U getSecond() {
		return second;
	}

	public V getThird() {
		return third;
	}

	public void printTriple() {
		System.out.println("First: " + first + ", Second: " + second + ", Third: " + third);
	}
}
