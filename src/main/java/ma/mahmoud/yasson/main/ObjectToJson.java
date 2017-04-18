package ma.mahmoud.yasson.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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

import ma.mahmoud.yasson.entities.Comment;
import ma.mahmoud.yasson.entities.Pojo;

public class ObjectToJson {

	public static void main(String[] args) {
		// CREATE OBJECT
		Pojo object = new Pojo();
		object.setIsInt(120012);
		object.setIsByte((byte) 25);
		object.setIsChar('M');
		object.setIsDouble(123456.52);
		object.setIsFloat(123456.5F);
		object.setBoolean(true);

		object.setIsString("Je suis une chaine");
		object.setIsDate(new Date());
		object.setIsCalendar(Calendar.getInstance());
		object.setIsLocalDate(LocalDate.now());

		List<Comment> commentsP1 = new ArrayList<>();
		commentsP1.add(new Comment("cmn 1"));
		commentsP1.add(new Comment("cmn 2"));
		commentsP1.add(new Comment("cmn 3"));

		object.setComments(commentsP1);

		// CREATE CONFIG
		JsonbConfig config = new JsonbConfig();
		config.withNullValues(true);
		config.withFormatting(true);

		// If you want to have all the dates with a specific format, you should
		// specify the format in the withDateFormat method by specifying the
		// format and the locality.
		// Uncomment the next line to see the result.

		// config.withDateFormat("dd/MM/yyyy", Locale.FRANCE);

		Jsonb jsonb = JsonbBuilder.create(config);

		// SERIALIZE
		String result = jsonb.toJson(object);

		// DISPALAY JSON
		System.out.println("Object to JSON : \n\n");
		System.out.println(result);
	}
}
