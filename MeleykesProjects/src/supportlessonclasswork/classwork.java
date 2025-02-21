package supportlessonclasswork;

public class classwork {
	public static void main(String[] args) {
		Person person = new Person("Meleyke", 10);
		Person person2 = new Person("Sultan", 22);
		person.setName("Nara");
		System.out.println(person2.toString());
		System.out.println(person.getName() + " " + person.getAge());
	}
}
