package no.hvl.dat108.f04;

/*
 * Person-klasse brukt i alle eksemplene via listen av personer
 * (Charles Dickens & co.) definert i klassen People.
 */
public class Person implements Comparable<Person> {

	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ", alder: " + age;
	}

	@Override
	public int compareTo(Person other) {
		return this.getLastName().compareTo(other.getLastName());
	}
}
