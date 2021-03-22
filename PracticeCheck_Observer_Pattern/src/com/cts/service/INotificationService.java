package com.cts.service;

import com.cts.observer.INotificationObserver;

public interface INotificationService {
	public void AddSubscriber(INotificationObserver iNotificationObserver);
	public void RemoveSubscriber(INotificationObserver iNotificationObserver);
	public void NotifySubscriber();
}
