package com.cts.observer;

public class JohnObserver extends INotificationObserver{

	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		this.setName("John");
		System.out.println("Notification has been recieved by "+this.getName());
	}

}
