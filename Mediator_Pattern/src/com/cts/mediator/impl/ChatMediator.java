package com.cts.mediator.impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.mediator.interfaces.IChatMediator;
import com.cts.mediator.interfaces.IUser;

public class ChatMediator implements IChatMediator{
private List<IUser> users=new ArrayList<>();
	
	@Override
	public void AddUser(IUser user) {
		// TODO Auto-generated method stub
		users.add(user);
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		for(IUser user:users) {
			user.RecieveMessage(message);
		}}
}

