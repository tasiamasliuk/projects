package data;

public class Fly {
	private String date_fly;
	private String time_fly;
	private String name_city_from;
	private String name_city_where;
	private double cost;
	
	public String getDate_fly() {
		return date_fly;
	}
	public void setDate_fly(String date_fly) {
		this.date_fly = date_fly;
	}
	public String getTime_fly() {
		return time_fly;
	}
	public void setTime_fly(String time_fly) {
		this.time_fly = time_fly;
	}
	public String getName_city_from() {
		return name_city_from;
	}
	public void setName_city_from(String name_city_from) {
		this.name_city_from = name_city_from;
	}
	public String getName_city_where() {
		return name_city_where;
	}
	public void setName_city_where(String name_city_where) {
		this.name_city_where = name_city_where;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public Fly() {}
	
	public Fly(String date_fly, String time_fly, String name_city_from, String name_city_where, double cost) {
		this.date_fly = date_fly;
		this.time_fly = time_fly;
		this.name_city_from = name_city_from;
		this.name_city_where = name_city_where;
		this.cost = cost;
	}	
}
