package ma.mahmoud.yasson.main;

import java.util.ArrayList;
import java.util.List;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

import ma.mahmoud.yasson.entities.Person;

/**
 * Transform a List of Object to JSON.
 * 
 * @category Serialize
 * @author mahmoud
 *
 */
public class ListToJson {

	public static void main(String[] args) {
		// CREATE TWO OBJECT
		Person p1 = new Person();
		p1.setAge(26);
		p1.setFirstName("Titi");
		p1.setLastName("Tutu");

		Person p2 = new Person();
		p2.setAge(30);
		p2.setFirstName("Toto");
		p2.setLastName("Tata");

		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);

		// CREATE CONFIG
		JsonbConfig config = new JsonbConfig();
		config.withNullValues(true);
		config.withFormatting(true);

		Jsonb jsonb = JsonbBuilder.create(config);

		// SERIALIZE
		String result = jsonb.toJson(persons);

		// DISPALAY JSON
		System.out.println("List to JSON : \n\n");
		System.out.println(result);
	}
}
