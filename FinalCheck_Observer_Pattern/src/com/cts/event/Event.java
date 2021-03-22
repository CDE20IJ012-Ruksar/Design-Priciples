package com.cts.event;

public class Event {
	private String name;
	private int ticketsSold;
	
	public Event(String name, int ticketsSold) {
		super();
		this.name = name;
		this.ticketsSold = ticketsSold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketSold(int ticketsSold) {
		this.ticketsSold = ticketsSold;
	}

	@Override
	public String toString() {
		return "Event [name=" + name + ", ticketsSold=" + ticketsSold + "]";
	}
	

}