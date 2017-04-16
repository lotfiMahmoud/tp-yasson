package ma.mahmoud.yasson.main;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

import ma.mahmoud.yasson.entities.Person;

/**
 * Transform a JSON Stream to an Object.
 * 
 * @category Deserialize
 * @author mahmoud
 *
 */
public class JsonToObject {

	public static void main(String[] args) {

		final String jsonStream = "{\"age\":26,\"firstName\":\"Mahmoud\",\"lastName\":\"LOTFI\"}";

		// CREATE CONFIG
		JsonbConfig config = new JsonbConfig();
		config.withNullValues(true);

		Jsonb jsonb = JsonbBuilder.create(config);

		// DESERIALIZE
		Person person = jsonb.fromJson(jsonStream, Person.class);

		// DISPALAY OBJECT
		System.out.println("JSON to Object : \n\n");
		System.out.println(person);
	}
}
