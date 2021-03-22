package com.cts.mediator.impl;

import com.cts.mediator.interfaces.IChatMediator;
import com.cts.mediator.interfaces.IUser;

public class BasicUser implements IUser{
	IChatMediator iChatMediator;
	String name;
	public BasicUser() {
		super();
	}

	public BasicUser(IChatMediator iChatMediator, String name) {
		super();
		this.iChatMediator = iChatMediator;
		this.name = name;
	}

	@Override
	public void RecieveMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("User name is:"+name+ " Message is:"+message);
		
	}
	@Override
	public void SendMessage(String message) {
		// TODO Auto-generated method stub
		iChatMediator.sendMessage(message);
		
	}

}
