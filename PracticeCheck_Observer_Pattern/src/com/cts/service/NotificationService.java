package com.cts.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.observer.INotificationObserver;

public class NotificationService implements INotificationService{
	List<INotificationObserver> observer=new ArrayList<INotificationObserver>();
	@Override
	public void AddSubscriber(INotificationObserver iNotificationObserver) {
		// TODO Auto-generated method stub
		observer.add(iNotificationObserver);
		System.out.println("Observers are: "+observer);
	}

	@Override
	public void RemoveSubscriber(INotificationObserver iNotificationObserver) {
		// TODO Auto-generated method stub
		observer.remove(iNotificationObserver);
		System.out.println("Observer is removed: "+observer);
	}

	@Override
	public void NotifySubscriber() {
		// TODO Auto-generated method stub
		for(INotificationObserver o : observer) {
			o.OnServerDown();
		}
	}

}
