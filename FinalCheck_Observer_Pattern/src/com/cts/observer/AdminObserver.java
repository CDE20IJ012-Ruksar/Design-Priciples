package com.cts.observer;

public class AdminObserver extends INotificationObserver {

	public AdminObserver(String name) {
		this.setName(name);
	}
	@Override
	public void SendNotification(String eventName) {
		System.out.println("Admin "+this.getName() + ":" + eventName + " has more than 100 bookings");
	}
}