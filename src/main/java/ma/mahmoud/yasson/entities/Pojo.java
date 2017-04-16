package ma.mahmoud.yasson.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * The entity used to do a serialization and deserialization of the JSON stream.
 * 
 * @author mahmoud
 *
 */
public class Pojo implements Serializable {

	private static final long serialVersionUID = 6628654371520256427L;

	// ATTRIBUTES
	private int isInt;
	private float isFloat;
	private double isDouble;
	private byte isByte;
	private char isChar;
	private boolean isBoolean;

	private String isString;
	private Date isDate;
	private Calendar isCalendar;
	private LocalDate isLocalDate;

	// DEFAULT CONSTRUCTOR
	public Pojo() {
	}

	// GETTERS AND SETTERS
	public int getIsInt() {
		return isInt;
	}

	public void setIsInt(int isInt) {
		this.isInt = isInt;
	}

	public float getIsFloat() {
		return isFloat;
	}

	public void setIsFloat(float isFloat) {
		this.isFloat = isFloat;
	}

	public double getIsDouble() {
		return isDouble;
	}

	public void setIsDouble(double isDouble) {
		this.isDouble = isDouble;
	}

	public byte getIsByte() {
		return isByte;
	}

	public void setIsByte(byte isByte) {
		this.isByte = isByte;
	}

	public char getIsChar() {
		return isChar;
	}

	public void setIsChar(char isChar) {
		this.isChar = isChar;
	}

	public boolean isBoolean() {
		return isBoolean;
	}

	public void setBoolean(boolean isBoolean) {
		this.isBoolean = isBoolean;
	}

	public String getIsString() {
		return isString;
	}

	public void setIsString(String isString) {
		this.isString = isString;
	}

	public Date getIsDate() {
		return isDate;
	}

	public void setIsDate(Date isDate) {
		this.isDate = isDate;
	}

	public Calendar getIsCalendar() {
		return isCalendar;
	}

	public void setIsCalendar(Calendar isCalendar) {
		this.isCalendar = isCalendar;
	}

	public LocalDate getIsLocalDate() {
		return isLocalDate;
	}

	public void setIsLocalDate(LocalDate isLocalDate) {
		this.isLocalDate = isLocalDate;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Pojo [isInt=" + isInt + ", isFloat=" + isFloat + ", isDouble=" + isDouble + ", isByte=" + isByte
				+ ", isChar=" + isChar + ", isBoolean=" + isBoolean + ", isString=" + isString + ", isDate=" + isDate
				+ ", isCalendar=" + isCalendar + ", isLocalDate=" + isLocalDate + "]";
	}

}
