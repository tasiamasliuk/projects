package data;

public class Ticket {
	private static Fly fly;
	private static Passenger passenger;
	
	public Fly getFly() {
		return fly;
	}
	public void setFly(Fly fly) {
		Ticket.fly = fly;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		Ticket.passenger = passenger;
	}
	
	public Ticket() {
		
	}
	
	public Ticket(Fly fly, Passenger passenger) {
		Ticket.fly = fly;
		Ticket.passenger = passenger;
	}

}
