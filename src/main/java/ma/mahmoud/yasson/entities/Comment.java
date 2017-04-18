package ma.mahmoud.yasson.entities;

/**
 * This class is used as a comment list for the POJO class.
 * 
 * @author mahmoud
 */
public class Comment {

	// ATTRIBUTES
	private String comment;

	// DEFAULT CONSTRUCTOR
	public Comment() {
	}

	public Comment(String cmnt) {
		comment = cmnt;
	}

	// GETTERS AND SETTERS
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Comment [comment=" + comment + "]";
	}

}
