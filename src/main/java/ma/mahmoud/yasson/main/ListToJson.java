package ma.mahmoud.yasson.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

import ma.mahmoud.yasson.entities.Comment;
import ma.mahmoud.yasson.entities.Pojo;

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
		// p1 with list of comment
		Pojo p1 = new Pojo();
		p1.setIsInt(120012);
		p1.setIsByte((byte) 25);
		p1.setIsChar('M');
		p1.setIsDouble(123456.52);
		p1.setIsFloat(123456.5F);
		p1.setBoolean(true);

		p1.setIsString("Je suis une chaine");
		p1.setIsDate(new Date());
		p1.setIsCalendar(Calendar.getInstance());
		p1.setIsLocalDate(LocalDate.now());

		List<Comment> commentsP1 = new ArrayList<>();
		commentsP1.add(new Comment("cmn 1"));
		commentsP1.add(new Comment("cmn 2"));
		commentsP1.add(new Comment("cmn 3"));

		p1.setComments(commentsP1);

		// p2 without list of comment
		Pojo p2 = new Pojo();
		p2.setIsInt(99);
		p2.setIsByte((byte) 10);
		p2.setIsChar('F');
		p2.setIsDouble(123.52);
		p2.setIsFloat(123.5F);
		p2.setBoolean(false);

		p2.setIsString("Je suis une chaine de caractères	");
		p2.setIsDate(new Date());
		p2.setIsCalendar(Calendar.getInstance());
		p2.setIsLocalDate(LocalDate.now());

		List<Pojo> list = new ArrayList<Pojo>();
		list.add(p1);
		list.add(p2);

		// CREATE CONFIG
		JsonbConfig config = new JsonbConfig();
		config.withNullValues(true);
		config.withFormatting(true);

		Jsonb jsonb = JsonbBuilder.create(config);

		// SERIALIZE
		String result = jsonb.toJson(list);

		// DISPALAY JSON
		System.out.println("List to JSON : \n\n");
		System.out.println(result);
	}
}
