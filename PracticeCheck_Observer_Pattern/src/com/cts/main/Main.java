package com.cts.main;

import com.cts.observer.INotificationObserver;
import com.cts.observer.JohnObserver;
import com.cts.observer.SteveObserver;
import com.cts.service.INotificationService;
import com.cts.service.NotificationService;

public class Main {
	public static void main(String[] args) {
	INotificationObserver john = new JohnObserver();
	INotificationObserver steve = new SteveObserver();
	INotificationService iNotificationService = new NotificationService();
	iNotificationService.AddSubscriber(steve);
	iNotificationService.AddSubscriber(john);
	iNotificationService.NotifySubscriber();
	iNotificationService.RemoveSubscriber(steve);
}
}