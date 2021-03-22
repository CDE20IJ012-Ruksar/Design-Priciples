package com.cts.service;
import java.util.ArrayList;

import com.cts.event.Event;
import com.cts.observer.INotificationObserver;

public class NotificationService implements INotificationService {

	private ArrayList<INotificationObserver> observers=new ArrayList<>();

	@Override
	public void Subscribe(INotificationObserver iNotificationObserver) {
		
		observers.add(iNotificationObserver);
		System.out.println("Admin "+observers+" has subcribed to notification");
	}

	@Override
	public void UnSubscribe(INotificationObserver iNotificationObserver) {
		observers.remove(iNotificationObserver);
		System.out.println("Admin "+observers+" has unsubcribed to notification");
	}

	@Override
	public void NotifyAdmin(Event event) {
		if (event.getTicketsSold() >= 100) {
			for (INotificationObserver o : observers) {
				o.SendNotification(event.getName());
			}
		}
	}

}