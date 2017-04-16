package ma.mahmoud.yasson.main;

/**
 * Transform an Object to JSON.
 * 
 * @category Serialize
 * @author mahmoud
 *
 */
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

import ma.mahmoud.yasson.entities.Person;

public class ObjectToJson {

	public static void main(String[] args) {
		// CREATE OBJECT
		Person person = new Person();
		person.setAge(26);
		person.setFirstName("Mahmoud");
		person.setLastName("LOTFI");

		// CREATE CONFIG
		JsonbConfig config = new JsonbConfig();
		config.withNullValues(true);
		config.withFormatting(true);

		Jsonb jsonb = JsonbBuilder.create(config);

		// SERIALIZE
		String result = jsonb.toJson(person);

		// DISPALAY JSON
		System.out.println("Object to JSON : \n\n");
		System.out.println(result);
	}
}
