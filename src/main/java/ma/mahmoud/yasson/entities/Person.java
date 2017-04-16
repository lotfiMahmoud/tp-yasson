package ma.mahmoud.yasson.entities;

import java.io.Serializable;

/**
 * The entity used to do a serialization and deserialization of the JSON stream.
 * 
 * @author mahmoud
 *
 */
public class Person implements Serializable {

	private static final long serialVersionUID = 6628654371520256427L;

	// ATTRIBUTES
	private String lastName;
	private String firstName;
	private int age;

	// DEFAULT CONSTRUCTOR
	public Person() {

	}

	// GETTERS AND SETTERS
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + "]";
	}
}
