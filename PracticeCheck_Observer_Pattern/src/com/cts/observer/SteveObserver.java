package com.cts.observer;

public class SteveObserver extends INotificationObserver{

	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		this.setName("Steve");
		System.out.println("Notification has been recieved by "+this.getName());
	}

}

