package com.cts.main;

import com.cts.event.Event;
import com.cts.observer.AdminObserver;
import com.cts.observer.INotificationObserver;
import com.cts.service.INotificationService;
import com.cts.service.NotificationService;

public class Main {

	public static void main(String[] args) {

		INotificationObserver admin1 = new AdminObserver("Roe");
		INotificationObserver admin2 = new AdminObserver("Rey");
		
		
		INotificationService service = new NotificationService();
		
		service.Subscribe(admin1);
		service.Subscribe(admin2);
		
		Event event1 = new Event("XYZ Event Company", 110);
		Event event2 = new Event("Plaza Organizers",30);
		
		service.NotifyAdmin(event1); //notified for both admins
									 
		service.NotifyAdmin(event2); //this not printed as tickets sold are 30
		
		service.UnSubscribe(admin1); //admin1 unsubscribes
		
	}

}