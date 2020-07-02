
public class Person {

	// TODO

	String name;
	static int count = 0;
	static int getCount(){
		return count;
	}

	public Person(String name) {
		count += 1;
		this.name = name;

	}

}
