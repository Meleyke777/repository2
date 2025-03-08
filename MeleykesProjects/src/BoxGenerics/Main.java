package BoxGenerics;

public class Main {
	public static void main(String[] args) {

		Triple<Integer, String, Double> triple = new Triple<>(1, "Hello", 3.14);

		triple.printTriple();

		triple.setFirst(10);
		triple.setSecond("World");
		triple.setThird(6.28);

		triple.printTriple();
	}
}
