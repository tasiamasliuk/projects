package data;

public class Passenger {
	private String passport_seria;
	private int passport_number;
	private String name;
	private String surname;
	private String bitrhday_date;
	
	public String getPassport_seria() {
		return passport_seria;
	}
	public void setPassport_seria(String passport_seria) {
		this.passport_seria = passport_seria;
	}
	public int getPassport_number() {
		return passport_number;
	}
	public void setPassport_number(int passport_number) {
		this.passport_number = passport_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBitrhday_date() {
		return bitrhday_date;
	}
	public void setBitrhday_date(String bitrhday_date) {
		this.bitrhday_date = bitrhday_date;
	}
	
	public Passenger() {
		
	}
	
	public Passenger(String passport_seria, int passport_number, String name, String surname, String bitrhday_date) {
		this.passport_seria = passport_seria;
		this.passport_number = passport_number;
		this.name = name;
		this.surname = surname;
		this.bitrhday_date = bitrhday_date;
	}
}
