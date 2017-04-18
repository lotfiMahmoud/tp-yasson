package ma.mahmoud.yasson.main;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

import ma.mahmoud.yasson.entities.Pojo;

/**
 * Transform a JSON Stream to an Object.
 * 
 * @category Deserialize
 * @author mahmoud
 *
 */
public class JsonToObject {

	public static void main(String[] args) {

		final String jsonStream = "{"
				+ "\"boolean\":true,\"isByte\":25,\"isCalendar\":\"2017-04-16T21:34:35.722+01:00[Africa/Casablanca]\","
				+ "\"isChar\":\"M\",\"isDate\":\"2017-04-16T21:33:54\",\"isDouble\":123456.52,"
				+ "\"isFloat\":123456.5,\"isInt\":120012,\"isLocalDate\":\"2017-04-16\","
				+ "\"isString\":\"Je suis une chaine\",\"comments\":[{\"comment\":\"cmn 1\"},{\"comment\":\"cmn 2\"},{\"comment\":\"cmn 3\"}]}";

		// CREATE CONFIG
		JsonbConfig config = new JsonbConfig();
		config.withNullValues(true);

		Jsonb jsonb = JsonbBuilder.create(config);

		// DESERIALIZE
		Pojo object = jsonb.fromJson(jsonStream, Pojo.class);

		// DISPALAY OBJECT
		System.out.println("JSON to Object : \n\n");
		System.out.println(object);
	}
}
