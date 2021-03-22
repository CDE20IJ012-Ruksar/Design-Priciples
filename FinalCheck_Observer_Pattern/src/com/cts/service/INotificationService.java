package com.cts.service;

import com.cts.event.Event;
import com.cts.observer.INotificationObserver;

public interface INotificationService {
	
	public void Subscribe(INotificationObserver observer);
	public void UnSubscribe(INotificationObserver observer);
	public void NotifyAdmin(Event event);
	
}
